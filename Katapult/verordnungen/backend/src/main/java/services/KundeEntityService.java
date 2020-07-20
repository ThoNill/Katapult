package services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Kunde;
import repositories.KundeRepository;

import tho.nill.verordnungen.simpleAttributes.IK;

import tho.nill.verordnungen.simpleAttributes.Tarifbereich;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;



import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Service
public class KundeEntityService  {

    	@Autowired
    	KundeRepository repo;

    	@Autowired
    	repositories.LeistungserbringerRepository leistungserbringerRepo;


    	public KundeEntityService() {
    		super();
    	}

    	public Optional<Kunde> get(long id) {
    		return repo.findById(id);
    	}

    	public Kunde create(IK  ik, Tarifbereich  tarifbereich, String  ansprechpartner, String  firma, String  plz, String  ort, String  straße, String  telefon, String  email, long leistungserbringer 
    ) {
    		Kunde d = new Kunde();
    		felderSetzen(d, ik, tarifbereich, ansprechpartner, firma, plz, ort, straße, telefon, email, leistungserbringer
    );
    		return repo.save(d);
    	}

    	public void update(long id, IK  ik, Tarifbereich  tarifbereich, String  ansprechpartner, String  firma, String  plz, String  ort, String  straße, String  telefon, String  email, long leistungserbringer 
    ) {
    		Kunde d = repo.getOne(id);
    		felderSetzen(d, ik, tarifbereich, ansprechpartner, firma, plz, ort, straße, telefon, email, leistungserbringer
    );
    		repo.save(d);
    	}

    	public void delete(long id) {
    		repo.deleteById(id);
    	}

    	private void felderSetzen(Kunde d, 
    	IK  ik, Tarifbereich  tarifbereich, String  ansprechpartner, String  firma, String  plz, String  ort, String  straße, String  telefon, String  email, long leistungserbringer 

    	) {
    	d.setIk(ik);
    	d.setTarifbereich(tarifbereich);
    	d.setAnsprechpartner(ansprechpartner);
    	d.setFirma(firma);
    	d.setPlz(plz);
    	d.setOrt(ort);
    	d.setStraße(straße);
    	d.setTelefon(telefon);
    	d.setEmail(email);

    	if (leistungserbringer > 0) {
    	    Optional<entities.Leistungserbringer> leistungserbringerEntity =  leistungserbringerRepo.findById(leistungserbringer);
    	    if (leistungserbringerEntity.isPresent()) {
    	       d.addLeistungserbringer(leistungserbringerEntity.get());
    	    }
    	}	
    	}


}