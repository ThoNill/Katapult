package zelte;

import javax.money.MonetaryAmount;

import entities.RechnungKopf;
import entities.RechnungPosition;
import repositories.RechnungKopfRepository;
import tho.nill.verordnungen.simpleAttributes.IK;

public class RechnungKopfZelt extends StandardZelt {


	private RechnungKopf entity;

	private RechnungKopfRepository repo;

	public RechnungKopfZelt(RechnungKopfRepository repo) {
		super();
		this.repo = repo;
	}


	public void save() {
		if (entity != null ) {
			entity = repo.saveAndFlush(entity);
		}
	}


	public void saveIfNeeded() {
		if (entity != null && entity.getRechnungKopfId() == null) {
			entity = repo.saveAndFlush(entity);
		}
	}

	public void load(Long id) {
         entity = repo.getOne(id);
	}	


	public void create() {
		entity = new RechnungKopf();
	}


	public RechnungKopf getEntity() {
		return entity;
	}

	public void setEntity(RechnungKopf entity) {
         this.entity = entity;
	}	


    public java.lang.Long getRechnungKopfId() {
			return entity.getRechnungKopfId();    
    }

         


     	    public IK getVersichertenKarteIk() {
     	         return entity.getVersichertenKarteIk(); 
     	    }
     	    public void setVersichertenKarteIkWithString(String value) {
     	        	entity.setVersichertenKarteIk(convertToIK( value));
     	        }
         


     	    public IK getKostenträgerIk() {
     	         return entity.getKostenträgerIk(); 
     	    }
     	    public void setKostenträgerIkWithString(String value) {
     	        	entity.setKostenträgerIk(convertToIK( value));
     	        }
         


     	    public IK getPapierIk() {
     	         return entity.getPapierIk(); 
     	    }
     	    public void setPapierIkWithString(String value) {
     	        	entity.setPapierIk(convertToIK( value));
     	        }
         


     	    public IK getPrüfstelleIk() {
     	         return entity.getPrüfstelleIk(); 
     	    }
     	    public void setPrüfstelleIkWithString(String value) {
     	        	entity.setPrüfstelleIk(convertToIK( value));
     	        }
         


     	    public IK getDatenannahmeIk() {
     	         return entity.getDatenannahmeIk(); 
     	    }
     	    public void setDatenannahmeIkWithString(String value) {
     	        	entity.setDatenannahmeIk(convertToIK( value));
     	        }
         


     	    public IK getImage_prüfstelleIk() {
     	         return entity.getImage_prüfstelleIk(); 
     	    }
     	    public void setImage_prüfstelleIkWithString(String value) {
     	        	entity.setImage_prüfstelleIk(convertToIK( value));
     	        }
         


     	    public IK getImage_datenanahmeIk() {
     	         return entity.getImage_datenanahmeIk(); 
     	    }
     	    public void setImage_datenanahmeIkWithString(String value) {
     	        	entity.setImage_datenanahmeIk(convertToIK( value));
     	        }
         


     	    public MonetaryAmount getZahlBetrag() {
     	         return entity.getZahlBetrag(); 
     	    }
     	    public void setZahlBetragWithString(String value) {
     	        	entity.setZahlBetrag(convertToMonetaryAmount( value));
     	        }
         


     	    public MonetaryAmount getZuzahlungBetrag() {
     	         return entity.getZuzahlungBetrag(); 
     	    }
     	    public void setZuzahlungBetragWithString(String value) {
     	        	entity.setZuzahlungBetrag(convertToMonetaryAmount( value));
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
         


     	    public MonetaryAmount getSkontoBetrag() {
     	         return entity.getSkontoBetrag(); 
     	    }
     	    public void setSkontoBetragWithString(String value) {
     	        	entity.setSkontoBetrag(convertToMonetaryAmount( value));
     	        }
         




     	    public void connectRechnungKopf(RechnungPositionZelt x) {

     	        if (entity!=null) {
     	        	saveIfNeeded();
     	        	x.saveIfNeeded();

     	        	RechnungPosition target = x.getEntity();
     	        	entity.addRechnungPosition(target);
     	        	target.setRechnungKopf(entity);

     	        	saveIfNeeded();
     	        	x.saveIfNeeded();
     	        };

     	    }


     	    public void disconnectRechnungKopf(RechnungPositionZelt x) {
     	      if (entity!=null) {
     	        RechnungPosition target = x.getEntity();
     	        entity.removeRechnungPosition(target);
     	        target.setRechnungKopf(null);

     	        saveIfNeeded();
     	        x.saveIfNeeded();
     	      };
     	    }


}


