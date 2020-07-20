package zelte;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Enumerated;
import javax.persistence.Lob;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import org.springframework.beans.factory.annotation.Autowired;
import entities.*;

    import tho.nill.verordnungen.simpleAttributes.LeistungserbringerCode;


    import entities.Leistungserbringer;
    import repositories.LeistungserbringerRepository;

    import entities.Kunde;
    import repositories.KundeRepository;

    import entities.Leistungserbringer;
    import zelte.LeistungserbringerZelt;
    import entities.Leistungserbringer;
    import repositories.LeistungserbringerRepository;

    import entities.RechnungPosition;
    import zelte.RechnungPositionZelt;
    import entities.Leistungserbringer;
    import repositories.LeistungserbringerRepository;

    import entities.Verordnung302Kopf;
    import zelte.Verordnung302KopfZelt;


import zelte.StandardZelt;

public class LeistungserbringerZelt extends StandardZelt {


	private Leistungserbringer entity;

	private LeistungserbringerRepository repo;

	public LeistungserbringerZelt(LeistungserbringerRepository repo) {
		super();
		this.repo = repo;
	}


	public void save() {
		if (entity != null ) {
			entity = repo.saveAndFlush(entity);
		}
	}


	public void saveIfNeeded() {
		if (entity != null && entity.getLeistungserbringerId() == null) {
			entity = repo.saveAndFlush(entity);
		}
	}

	public void load(Long id) {
         entity = repo.getOne(id);
	}	


	public void create() {
		entity = new Leistungserbringer();
	}


	public Leistungserbringer getEntity() {
		return entity;
	}

	public void setEntity(Leistungserbringer entity) {
         this.entity = entity;
	}	


    public java.lang.Long getLeistungserbringerId() {
			return entity.getLeistungserbringerId();    
    }

         


     	    public LeistungserbringerCode getLeistungserbringercode() {
     	         return entity.getLeistungserbringercode(); 
     	    }
     	    public void setLeistungserbringercodeWithString(String value) {
     	        	entity.setLeistungserbringercode(convertToLeistungserbringerCode( value));
     	        }

     	   public LeistungserbringerCode convertToLeistungserbringerCode(String value) {
     					return LeistungserbringerCode.search(value);
     				}   

         




     	    public void connectLeistungserbringer(RechnungPositionZelt x) {

     	        if (entity!=null) {
     	        	saveIfNeeded();
     	        	x.saveIfNeeded();

     	        	RechnungPosition target = x.getEntity();
     	        	entity.addRechnungPosition(target);
     	        	target.setLeistungserbringer(entity);

     	        	saveIfNeeded();
     	        	x.saveIfNeeded();
     	        };

     	    }


     	    public void disconnectLeistungserbringer(RechnungPositionZelt x) {
     	      if (entity!=null) {
     	        RechnungPosition target = x.getEntity();
     	        entity.removeRechnungPosition(target);
     	        target.setLeistungserbringer(null);

     	        saveIfNeeded();
     	        x.saveIfNeeded();
     	      };
     	    }

         




     	    public void connectLeistungserbringer(Verordnung302KopfZelt x) {

     	        if (entity!=null) {
     	        	saveIfNeeded();
     	        	x.saveIfNeeded();

     	        	Verordnung302Kopf target = x.getEntity();
     	        	entity.addVerordnung302Kopf(target);
     	        	target.setLeistungserbringer(entity);

     	        	saveIfNeeded();
     	        	x.saveIfNeeded();
     	        };

     	    }


     	    public void disconnectLeistungserbringer(Verordnung302KopfZelt x) {
     	      if (entity!=null) {
     	        Verordnung302Kopf target = x.getEntity();
     	        entity.removeVerordnung302Kopf(target);
     	        target.setLeistungserbringer(null);

     	        saveIfNeeded();
     	        x.saveIfNeeded();
     	      };
     	    }


}


