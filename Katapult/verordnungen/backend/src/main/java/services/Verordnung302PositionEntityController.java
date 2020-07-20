package services;
import java.util.Optional;

import javax.money.MonetaryAmount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import entities.Verordnung302Position;
import tho.nill.verordnungen.simpleAttributes.MwstArt;



@RestController
@CrossOrigin(origins = "https://localhost:4200", maxAge = 3600)
@RequestMapping("/api")
public class Verordnung302PositionEntityController  {



    	private static final String DER_DATENSATZ_MIT_DER = "Der Verordnung302Position Datensatz mit der ";
    	@Autowired
    	private Verordnung302PositionEntityService service;

    	public Verordnung302PositionEntityController() {
    		super();
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/verordnung302position/insert", produces = "application/json", method = RequestMethod.POST)
    	public String create(@RequestParam(name = "position") String position
     // value
    , @RequestParam(name = "faktor") long faktor
     // value
    , @RequestParam(name = "zahlBetrag") MonetaryAmount zahlBetrag
     // value
    , @RequestParam(name = "bruttoBetrag") MonetaryAmount bruttoBetrag
     // value
    , @RequestParam(name = "mwstArt") MwstArt mwstArt
     // enumeration
    , @RequestParam(name = "mwstBetrag") MonetaryAmount mwstBetrag
     // value
    , @RequestParam(name = "rabattBetrag") MonetaryAmount rabattBetrag
     // value
    , @RequestParam(name = "zuzahlungBetrag") MonetaryAmount zuzahlungBetrag
     // value
    , @RequestParam(name = "zuzahlungMwstBetrag") MonetaryAmount zuzahlungMwstBetrag
     // value
    , @RequestParam(name = "verordnung302kopf") long verordnung302kopf // Verordnung302Kopf
     // toone2many
    ) {

    		try {
    			Verordnung302Position d = service.create(position, faktor, zahlBetrag, bruttoBetrag, mwstArt, mwstBetrag, rabattBetrag, zuzahlungBetrag, zuzahlungMwstBetrag, verordnung302kopf);
    			return DER_DATENSATZ_MIT_DER + d.getVerordnung302PositionId() + " wurden erfolgreich angelegt";
    		} catch (Exception e) {
    			return "Beim Anlegen eines Verordnung302Position Datensatzes trat ein Fehler auf";
    		}
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/verordnung302position/update/{id}", produces = "application/json", method = RequestMethod.PUT)
    	public String update(@PathVariable(name = "id") long id,
    	              @RequestParam(name = "position") String position
    	               // value
    	              , @RequestParam(name = "faktor") long faktor
    	               // value
    	              , @RequestParam(name = "zahlBetrag") MonetaryAmount zahlBetrag
    	               // value
    	              , @RequestParam(name = "bruttoBetrag") MonetaryAmount bruttoBetrag
    	               // value
    	              , @RequestParam(name = "mwstArt") MwstArt mwstArt
    	               // enumeration
    	              , @RequestParam(name = "mwstBetrag") MonetaryAmount mwstBetrag
    	               // value
    	              , @RequestParam(name = "rabattBetrag") MonetaryAmount rabattBetrag
    	               // value
    	              , @RequestParam(name = "zuzahlungBetrag") MonetaryAmount zuzahlungBetrag
    	               // value
    	              , @RequestParam(name = "zuzahlungMwstBetrag") MonetaryAmount zuzahlungMwstBetrag
    	               // value
    	              , @RequestParam(name = "verordnung302kopf") long verordnung302kopf // Verordnung302Kopf
    	               // toone2many
    ) {

    		try {
    			service.update(id,position, faktor, zahlBetrag, bruttoBetrag, mwstArt, mwstBetrag, rabattBetrag, zuzahlungBetrag, zuzahlungMwstBetrag, verordnung302kopf);
    			return DER_DATENSATZ_MIT_DER + id + " wurden erfolgreich geändert";
    		} catch (Exception e) {
    			return "Beim Ändern des Verordnung302Position Datensatzes mit der " + id + " trat ein Fehler auf";
    		}
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/verordnung302position/delete/{id}", produces = "application/json", method = RequestMethod.DELETE)
    	public String delete(@PathVariable(name = "id") long id) {

    		try {
    			service.delete(id);
    			return DER_DATENSATZ_MIT_DER + id + " wurden erfolgreich entfernt";
    		} catch (Exception e) {
    			return "Beim Entfernen des Verordnung302Position Datensatzes mit der " + id + " trat ein Fehler auf";
    		}
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/verordnung302position/get/{id}", produces = "application/json", method = RequestMethod.GET)
    	public Verordnung302Position get(@PathVariable(name = "id") long id) {

    		try {
    			Optional<Verordnung302Position> o = service.get(id);
    			if (o.isPresent()) {
    				return o.get();
    			}
    		} catch (Exception e) {
    			throw new RuntimeException("Exception bei get ", e);
    		}
    		return null;
    	}




}