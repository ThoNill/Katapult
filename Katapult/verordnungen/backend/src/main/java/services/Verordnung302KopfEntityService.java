package services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Verordnung302Kopf;
import repositories.Verordnung302KopfRepository;

import tho.nill.verordnungen.simpleAttributes.IK;

import tho.nill.verordnungen.simpleAttributes.IK;

import javax.money.MonetaryAmount;

import javax.money.MonetaryAmount;

import javax.money.MonetaryAmount;

import javax.money.MonetaryAmount;

import javax.money.MonetaryAmount;

import javax.money.MonetaryAmount;




import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Service
public class Verordnung302KopfEntityService  {

    	@Autowired
    	Verordnung302KopfRepository repo;

    	@Autowired
    	repositories.LeistungserbringerRepository leistungserbringerRepo;
    	@Autowired
    	repositories.Verordnung302PositionRepository verordnung302positionRepo;


    	public Verordnung302KopfEntityService() {
    		super();
    	}

    	public Optional<Verordnung302Kopf> get(long id) {
    		return repo.findById(id);
    	}

    	public Verordnung302Kopf create(IK  versichertenKarteIk, IK  kostenträgerIk, MonetaryAmount  zahlBetrag, MonetaryAmount  bruttoBetrag, MonetaryAmount  mwstBetrag, MonetaryAmount  rabattBetrag, MonetaryAmount  zuzahlungBetrag, MonetaryAmount  zuzahlungMwstBetrag, long leistungserbringer 
    , long verordnung302position 
    ) {
    		Verordnung302Kopf d = new Verordnung302Kopf();
    		felderSetzen(d, versichertenKarteIk, kostenträgerIk, zahlBetrag, bruttoBetrag, mwstBetrag, rabattBetrag, zuzahlungBetrag, zuzahlungMwstBetrag, leistungserbringer
    , verordnung302position
    );
    		return repo.save(d);
    	}

    	public void update(long id, IK  versichertenKarteIk, IK  kostenträgerIk, MonetaryAmount  zahlBetrag, MonetaryAmount  bruttoBetrag, MonetaryAmount  mwstBetrag, MonetaryAmount  rabattBetrag, MonetaryAmount  zuzahlungBetrag, MonetaryAmount  zuzahlungMwstBetrag, long leistungserbringer 
    , long verordnung302position 
    ) {
    		Verordnung302Kopf d = repo.getOne(id);
    		felderSetzen(d, versichertenKarteIk, kostenträgerIk, zahlBetrag, bruttoBetrag, mwstBetrag, rabattBetrag, zuzahlungBetrag, zuzahlungMwstBetrag, leistungserbringer
    , verordnung302position
    );
    		repo.save(d);
    	}

    	public void delete(long id) {
    		repo.deleteById(id);
    	}

    	private void felderSetzen(Verordnung302Kopf d, 
    	IK  versichertenKarteIk, IK  kostenträgerIk, MonetaryAmount  zahlBetrag, MonetaryAmount  bruttoBetrag, MonetaryAmount  mwstBetrag, MonetaryAmount  rabattBetrag, MonetaryAmount  zuzahlungBetrag, MonetaryAmount  zuzahlungMwstBetrag, long leistungserbringer 
    	, long verordnung302position 

    	) {
    	d.setVersichertenKarteIk(versichertenKarteIk);
    	d.setKostenträgerIk(kostenträgerIk);
    	d.setZahlBetrag(zahlBetrag);
    	d.setBruttoBetrag(bruttoBetrag);
    	d.setMwstBetrag(mwstBetrag);
    	d.setRabattBetrag(rabattBetrag);
    	d.setZuzahlungBetrag(zuzahlungBetrag);
    	d.setZuzahlungMwstBetrag(zuzahlungMwstBetrag);

    	if (leistungserbringer > 0) {
    	   Optional<entities.Leistungserbringer> leistungserbringerEntity =  leistungserbringerRepo.findById(leistungserbringer);
    	   if (leistungserbringerEntity.isPresent()) {
    	   	  d.setLeistungserbringer(leistungserbringerEntity.get());
    	   }
    	}  
    	if (verordnung302position > 0) {
    	    Optional<entities.Verordnung302Position> verordnung302positionEntity =  verordnung302positionRepo.findById(verordnung302position);
    	    if (verordnung302positionEntity.isPresent()) {
    	       d.addVerordnung302Position(verordnung302positionEntity.get());
    	    }
    	}	
    	}


}