package entities;

import javax.money.MonetaryAmount;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import tho.nill.verordnungen.simpleAttributes.MwstArt;


@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "RECHNUNGPOSITION")
@SequenceGenerator(name = "RECHNUNGPOSITION_SEQ", sequenceName = "RECHNUNGPOSITION_SEQ")
public class RechnungPosition  {

    @EqualsAndHashCode.Include
    @ToString.Include
    @Basic
    @Column(name = "RECHNUNGPOSITIONID")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RECHNUNGPOSITION_SEQ")
    private java.lang.Long RechnungPositionId;

         
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

         
        // Kind: (enumeration)


     	    @Enumerated
     	    @Column(name = "MWSTART")
     	    private MwstArt mwstArt;


     	    public MwstArt getMwstArt() {
     	    	return mwstArt;
     	    }

     	    public void setMwstArt(MwstArt value) {
     	    	mwstArt = value;
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

         
        // Kind: (toone2many)

     	  	@ManyToOne(fetch = FetchType.LAZY)
     	    @JoinColumn(name = "Leistungserbringer_Id")
     		private Leistungserbringer Leistungserbringer;


     	    public void setLeistungserbringer(Leistungserbringer value) {
     	 	   Leistungserbringer = (Leistungserbringer) value;
     	    }


         
        // Kind: (toone2many)

     	  	@ManyToOne(fetch = FetchType.LAZY)
     	    @JoinColumn(name = "RechnungKopf_Id")
     		private RechnungKopf RechnungKopf;


     	    public void setRechnungKopf(RechnungKopf value) {
     	 	   RechnungKopf = (RechnungKopf) value;
     	    }


}

