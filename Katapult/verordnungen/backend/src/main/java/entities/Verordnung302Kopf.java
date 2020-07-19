package entities;

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

    import tho.nill.verordnungen.simpleAttributes.IK;
    import tho.nill.verordnungen.simpleAttributes.IK;
    import javax.money.MonetaryAmount;
    import javax.money.MonetaryAmount;
    import javax.money.MonetaryAmount;
    import javax.money.MonetaryAmount;
    import javax.money.MonetaryAmount;
    import javax.money.MonetaryAmount;

    import entities.Verordnung302Kopf;

    import entities.Verordnung302Position;


@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "VERORDNUNG302KOPF")
@SequenceGenerator(name = "VERORDNUNG302KOPF_SEQ", sequenceName = "VERORDNUNG302KOPF_SEQ")
public class Verordnung302Kopf  {

    @EqualsAndHashCode.Include
    @ToString.Include
    @Basic
    @Column(name = "VERORDNUNG302KOPFID")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VERORDNUNG302KOPF_SEQ")
    private java.lang.Long Verordnung302KopfId;

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "VERSICHERTENKARTEIK")
     	     @Convert(converter = tho.nill.verordnungen.simpleAttributes.IKAdapter.class)
     	    private IK versichertenKarteIk;


     	    public IK getVersichertenKarteIk() {
     	    	return versichertenKarteIk;
     	    }

     	    public void setVersichertenKarteIk(IK value) {
     	    	versichertenKarteIk = value;
     	    }

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "KOSTENTRÄGERIK")
     	     @Convert(converter = tho.nill.verordnungen.simpleAttributes.IKAdapter.class)
     	    private IK kostenträgerIk;


     	    public IK getKostenträgerIk() {
     	    	return kostenträgerIk;
     	    }

     	    public void setKostenträgerIk(IK value) {
     	    	kostenträgerIk = value;
     	    }

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "ZAHLBETRAG")
     	     @Convert(converter = tho.nill.verordnungen.simpleAttributes.MoneyAdapter.class)
     	    private MonetaryAmount zahlBetrag;


     	    public MonetaryAmount getZahlBetrag() {
     	    	return zahlBetrag;
     	    }

     	    public void setZahlBetrag(MonetaryAmount value) {
     	    	zahlBetrag = value;
     	    }

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "BRUTTOBETRAG")
     	     @Convert(converter = tho.nill.verordnungen.simpleAttributes.MoneyAdapter.class)
     	    private MonetaryAmount bruttoBetrag;


     	    public MonetaryAmount getBruttoBetrag() {
     	    	return bruttoBetrag;
     	    }

     	    public void setBruttoBetrag(MonetaryAmount value) {
     	    	bruttoBetrag = value;
     	    }

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "MWSTBETRAG")
     	     @Convert(converter = tho.nill.verordnungen.simpleAttributes.MoneyAdapter.class)
     	    private MonetaryAmount mwstBetrag;


     	    public MonetaryAmount getMwstBetrag() {
     	    	return mwstBetrag;
     	    }

     	    public void setMwstBetrag(MonetaryAmount value) {
     	    	mwstBetrag = value;
     	    }

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "RABATTBETRAG")
     	     @Convert(converter = tho.nill.verordnungen.simpleAttributes.MoneyAdapter.class)
     	    private MonetaryAmount rabattBetrag;


     	    public MonetaryAmount getRabattBetrag() {
     	    	return rabattBetrag;
     	    }

     	    public void setRabattBetrag(MonetaryAmount value) {
     	    	rabattBetrag = value;
     	    }

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "ZUZAHLUNGBETRAG")
     	     @Convert(converter = tho.nill.verordnungen.simpleAttributes.MoneyAdapter.class)
     	    private MonetaryAmount zuzahlungBetrag;


     	    public MonetaryAmount getZuzahlungBetrag() {
     	    	return zuzahlungBetrag;
     	    }

     	    public void setZuzahlungBetrag(MonetaryAmount value) {
     	    	zuzahlungBetrag = value;
     	    }

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "ZUZAHLUNGMWSTBETRAG")
     	     @Convert(converter = tho.nill.verordnungen.simpleAttributes.MoneyAdapter.class)
     	    private MonetaryAmount zuzahlungMwstBetrag;


     	    public MonetaryAmount getZuzahlungMwstBetrag() {
     	    	return zuzahlungMwstBetrag;
     	    }

     	    public void setZuzahlungMwstBetrag(MonetaryAmount value) {
     	    	zuzahlungMwstBetrag = value;
     	    }

         
        // Kind: (fromone2many)


     	    @OneToMany(cascade = CascadeType.ALL, 
     	               mappedBy = "Verordnung302Kopf", 
     	               orphanRemoval = true
     	               )
     	    private Set<Verordnung302Position> Verordnung302Position = new HashSet<>();



     	    public void addVerordnung302Position(Verordnung302Position x) {
     	        this.Verordnung302Position.add((Verordnung302Position)x);
     	        x.setVerordnung302Kopf(this);
     	    }


     	    public void removeVerordnung302Position(Verordnung302Position x) {
     	        this.Verordnung302Position.remove((Verordnung302Position)x);
     	        x.setVerordnung302Kopf(null);
     	    }


}

