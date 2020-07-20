package zelte;

import javax.money.MonetaryAmount;

import entities.RechnungPosition;
import repositories.RechnungPositionRepository;
import tho.nill.verordnungen.simpleAttributes.MwstArt;

public class RechnungPositionZelt extends StandardZelt {


	private RechnungPosition entity;

	private RechnungPositionRepository repo;

	public RechnungPositionZelt(RechnungPositionRepository repo) {
		super();
		this.repo = repo;
	}


	public void save() {
		if (entity != null ) {
			entity = repo.saveAndFlush(entity);
		}
	}


	public void saveIfNeeded() {
		if (entity != null && entity.getRechnungPositionId() == null) {
			entity = repo.saveAndFlush(entity);
		}
	}

	public void load(Long id) {
         entity = repo.getOne(id);
	}	


	public void create() {
		entity = new RechnungPosition();
	}


	public RechnungPosition getEntity() {
		return entity;
	}

	public void setEntity(RechnungPosition entity) {
         this.entity = entity;
	}	


    public java.lang.Long getRechnungPositionId() {
			return entity.getRechnungPositionId();    
    }

         


     	    public MonetaryAmount getZahlBetrag() {
     	         return entity.getZahlBetrag(); 
     	    }
     	    public void setZahlBetragWithString(String value) {
     	        	entity.setZahlBetrag(convertToMonetaryAmount( value));
     	        }
         


     	    public MonetaryAmount getBruttoBetrag() {
     	         return entity.getBruttoBetrag(); 
     	    }
     	    public void setBruttoBetragWithString(String value) {
     	        	entity.setBruttoBetrag(convertToMonetaryAmount( value));
     	        }
         


     	    public MwstArt getMwstArt() {
     	         return entity.getMwstArt(); 
     	    }
     	    public void setMwstArtWithString(String value) {
     	        	entity.setMwstArt(convertToMwstArt( value));
     	        }

     	   public MwstArt convertToMwstArt(String value) {
     					return MwstArt.search(value);
     				}   


     	    public MonetaryAmount getMwstBetrag() {
     	         return entity.getMwstBetrag(); 
     	    }
     	    public void setMwstBetragWithString(String value) {
     	        	entity.setMwstBetrag(convertToMonetaryAmount( value));
     	        }
         


     	    public MonetaryAmount getRabattBetrag() {
     	         return entity.getRabattBetrag(); 
     	    }
     	    public void setRabattBetragWithString(String value) {
     	        	entity.setRabattBetrag(convertToMonetaryAmount( value));
     	        }
         


     	    public MonetaryAmount getZuzahlungBetrag() {
     	         return entity.getZuzahlungBetrag(); 
     	    }
     	    public void setZuzahlungBetragWithString(String value) {
     	        	entity.setZuzahlungBetrag(convertToMonetaryAmount( value));
     	        }
         


     	    public MonetaryAmount getZuzahlungMwstBetrag() {
     	         return entity.getZuzahlungMwstBetrag(); 
     	    }
     	    public void setZuzahlungMwstBetragWithString(String value) {
     	        	entity.setZuzahlungMwstBetrag(convertToMonetaryAmount( value));
     	        }
         


}


