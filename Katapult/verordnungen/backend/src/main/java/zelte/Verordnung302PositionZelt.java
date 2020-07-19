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

    import java.lang.String;


    import entities.Verordnung302Position;
    import repositories.Verordnung302PositionRepository;
    import javax.money.MonetaryAmount;


    import entities.Verordnung302Position;
    import repositories.Verordnung302PositionRepository;
    import javax.money.MonetaryAmount;


    import entities.Verordnung302Position;
    import repositories.Verordnung302PositionRepository;
    import tho.nill.verordnungen.simpleAttributes.MwstArt;


    import entities.Verordnung302Position;
    import repositories.Verordnung302PositionRepository;
    import javax.money.MonetaryAmount;


    import entities.Verordnung302Position;
    import repositories.Verordnung302PositionRepository;
    import javax.money.MonetaryAmount;


    import entities.Verordnung302Position;
    import repositories.Verordnung302PositionRepository;
    import javax.money.MonetaryAmount;


    import entities.Verordnung302Position;
    import repositories.Verordnung302PositionRepository;
    import javax.money.MonetaryAmount;


    import entities.Verordnung302Position;
    import repositories.Verordnung302PositionRepository;

    import entities.Verordnung302Kopf;
    import repositories.Verordnung302KopfRepository;

    import entities.Verordnung302Position;
    import zelte.Verordnung302PositionZelt;


import zelte.StandardZelt;

public class Verordnung302PositionZelt extends StandardZelt {


	private Verordnung302Position entity;

	private Verordnung302PositionRepository repo;

	public Verordnung302PositionZelt(Verordnung302PositionRepository repo) {
		super();
		this.repo = repo;
	}


	public void save() {
		if (entity != null ) {
			entity = repo.saveAndFlush(entity);
		}
	}


	public void saveIfNeeded() {
		if (entity != null && entity.getVerordnung302PositionId() == null) {
			entity = repo.saveAndFlush(entity);
		}
	}

	public void load(Long id) {
         entity = repo.getOne(id);
	}	


	public void create() {
		entity = new Verordnung302Position();
	}


	public Verordnung302Position getEntity() {
		return entity;
	}

	public void setEntity(Verordnung302Position entity) {
         this.entity = entity;
	}	


    public java.lang.Long getVerordnung302PositionId() {
			return entity.getVerordnung302PositionId();    
    }

         


     	    public String getPosition() {
     	         return entity.getPosition(); 
     	    }
     	    public void setPositionWithString(String value) {
     	        	entity.setPosition(convertToString( value));
     	        }
         


     	    public long getFaktor() {
     	         return entity.getFaktor(); 
     	    }
     	    public void setFaktorWithString(String value) {
     	        	entity.setFaktor(convertToLong( value));
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


