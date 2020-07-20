package services;


import java.util.Optional;

import javax.money.MonetaryAmount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Verordnung302Position;
import repositories.Verordnung302PositionRepository;
import tho.nill.verordnungen.simpleAttributes.MwstArt;

@Service
public class Verordnung302PositionEntityService  {

    	@Autowired
    	Verordnung302PositionRepository repo;

    	@Autowired
    	repositories.Verordnung302KopfRepository verordnung302kopfRepo;


    	public Verordnung302PositionEntityService() {
    		super();
    	}

    	public Optional<Verordnung302Position> get(long id) {
    		return repo.findById(id);
    	}

    	public Verordnung302Position create(String  position, long  faktor, MonetaryAmount  zahlBetrag, MonetaryAmount  bruttoBetrag, MwstArt  mwstArt, MonetaryAmount  mwstBetrag, MonetaryAmount  rabattBetrag, MonetaryAmount  zuzahlungBetrag, MonetaryAmount  zuzahlungMwstBetrag, long verordnung302kopf 
    ) {
    		Verordnung302Position d = new Verordnung302Position();
    		felderSetzen(d, position, faktor, zahlBetrag, bruttoBetrag, mwstArt, mwstBetrag, rabattBetrag, zuzahlungBetrag, zuzahlungMwstBetrag, verordnung302kopf
    );
    		return repo.save(d);
    	}

    	public void update(long id, String  position, long  faktor, MonetaryAmount  zahlBetrag, MonetaryAmount  bruttoBetrag, MwstArt  mwstArt, MonetaryAmount  mwstBetrag, MonetaryAmount  rabattBetrag, MonetaryAmount  zuzahlungBetrag, MonetaryAmount  zuzahlungMwstBetrag, long verordnung302kopf 
    ) {
    		Verordnung302Position d = repo.getOne(id);
    		felderSetzen(d, position, faktor, zahlBetrag, bruttoBetrag, mwstArt, mwstBetrag, rabattBetrag, zuzahlungBetrag, zuzahlungMwstBetrag, verordnung302kopf
    );
    		repo.save(d);
    	}

    	public void delete(long id) {
    		repo.deleteById(id);
    	}

    	private void felderSetzen(Verordnung302Position d, 
    	String  position, long  faktor, MonetaryAmount  zahlBetrag, MonetaryAmount  bruttoBetrag, MwstArt  mwstArt, MonetaryAmount  mwstBetrag, MonetaryAmount  rabattBetrag, MonetaryAmount  zuzahlungBetrag, MonetaryAmount  zuzahlungMwstBetrag, long verordnung302kopf 

    	) {
    	d.setPosition(position);
    	d.setFaktor(faktor);
    	d.setZahlBetrag(zahlBetrag);
    	d.setBruttoBetrag(bruttoBetrag);
    	d.setMwstArt(mwstArt);
    	d.setMwstBetrag(mwstBetrag);
    	d.setRabattBetrag(rabattBetrag);
    	d.setZuzahlungBetrag(zuzahlungBetrag);
    	d.setZuzahlungMwstBetrag(zuzahlungMwstBetrag);

    	if (verordnung302kopf > 0) {
    	   Optional<entities.Verordnung302Kopf> verordnung302kopfEntity =  verordnung302kopfRepo.findById(verordnung302kopf);
    	   if (verordnung302kopfEntity.isPresent()) {
    	   	  d.setVerordnung302Kopf(verordnung302kopfEntity.get());
    	   }
    	}  	
    	}


}