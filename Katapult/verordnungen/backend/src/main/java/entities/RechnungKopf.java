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
    import tho.nill.verordnungen.simpleAttributes.IK;
    import tho.nill.verordnungen.simpleAttributes.IK;
    import tho.nill.verordnungen.simpleAttributes.IK;
    import tho.nill.verordnungen.simpleAttributes.IK;
    import tho.nill.verordnungen.simpleAttributes.IK;
    import javax.money.MonetaryAmount;
    import javax.money.MonetaryAmount;
    import javax.money.MonetaryAmount;
    import javax.money.MonetaryAmount;
    import javax.money.MonetaryAmount;

    import entities.RechnungKopf;

    import entities.RechnungPosition;


@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "RECHNUNGKOPF")
@SequenceGenerator(name = "RECHNUNGKOPF_SEQ", sequenceName = "RECHNUNGKOPF_SEQ")
public class RechnungKopf  {

    @EqualsAndHashCode.Include
    @ToString.Include
    @Basic
    @Column(name = "RECHNUNGKOPFID")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RECHNUNGKOPF_SEQ")
    private java.lang.Long RechnungKopfId;

         
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
     	    @Column(name = "PAPIERIK")
     	     @Convert(converter = tho.nill.verordnungen.simpleAttributes.IKAdapter.class)
     	    private IK papierIk;


     	    public IK getPapierIk() {
     	    	return papierIk;
     	    }

     	    public void setPapierIk(IK value) {
     	    	papierIk = value;
     	    }

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "PRÜFSTELLEIK")
     	     @Convert(converter = tho.nill.verordnungen.simpleAttributes.IKAdapter.class)
     	    private IK prüfstelleIk;


     	    public IK getPrüfstelleIk() {
     	    	return prüfstelleIk;
     	    }

     	    public void setPrüfstelleIk(IK value) {
     	    	prüfstelleIk = value;
     	    }

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "DATENANNAHMEIK")
     	     @Convert(converter = tho.nill.verordnungen.simpleAttributes.IKAdapter.class)
     	    private IK datenannahmeIk;


     	    public IK getDatenannahmeIk() {
     	    	return datenannahmeIk;
     	    }

     	    public void setDatenannahmeIk(IK value) {
     	    	datenannahmeIk = value;
     	    }

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "IMAGE_PRÜFSTELLEIK")
     	     @Convert(converter = tho.nill.verordnungen.simpleAttributes.IKAdapter.class)
     	    private IK image_prüfstelleIk;


     	    public IK getImage_prüfstelleIk() {
     	    	return image_prüfstelleIk;
     	    }

     	    public void setImage_prüfstelleIk(IK value) {
     	    	image_prüfstelleIk = value;
     	    }

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "IMAGE_DATENANAHMEIK")
     	     @Convert(converter = tho.nill.verordnungen.simpleAttributes.IKAdapter.class)
     	    private IK image_datenanahmeIk;


     	    public IK getImage_datenanahmeIk() {
     	    	return image_datenanahmeIk;
     	    }

     	    public void setImage_datenanahmeIk(IK value) {
     	    	image_datenanahmeIk = value;
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
     	    @Column(name = "SKONTOBETRAG")
     	     @Convert(converter = tho.nill.verordnungen.simpleAttributes.MoneyAdapter.class)
     	    private MonetaryAmount skontoBetrag;


     	    public MonetaryAmount getSkontoBetrag() {
     	    	return skontoBetrag;
     	    }

     	    public void setSkontoBetrag(MonetaryAmount value) {
     	    	skontoBetrag = value;
     	    }

         
        // Kind: (fromone2many)


     	    @OneToMany(cascade = CascadeType.ALL, 
     	               mappedBy = "RechnungKopf", 
     	               orphanRemoval = true
     	               )
     	    private Set<RechnungPosition> RechnungPosition = new HashSet<>();



     	    public void addRechnungPosition(RechnungPosition x) {
     	        this.RechnungPosition.add((RechnungPosition)x);
     	        x.setRechnungKopf(this);
     	    }


     	    public void removeRechnungPosition(RechnungPosition x) {
     	        this.RechnungPosition.remove((RechnungPosition)x);
     	        x.setRechnungKopf(null);
     	    }


}

