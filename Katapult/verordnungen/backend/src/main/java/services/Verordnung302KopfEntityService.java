package services;


import java.util.Optional;

import javax.money.MonetaryAmount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Verordnung302Kopf;
import repositories.Verordnung302KopfRepository;
import tho.nill.verordnungen.simpleAttributes.IK;

@Service
public class Verordnung302KopfEntityService  {

    	@Autowired
    	Verordnung302KopfRepository repo;

    	@Autowired
    	repositories.Verordnung302PositionRepository verordnung302positionRepo;


    	public Verordnung302KopfEntityService() {
    		super();
    	}

    	public Optional<Verordnung302Kopf> get(long id) {
    		return repo.findById(id);
    	}

    	public Verordnung302Kopf create(IK  versichertenKarteIk, IK  kostenträgerIk, MonetaryAmount  zahlBetrag, MonetaryAmount  bruttoBetrag, MonetaryAmount  mwstBetrag, MonetaryAmount  rabattBetrag, MonetaryAmount  zuzahlungBetrag, MonetaryAmount  zuzahlungMwstBetrag, long verordnung302position 
    ) {
    		Verordnung302Kopf d = new Verordnung302Kopf();
    		felderSetzen(d, versichertenKarteIk, kostenträgerIk, zahlBetrag, bruttoBetrag, mwstBetrag, rabattBetrag, zuzahlungBetrag, zuzahlungMwstBetrag, verordnung302position
    );
    		return repo.save(d);
    	}

    	public void update(long id, IK  versichertenKarteIk, IK  kostenträgerIk, MonetaryAmount  zahlBetrag, MonetaryAmount  bruttoBetrag, MonetaryAmount  mwstBetrag, MonetaryAmount  rabattBetrag, MonetaryAmount  zuzahlungBetrag, MonetaryAmount  zuzahlungMwstBetrag, long verordnung302position 
    ) {
    		Verordnung302Kopf d = repo.getOne(id);
    		felderSetzen(d, versichertenKarteIk, kostenträgerIk, zahlBetrag, bruttoBetrag, mwstBetrag, rabattBetrag, zuzahlungBetrag, zuzahlungMwstBetrag, verordnung302position
    );
    		repo.save(d);
    	}

    	public void delete(long id) {
    		repo.deleteById(id);
    	}

    	private void felderSetzen(Verordnung302Kopf d, 
    	IK  versichertenKarteIk, IK  kostenträgerIk, MonetaryAmount  zahlBetrag, MonetaryAmount  bruttoBetrag, MonetaryAmount  mwstBetrag, MonetaryAmount  rabattBetrag, MonetaryAmount  zuzahlungBetrag, MonetaryAmount  zuzahlungMwstBetrag, long verordnung302position 

    	) {
    	d.setVersichertenKarteIk(versichertenKarteIk);
    	d.setKostenträgerIk(kostenträgerIk);
    	d.setZahlBetrag(zahlBetrag);
    	d.setBruttoBetrag(bruttoBetrag);
    	d.setMwstBetrag(mwstBetrag);
    	d.setRabattBetrag(rabattBetrag);
    	d.setZuzahlungBetrag(zuzahlungBetrag);
    	d.setZuzahlungMwstBetrag(zuzahlungMwstBetrag);

    	if (verordnung302position > 0) {
    	    Optional<entities.Verordnung302Position> verordnung302positionEntity =  verordnung302positionRepo.findById(verordnung302position);
    	    if (verordnung302positionEntity.isPresent()) {
    	       d.addVerordnung302Position(verordnung302positionEntity.get());
    	    }
    	}	
    	}


}