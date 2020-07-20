package services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Leistungserbringer;
import repositories.LeistungserbringerRepository;

import tho.nill.verordnungen.simpleAttributes.LeistungserbringerCode;





import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Service
public class LeistungserbringerEntityService  {

    	@Autowired
    	LeistungserbringerRepository repo;

    	@Autowired
    	repositories.KundeRepository kundeRepo;
    	@Autowired
    	repositories.RechnungPositionRepository rechnungpositionRepo;
    	@Autowired
    	repositories.Verordnung302KopfRepository verordnung302kopfRepo;


    	public LeistungserbringerEntityService() {
    		super();
    	}

    	public Optional<Leistungserbringer> get(long id) {
    		return repo.findById(id);
    	}

    	public Leistungserbringer create(LeistungserbringerCode  leistungserbringercode, long kunde 
    , long rechnungposition 
    , long verordnung302kopf 
    ) {
    		Leistungserbringer d = new Leistungserbringer();
    		felderSetzen(d, leistungserbringercode, kunde
    , rechnungposition
    , verordnung302kopf
    );
    		return repo.save(d);
    	}

    	public void update(long id, LeistungserbringerCode  leistungserbringercode, long kunde 
    , long rechnungposition 
    , long verordnung302kopf 
    ) {
    		Leistungserbringer d = repo.getOne(id);
    		felderSetzen(d, leistungserbringercode, kunde
    , rechnungposition
    , verordnung302kopf
    );
    		repo.save(d);
    	}

    	public void delete(long id) {
    		repo.deleteById(id);
    	}

    	private void felderSetzen(Leistungserbringer d, 
    	LeistungserbringerCode  leistungserbringercode, long kunde 
    	, long rechnungposition 
    	, long verordnung302kopf 

    	) {
    	d.setLeistungserbringercode(leistungserbringercode);

    	if (kunde > 0) {
    	   Optional<entities.Kunde> kundeEntity =  kundeRepo.findById(kunde);
    	   if (kundeEntity.isPresent()) {
    	   	  d.setKunde(kundeEntity.get());
    	   }
    	}  
    	if (rechnungposition > 0) {
    	    Optional<entities.RechnungPosition> rechnungpositionEntity =  rechnungpositionRepo.findById(rechnungposition);
    	    if (rechnungpositionEntity.isPresent()) {
    	       d.addRechnungPosition(rechnungpositionEntity.get());
    	    }
    	}
    	if (verordnung302kopf > 0) {
    	    Optional<entities.Verordnung302Kopf> verordnung302kopfEntity =  verordnung302kopfRepo.findById(verordnung302kopf);
    	    if (verordnung302kopfEntity.isPresent()) {
    	       d.addVerordnung302Kopf(verordnung302kopfEntity.get());
    	    }
    	}	
    	}


}