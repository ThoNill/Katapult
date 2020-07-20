package zelte;

import entities.VersandZiel;
import repositories.VersandZielRepository;
import tho.nill.kassenversand.simpleAttributes.Abrechnungscode;
import tho.nill.kassenversand.simpleAttributes.Bundesland;
import tho.nill.kassenversand.simpleAttributes.DFÜMedium;
import tho.nill.kassenversand.simpleAttributes.DatenlieferungsArt;
import tho.nill.kassenversand.simpleAttributes.IK;
import tho.nill.kassenversand.simpleAttributes.KVBezirk;
import tho.nill.kassenversand.simpleAttributes.Leistungserbringergruppe;
import tho.nill.kassenversand.simpleAttributes.Tarifkennzeichen;
import tho.nill.kassenversand.simpleAttributes.VerweisArt;

public class VersandZielZelt extends StandardZelt {


	private VersandZiel entity;

	private VersandZielRepository repo;

	public VersandZielZelt(VersandZielRepository repo) {
		super();
		this.repo = repo;
	}


	public void save() {
		if (entity != null ) {
			entity = repo.saveAndFlush(entity);
		}
	}


	public void saveIfNeeded() {
		if (entity != null && entity.getVersandZielId() == null) {
			entity = repo.saveAndFlush(entity);
		}
	}

	public void load(Long id) {
         entity = repo.getOne(id);
	}	


	public void create() {
		entity = new VersandZiel();
	}


	public VersandZiel getEntity() {
		return entity;
	}

	public void setEntity(VersandZiel entity) {
         this.entity = entity;
	}	


    public java.lang.Long getVersandZielId() {
			return entity.getVersandZielId();    
    }

         


     	    public IK getVon_ik() {
     	         return entity.getVon_ik(); 
     	    }
     	    public void setVon_ikWithString(String value) {
     	        	entity.setVon_ik(convertToIK( value));
     	        }
         


     	    public IK getNach_ik() {
     	         return entity.getNach_ik(); 
     	    }
     	    public void setNach_ikWithString(String value) {
     	        	entity.setNach_ik(convertToIK( value));
     	        }
         


     	    public IK getKostenträger() {
     	         return entity.getKostenträger(); 
     	    }
     	    public void setKostenträgerWithString(String value) {
     	        	entity.setKostenträger(convertToIK( value));
     	        }
         


     	    public DatenlieferungsArt getArt() {
     	         return entity.getArt(); 
     	    }
     	    public void setArtWithString(String value) {
     	        	entity.setArt(convertToDatenlieferungsArt( value));
     	        }

     	   public DatenlieferungsArt convertToDatenlieferungsArt(String value) {
     					return DatenlieferungsArt.search(value);
     				}   


     	    public VerweisArt getVerweis() {
     	         return entity.getVerweis(); 
     	    }
     	    public void setVerweisWithString(String value) {
     	        	entity.setVerweis(convertToVerweisArt( value));
     	        }

     	   public VerweisArt convertToVerweisArt(String value) {
     					return VerweisArt.search(value);
     				}   


     	    public DFÜMedium getMedium() {
     	         return entity.getMedium(); 
     	    }
     	    public void setMediumWithString(String value) {
     	        	entity.setMedium(convertToDFÜMedium( value));
     	        }

     	   public DFÜMedium convertToDFÜMedium(String value) {
     					return DFÜMedium.search(value);
     				}   


     	    public Bundesland getLand() {
     	         return entity.getLand(); 
     	    }
     	    public void setLandWithString(String value) {
     	        	entity.setLand(convertToBundesland( value));
     	        }

     	   public Bundesland convertToBundesland(String value) {
     					return Bundesland.search(value);
     				}   


     	    public KVBezirk getBezirk() {
     	         return entity.getBezirk(); 
     	    }
     	    public void setBezirkWithString(String value) {
     	        	entity.setBezirk(convertToKVBezirk( value));
     	        }

     	   public KVBezirk convertToKVBezirk(String value) {
     					return KVBezirk.search(value);
     				}   


     	    public LeistungserbringerCode getAbrechnungscode() {
     	         return entity.getAbrechnungscode(); 
     	    }
     	    public void setAbrechnungscodeWithString(String value) {
     	        	entity.setAbrechnungscode(convertToAbrechnungscode( value));
     	        }

     	   public LeistungserbringerCode convertToAbrechnungscode(String value) {
     					return LeistungserbringerCode.search(value);
     				}   


     	    public Tarifkennzeichen getTarifkennzeichen() {
     	         return entity.getTarifkennzeichen(); 
     	    }
     	    public void setTarifkennzeichenWithString(String value) {
     	        	entity.setTarifkennzeichen(convertToTarifkennzeichen( value));
     	        }
         


     	    public Leistungserbringergruppe getLeistungserbringergruppe() {
     	         return entity.getLeistungserbringergruppe(); 
     	    }
     	    public void setLeistungserbringergruppeWithString(String value) {
     	        	entity.setLeistungserbringergruppe(convertToLeistungserbringergruppe( value));
     	        }

     	   public Leistungserbringergruppe convertToLeistungserbringergruppe(String value) {
     					return Leistungserbringergruppe.search(value);
     				}   


}


