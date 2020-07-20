package entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import tho.nill.verordnungen.simpleAttributes.LeistungserbringerCode;


@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "LEISTUNGSERBRINGER")
@SequenceGenerator(name = "LEISTUNGSERBRINGER_SEQ", sequenceName = "LEISTUNGSERBRINGER_SEQ")
public class Leistungserbringer  {

    @EqualsAndHashCode.Include
    @ToString.Include
    @Basic
    @Column(name = "LEISTUNGSERBRINGERID")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LEISTUNGSERBRINGER_SEQ")
    private java.lang.Long LeistungserbringerId;

         
        // Kind: (enumeration)


     	    @Enumerated
     	    @Column(name = "LEISTUNGSERBRINGERCODE")
     	    private LeistungserbringerCode leistungserbringercode;


     	    public LeistungserbringerCode getLeistungserbringercode() {
     	    	return leistungserbringercode;
     	    }

     	    public void setLeistungserbringercode(LeistungserbringerCode value) {
     	    	leistungserbringercode = value;
     	    }
         
        // Kind: (toone2many)

     	  	@ManyToOne(fetch = FetchType.LAZY)
     	    @JoinColumn(name = "Kunde_Id")
     		private Kunde Kunde;


     	    public void setKunde(Kunde value) {
     	 	   Kunde = (Kunde) value;
     	    }


         
        // Kind: (fromone2many)


     	    @OneToMany(cascade = CascadeType.ALL, 
     	               mappedBy = "Leistungserbringer", 
     	               orphanRemoval = true
     	               )
     	    private Set<RechnungPosition> RechnungPosition = new HashSet<>();



     	    public void addRechnungPosition(RechnungPosition x) {
     	        this.RechnungPosition.add((RechnungPosition)x);
     	        x.setLeistungserbringer(this);
     	    }


     	    public void removeRechnungPosition(RechnungPosition x) {
     	        this.RechnungPosition.remove((RechnungPosition)x);
     	        x.setLeistungserbringer(null);
     	    }


         
        // Kind: (fromone2many)


     	    @OneToMany(cascade = CascadeType.ALL, 
     	               mappedBy = "Leistungserbringer", 
     	               orphanRemoval = true
     	               )
     	    private Set<Verordnung302Kopf> Verordnung302Kopf = new HashSet<>();



     	    public void addVerordnung302Kopf(Verordnung302Kopf x) {
     	        this.Verordnung302Kopf.add((Verordnung302Kopf)x);
     	        x.setLeistungserbringer(this);
     	    }


     	    public void removeVerordnung302Kopf(Verordnung302Kopf x) {
     	        this.Verordnung302Kopf.remove((Verordnung302Kopf)x);
     	        x.setLeistungserbringer(null);
     	    }


}

