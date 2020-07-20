package services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import entities.RechnungKopf;

import tho.nill.verordnungen.simpleAttributes.IK;

import tho.nill.verordnungen.simpleAttributes.IK;

import tho.nill.verordnungen.simpleAttributes.IK;

import tho.nill.verordnungen.simpleAttributes.IK;

import tho.nill.verordnungen.simpleAttributes.IK;

import tho.nill.verordnungen.simpleAttributes.IK;

import tho.nill.verordnungen.simpleAttributes.IK;

import javax.money.MonetaryAmount;

import javax.money.MonetaryAmount;

import javax.money.MonetaryAmount;

import javax.money.MonetaryAmount;

import javax.money.MonetaryAmount;



@RestController
@CrossOrigin(origins = "https://localhost:4200", maxAge = 3600)
@RequestMapping("/api")
public class RechnungKopfEntityController  {



    	private static final String DER_DATENSATZ_MIT_DER = "Der RechnungKopf Datensatz mit der ";
    	@Autowired
    	private RechnungKopfEntityService service;

    	public RechnungKopfEntityController() {
    		super();
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/rechnungkopf/insert", produces = "application/json", method = RequestMethod.POST)
    	public String create(@RequestParam(name = "versichertenKarteIk") IK versichertenKarteIk
     // value
    , @RequestParam(name = "kostenträgerIk") IK kostenträgerIk
     // value
    , @RequestParam(name = "papierIk") IK papierIk
     // value
    , @RequestParam(name = "prüfstelleIk") IK prüfstelleIk
     // value
    , @RequestParam(name = "datenannahmeIk") IK datenannahmeIk
     // value
    , @RequestParam(name = "image_prüfstelleIk") IK image_prüfstelleIk
     // value
    , @RequestParam(name = "image_datenanahmeIk") IK image_datenanahmeIk
     // value
    , @RequestParam(name = "zahlBetrag") MonetaryAmount zahlBetrag
     // value
    , @RequestParam(name = "zuzahlungBetrag") MonetaryAmount zuzahlungBetrag
     // value
    , @RequestParam(name = "mwstBetrag") MonetaryAmount mwstBetrag
     // value
    , @RequestParam(name = "rabattBetrag") MonetaryAmount rabattBetrag
     // value
    , @RequestParam(name = "skontoBetrag") MonetaryAmount skontoBetrag
     // value
    , @RequestParam(name = "rechnungposition") long rechnungposition // RechnungPosition
     // fromone2many
    ) {

    		try {
    			RechnungKopf d = service.create(versichertenKarteIk, kostenträgerIk, papierIk, prüfstelleIk, datenannahmeIk, image_prüfstelleIk, image_datenanahmeIk, zahlBetrag, zuzahlungBetrag, mwstBetrag, rabattBetrag, skontoBetrag, rechnungposition);
    			return DER_DATENSATZ_MIT_DER + d.getRechnungKopfId() + " wurden erfolgreich angelegt";
    		} catch (Exception e) {
    			return "Beim Anlegen eines RechnungKopf Datensatzes trat ein Fehler auf";
    		}
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/rechnungkopf/update/{id}", produces = "application/json", method = RequestMethod.PUT)
    	public String update(@PathVariable(name = "id") long id,
    	              @RequestParam(name = "versichertenKarteIk") IK versichertenKarteIk
    	               // value
    	              , @RequestParam(name = "kostenträgerIk") IK kostenträgerIk
    	               // value
    	              , @RequestParam(name = "papierIk") IK papierIk
    	               // value
    	              , @RequestParam(name = "prüfstelleIk") IK prüfstelleIk
    	               // value
    	              , @RequestParam(name = "datenannahmeIk") IK datenannahmeIk
    	               // value
    	              , @RequestParam(name = "image_prüfstelleIk") IK image_prüfstelleIk
    	               // value
    	              , @RequestParam(name = "image_datenanahmeIk") IK image_datenanahmeIk
    	               // value
    	              , @RequestParam(name = "zahlBetrag") MonetaryAmount zahlBetrag
    	               // value
    	              , @RequestParam(name = "zuzahlungBetrag") MonetaryAmount zuzahlungBetrag
    	               // value
    	              , @RequestParam(name = "mwstBetrag") MonetaryAmount mwstBetrag
    	               // value
    	              , @RequestParam(name = "rabattBetrag") MonetaryAmount rabattBetrag
    	               // value
    	              , @RequestParam(name = "skontoBetrag") MonetaryAmount skontoBetrag
    	               // value
    	              , @RequestParam(name = "rechnungposition") long rechnungposition // RechnungPosition
    	               // fromone2many
    ) {

    		try {
    			service.update(id,versichertenKarteIk, kostenträgerIk, papierIk, prüfstelleIk, datenannahmeIk, image_prüfstelleIk, image_datenanahmeIk, zahlBetrag, zuzahlungBetrag, mwstBetrag, rabattBetrag, skontoBetrag, rechnungposition);
    			return DER_DATENSATZ_MIT_DER + id + " wurden erfolgreich geändert";
    		} catch (Exception e) {
    			return "Beim Ändern des RechnungKopf Datensatzes mit der " + id + " trat ein Fehler auf";
    		}
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/rechnungkopf/delete/{id}", produces = "application/json", method = RequestMethod.DELETE)
    	public String delete(@PathVariable(name = "id") long id) {

    		try {
    			service.delete(id);
    			return DER_DATENSATZ_MIT_DER + id + " wurden erfolgreich entfernt";
    		} catch (Exception e) {
    			return "Beim Entfernen des RechnungKopf Datensatzes mit der " + id + " trat ein Fehler auf";
    		}
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/rechnungkopf/get/{id}", produces = "application/json", method = RequestMethod.GET)
    	public RechnungKopf get(@PathVariable(name = "id") long id) {

    		try {
    			Optional<RechnungKopf> o = service.get(id);
    			if (o.isPresent()) {
    				return o.get();
    			}
    		} catch (Exception e) {
    			throw new RuntimeException("Exception bei get ", e);
    		}
    		return null;
    	}




}