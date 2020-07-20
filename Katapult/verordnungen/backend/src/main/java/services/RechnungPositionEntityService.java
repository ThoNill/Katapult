package services;


import java.util.Optional;

import javax.money.MonetaryAmount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.RechnungPosition;
import repositories.RechnungPositionRepository;
import tho.nill.verordnungen.simpleAttributes.MwstArt;

@Service
public class RechnungPositionEntityService  {

    	@Autowired
    	RechnungPositionRepository repo;

    	@Autowired
    	repositories.RechnungKopfRepository rechnungkopfRepo;


    	public RechnungPositionEntityService() {
    		super();
    	}

    	public Optional<RechnungPosition> get(long id) {
    		return repo.findById(id);
    	}

    	public RechnungPosition create(MonetaryAmount  zahlBetrag, MonetaryAmount  bruttoBetrag, MwstArt  mwstArt, MonetaryAmount  mwstBetrag, MonetaryAmount  rabattBetrag, MonetaryAmount  zuzahlungBetrag, MonetaryAmount  zuzahlungMwstBetrag, long rechnungkopf 
    ) {
    		RechnungPosition d = new RechnungPosition();
    		felderSetzen(d, zahlBetrag, bruttoBetrag, mwstArt, mwstBetrag, rabattBetrag, zuzahlungBetrag, zuzahlungMwstBetrag, rechnungkopf
    );
    		return repo.save(d);
    	}

    	public void update(long id, MonetaryAmount  zahlBetrag, MonetaryAmount  bruttoBetrag, MwstArt  mwstArt, MonetaryAmount  mwstBetrag, MonetaryAmount  rabattBetrag, MonetaryAmount  zuzahlungBetrag, MonetaryAmount  zuzahlungMwstBetrag, long rechnungkopf 
    ) {
    		RechnungPosition d = repo.getOne(id);
    		felderSetzen(d, zahlBetrag, bruttoBetrag, mwstArt, mwstBetrag, rabattBetrag, zuzahlungBetrag, zuzahlungMwstBetrag, rechnungkopf
    );
    		repo.save(d);
    	}

    	public void delete(long id) {
    		repo.deleteById(id);
    	}

    	private void felderSetzen(RechnungPosition d, 
    	MonetaryAmount  zahlBetrag, MonetaryAmount  bruttoBetrag, MwstArt  mwstArt, MonetaryAmount  mwstBetrag, MonetaryAmount  rabattBetrag, MonetaryAmount  zuzahlungBetrag, MonetaryAmount  zuzahlungMwstBetrag, long rechnungkopf 

    	) {
    	d.setZahlBetrag(zahlBetrag);
    	d.setBruttoBetrag(bruttoBetrag);
    	d.setMwstArt(mwstArt);
    	d.setMwstBetrag(mwstBetrag);
    	d.setRabattBetrag(rabattBetrag);
    	d.setZuzahlungBetrag(zuzahlungBetrag);
    	d.setZuzahlungMwstBetrag(zuzahlungMwstBetrag);

    	if (rechnungkopf > 0) {
    	   Optional<entities.RechnungKopf> rechnungkopfEntity =  rechnungkopfRepo.findById(rechnungkopf);
    	   if (rechnungkopfEntity.isPresent()) {
    	   	  d.setRechnungKopf(rechnungkopfEntity.get());
    	   }
    	}  	
    	}


}