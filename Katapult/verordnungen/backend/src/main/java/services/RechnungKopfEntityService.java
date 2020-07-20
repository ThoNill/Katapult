package services;


import java.util.Optional;

import javax.money.MonetaryAmount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.RechnungKopf;
import repositories.RechnungKopfRepository;
import tho.nill.verordnungen.simpleAttributes.IK;

@Service
public class RechnungKopfEntityService  {

    	@Autowired
    	RechnungKopfRepository repo;

    	@Autowired
    	repositories.RechnungPositionRepository rechnungpositionRepo;


    	public RechnungKopfEntityService() {
    		super();
    	}

    	public Optional<RechnungKopf> get(long id) {
    		return repo.findById(id);
    	}

    	public RechnungKopf create(IK  versichertenKarteIk, IK  kostenträgerIk, IK  papierIk, IK  prüfstelleIk, IK  datenannahmeIk, IK  image_prüfstelleIk, IK  image_datenanahmeIk, MonetaryAmount  zahlBetrag, MonetaryAmount  zuzahlungBetrag, MonetaryAmount  mwstBetrag, MonetaryAmount  rabattBetrag, MonetaryAmount  skontoBetrag, long rechnungposition 
    ) {
    		RechnungKopf d = new RechnungKopf();
    		felderSetzen(d, versichertenKarteIk, kostenträgerIk, papierIk, prüfstelleIk, datenannahmeIk, image_prüfstelleIk, image_datenanahmeIk, zahlBetrag, zuzahlungBetrag, mwstBetrag, rabattBetrag, skontoBetrag, rechnungposition
    );
    		return repo.save(d);
    	}

    	public void update(long id, IK  versichertenKarteIk, IK  kostenträgerIk, IK  papierIk, IK  prüfstelleIk, IK  datenannahmeIk, IK  image_prüfstelleIk, IK  image_datenanahmeIk, MonetaryAmount  zahlBetrag, MonetaryAmount  zuzahlungBetrag, MonetaryAmount  mwstBetrag, MonetaryAmount  rabattBetrag, MonetaryAmount  skontoBetrag, long rechnungposition 
    ) {
    		RechnungKopf d = repo.getOne(id);
    		felderSetzen(d, versichertenKarteIk, kostenträgerIk, papierIk, prüfstelleIk, datenannahmeIk, image_prüfstelleIk, image_datenanahmeIk, zahlBetrag, zuzahlungBetrag, mwstBetrag, rabattBetrag, skontoBetrag, rechnungposition
    );
    		repo.save(d);
    	}

    	public void delete(long id) {
    		repo.deleteById(id);
    	}

    	private void felderSetzen(RechnungKopf d, 
    	IK  versichertenKarteIk, IK  kostenträgerIk, IK  papierIk, IK  prüfstelleIk, IK  datenannahmeIk, IK  image_prüfstelleIk, IK  image_datenanahmeIk, MonetaryAmount  zahlBetrag, MonetaryAmount  zuzahlungBetrag, MonetaryAmount  mwstBetrag, MonetaryAmount  rabattBetrag, MonetaryAmount  skontoBetrag, long rechnungposition 

    	) {
    	d.setVersichertenKarteIk(versichertenKarteIk);
    	d.setKostenträgerIk(kostenträgerIk);
    	d.setPapierIk(papierIk);
    	d.setPrüfstelleIk(prüfstelleIk);
    	d.setDatenannahmeIk(datenannahmeIk);
    	d.setImage_prüfstelleIk(image_prüfstelleIk);
    	d.setImage_datenanahmeIk(image_datenanahmeIk);
    	d.setZahlBetrag(zahlBetrag);
    	d.setZuzahlungBetrag(zuzahlungBetrag);
    	d.setMwstBetrag(mwstBetrag);
    	d.setRabattBetrag(rabattBetrag);
    	d.setSkontoBetrag(skontoBetrag);

    	if (rechnungposition > 0) {
    	    Optional<entities.RechnungPosition> rechnungpositionEntity =  rechnungpositionRepo.findById(rechnungposition);
    	    if (rechnungpositionEntity.isPresent()) {
    	       d.addRechnungPosition(rechnungpositionEntity.get());
    	    }
    	}	
    	}


}