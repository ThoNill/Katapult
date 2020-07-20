package zelte;

import javax.money.MonetaryAmount;

import entities.Verordnung302Kopf;
import entities.Verordnung302Position;
import repositories.Verordnung302KopfRepository;
import tho.nill.verordnungen.simpleAttributes.IK;

public class Verordnung302KopfZelt extends StandardZelt {


	private Verordnung302Kopf entity;

	private Verordnung302KopfRepository repo;

	public Verordnung302KopfZelt(Verordnung302KopfRepository repo) {
		super();
		this.repo = repo;
	}


	public void save() {
		if (entity != null ) {
			entity = repo.saveAndFlush(entity);
		}
	}


	public void saveIfNeeded() {
		if (entity != null && entity.getVerordnung302KopfId() == null) {
			entity = repo.saveAndFlush(entity);
		}
	}

	public void load(Long id) {
         entity = repo.getOne(id);
	}	


	public void create() {
		entity = new Verordnung302Kopf();
	}


	public Verordnung302Kopf getEntity() {
		return entity;
	}

	public void setEntity(Verordnung302Kopf entity) {
         this.entity = entity;
	}	


    public java.lang.Long getVerordnung302KopfId() {
			return entity.getVerordnung302KopfId();    
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
         




     	    public void connectVerordnung302Kopf(Verordnung302PositionZelt x) {

     	        if (entity!=null) {
     	        	saveIfNeeded();
     	        	x.saveIfNeeded();

     	        	Verordnung302Position target = x.getEntity();
     	        	entity.addVerordnung302Position(target);
     	        	target.setVerordnung302Kopf(entity);

     	        	saveIfNeeded();
     	        	x.saveIfNeeded();
     	        };

     	    }


     	    public void disconnectVerordnung302Kopf(Verordnung302PositionZelt x) {
     	      if (entity!=null) {
     	        Verordnung302Position target = x.getEntity();
     	        entity.removeVerordnung302Position(target);
     	        target.setVerordnung302Kopf(null);

     	        saveIfNeeded();
     	        x.saveIfNeeded();
     	      };
     	    }


}


