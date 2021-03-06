package services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

@Service
public class VersandZielEntityService  {

    	@Autowired
    	VersandZielRepository repo;

    	@Autowired
    	repositories.KasseRepository kasseRepo;


    	public VersandZielEntityService() {
    		super();
    	}

    	public Optional<VersandZiel> get(long id) {
    		return repo.findById(id);
    	}

    	public VersandZiel create(IK  von_ik, IK  nach_ik, IK  kostenträger, DatenlieferungsArt  art, VerweisArt  verweis, DFÜMedium  medium, Bundesland  land, KVBezirk  bezirk, Abrechnungscode  abrechnungscode, Tarifkennzeichen  tarifkennzeichen, Leistungserbringergruppe  leistungserbringergruppe, long kasse 
    ) {
    		VersandZiel d = new VersandZiel();
    		felderSetzen(d, von_ik, nach_ik, kostenträger, art, verweis, medium, land, bezirk, abrechnungscode, tarifkennzeichen, leistungserbringergruppe, kasse
    );
    		return repo.save(d);
    	}

    	public void update(long id, IK  von_ik, IK  nach_ik, IK  kostenträger, DatenlieferungsArt  art, VerweisArt  verweis, DFÜMedium  medium, Bundesland  land, KVBezirk  bezirk, Abrechnungscode  abrechnungscode, Tarifkennzeichen  tarifkennzeichen, Leistungserbringergruppe  leistungserbringergruppe, long kasse 
    ) {
    		VersandZiel d = repo.getOne(id);
    		felderSetzen(d, von_ik, nach_ik, kostenträger, art, verweis, medium, land, bezirk, abrechnungscode, tarifkennzeichen, leistungserbringergruppe, kasse
    );
    		repo.save(d);
    	}

    	public void delete(long id) {
    		repo.deleteById(id);
    	}

    	private void felderSetzen(VersandZiel d, 
    	IK  von_ik, IK  nach_ik, IK  kostenträger, DatenlieferungsArt  art, VerweisArt  verweis, DFÜMedium  medium, Bundesland  land, KVBezirk  bezirk, Abrechnungscode  abrechnungscode, Tarifkennzeichen  tarifkennzeichen, Leistungserbringergruppe  leistungserbringergruppe, long kasse 

    	) {
    	d.setVon_ik(von_ik);
    	d.setNach_ik(nach_ik);
    	d.setKostenträger(kostenträger);
    	d.setArt(art);
    	d.setVerweis(verweis);
    	d.setMedium(medium);
    	d.setLand(land);
    	d.setBezirk(bezirk);
    	d.setAbrechnungscode(abrechnungscode);
    	d.setTarifkennzeichen(tarifkennzeichen);
    	d.setLeistungserbringergruppe(leistungserbringergruppe);

    	if (kasse > 0) {
    	   Optional<entities.Kasse> kasseEntity =  kasseRepo.findById(kasse);
    	   if (kasseEntity.isPresent()) {
    	   	  d.setKasse(kasseEntity.get());
    	   }
    	}  	
    	}


}