package services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import entities.Verordnung302Kopf;

import tho.nill.verordnungen.simpleAttributes.IK;

import tho.nill.verordnungen.simpleAttributes.IK;

import javax.money.MonetaryAmount;

import javax.money.MonetaryAmount;

import javax.money.MonetaryAmount;

import javax.money.MonetaryAmount;

import javax.money.MonetaryAmount;

import javax.money.MonetaryAmount;




@RestController
@CrossOrigin(origins = "https://localhost:4200", maxAge = 3600)
@RequestMapping("/api")
public class Verordnung302KopfEntityController  {



    	private static final String DER_DATENSATZ_MIT_DER = "Der Verordnung302Kopf Datensatz mit der ";
    	@Autowired
    	private Verordnung302KopfEntityService service;

    	public Verordnung302KopfEntityController() {
    		super();
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/verordnung302kopf/insert", produces = "application/json", method = RequestMethod.POST)
    	public String create(@RequestParam(name = "versichertenKarteIk") IK versichertenKarteIk
     // value
    , @RequestParam(name = "kostenträgerIk") IK kostenträgerIk
     // value
    , @RequestParam(name = "zahlBetrag") MonetaryAmount zahlBetrag
     // value
    , @RequestParam(name = "bruttoBetrag") MonetaryAmount bruttoBetrag
     // value
    , @RequestParam(name = "mwstBetrag") MonetaryAmount mwstBetrag
     // value
    , @RequestParam(name = "rabattBetrag") MonetaryAmount rabattBetrag
     // value
    , @RequestParam(name = "zuzahlungBetrag") MonetaryAmount zuzahlungBetrag
     // value
    , @RequestParam(name = "zuzahlungMwstBetrag") MonetaryAmount zuzahlungMwstBetrag
     // value
    , @RequestParam(name = "leistungserbringer") long leistungserbringer // Leistungserbringer
     // toone2many
    , @RequestParam(name = "verordnung302position") long verordnung302position // Verordnung302Position
     // fromone2many
    ) {

    		try {
    			Verordnung302Kopf d = service.create(versichertenKarteIk, kostenträgerIk, zahlBetrag, bruttoBetrag, mwstBetrag, rabattBetrag, zuzahlungBetrag, zuzahlungMwstBetrag, leistungserbringer, verordnung302position);
    			return DER_DATENSATZ_MIT_DER + d.getVerordnung302KopfId() + " wurden erfolgreich angelegt";
    		} catch (Exception e) {
    			return "Beim Anlegen eines Verordnung302Kopf Datensatzes trat ein Fehler auf";
    		}
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/verordnung302kopf/update/{id}", produces = "application/json", method = RequestMethod.PUT)
    	public String update(@PathVariable(name = "id") long id,
    	              @RequestParam(name = "versichertenKarteIk") IK versichertenKarteIk
    	               // value
    	              , @RequestParam(name = "kostenträgerIk") IK kostenträgerIk
    	               // value
    	              , @RequestParam(name = "zahlBetrag") MonetaryAmount zahlBetrag
    	               // value
    	              , @RequestParam(name = "bruttoBetrag") MonetaryAmount bruttoBetrag
    	               // value
    	              , @RequestParam(name = "mwstBetrag") MonetaryAmount mwstBetrag
    	               // value
    	              , @RequestParam(name = "rabattBetrag") MonetaryAmount rabattBetrag
    	               // value
    	              , @RequestParam(name = "zuzahlungBetrag") MonetaryAmount zuzahlungBetrag
    	               // value
    	              , @RequestParam(name = "zuzahlungMwstBetrag") MonetaryAmount zuzahlungMwstBetrag
    	               // value
    	              , @RequestParam(name = "leistungserbringer") long leistungserbringer // Leistungserbringer
    	               // toone2many
    	              , @RequestParam(name = "verordnung302position") long verordnung302position // Verordnung302Position
    	               // fromone2many
    ) {

    		try {
    			service.update(id,versichertenKarteIk, kostenträgerIk, zahlBetrag, bruttoBetrag, mwstBetrag, rabattBetrag, zuzahlungBetrag, zuzahlungMwstBetrag, leistungserbringer, verordnung302position);
    			return DER_DATENSATZ_MIT_DER + id + " wurden erfolgreich geändert";
    		} catch (Exception e) {
    			return "Beim Ändern des Verordnung302Kopf Datensatzes mit der " + id + " trat ein Fehler auf";
    		}
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/verordnung302kopf/delete/{id}", produces = "application/json", method = RequestMethod.DELETE)
    	public String delete(@PathVariable(name = "id") long id) {

    		try {
    			service.delete(id);
    			return DER_DATENSATZ_MIT_DER + id + " wurden erfolgreich entfernt";
    		} catch (Exception e) {
    			return "Beim Entfernen des Verordnung302Kopf Datensatzes mit der " + id + " trat ein Fehler auf";
    		}
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/verordnung302kopf/get/{id}", produces = "application/json", method = RequestMethod.GET)
    	public Verordnung302Kopf get(@PathVariable(name = "id") long id) {

    		try {
    			Optional<Verordnung302Kopf> o = service.get(id);
    			if (o.isPresent()) {
    				return o.get();
    			}
    		} catch (Exception e) {
    			throw new RuntimeException("Exception bei get ", e);
    		}
    		return null;
    	}




}