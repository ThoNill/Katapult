package entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import tho.nill.verordnungen.simpleAttributes.IK;
import tho.nill.verordnungen.simpleAttributes.Tarifbereich;


@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "KUNDE")
@SequenceGenerator(name = "KUNDE_SEQ", sequenceName = "KUNDE_SEQ")
public class Kunde  {

    @EqualsAndHashCode.Include
    @ToString.Include
    @Basic
    @Column(name = "KUNDEID")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "KUNDE_SEQ")
    private java.lang.Long KundeId;

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "IK")
     	     @Convert(converter = tho.nill.verordnungen.simpleAttributes.IKAdapter.class)
     	    private IK ik;


     	    public IK getIk() {
     	    	return ik;
     	    }

     	    public void setIk(IK value) {
     	    	ik = value;
     	    }

         
        // Kind: (enumeration)


     	    @Enumerated
     	    @Column(name = "TARIFBEREICH")
     	    private Tarifbereich tarifbereich;


     	    public Tarifbereich getTarifbereich() {
     	    	return tarifbereich;
     	    }

     	    public void setTarifbereich(Tarifbereich value) {
     	    	tarifbereich = value;
     	    }
         
        // Kind: (value)


     		@Basic
     	    @Column(name = "ANSPRECHPARTNER")
     	    private String ansprechpartner;


     	    public String getAnsprechpartner() {
     	    	return ansprechpartner;
     	    }

     	    public void setAnsprechpartner(String value) {
     	    	ansprechpartner = value;
     	    }

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "FIRMA")
     	    private String firma;


     	    public String getFirma() {
     	    	return firma;
     	    }

     	    public void setFirma(String value) {
     	    	firma = value;
     	    }

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "PLZ")
     	    private String plz;


     	    public String getPlz() {
     	    	return plz;
     	    }

     	    public void setPlz(String value) {
     	    	plz = value;
     	    }

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "ORT")
     	    private String ort;


     	    public String getOrt() {
     	    	return ort;
     	    }

     	    public void setOrt(String value) {
     	    	ort = value;
     	    }

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "STRASSE")
     	    private String straße;


     	    public String getStraße() {
     	    	return straße;
     	    }

     	    public void setStraße(String value) {
     	    	straße = value;
     	    }

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "TELEFON")
     	    private String telefon;


     	    public String getTelefon() {
     	    	return telefon;
     	    }

     	    public void setTelefon(String value) {
     	    	telefon = value;
     	    }

         
        // Kind: (value)


     		@Basic
     	    @Column(name = "EMAIL")
     	    private String email;


     	    public String getEmail() {
     	    	return email;
     	    }

     	    public void setEmail(String value) {
     	    	email = value;
     	    }

         
        // Kind: (fromone2many)


     	    @OneToMany(cascade = CascadeType.ALL, 
     	               mappedBy = "Kunde", 
     	               orphanRemoval = true
     	               )
     	    private Set<Leistungserbringer> Leistungserbringer = new HashSet<>();



     	    public void addLeistungserbringer(Leistungserbringer x) {
     	        this.Leistungserbringer.add((Leistungserbringer)x);
     	        x.setKunde(this);
     	    }


     	    public void removeLeistungserbringer(Leistungserbringer x) {
     	        this.Leistungserbringer.remove((Leistungserbringer)x);
     	        x.setKunde(null);
     	    }


}

