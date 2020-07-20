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

import entities.RechnungPosition;
import tho.nill.verordnungen.simpleAttributes.MwstArt;



@RestController
@CrossOrigin(origins = "https://localhost:4200", maxAge = 3600)
@RequestMapping("/api")
public class RechnungPositionEntityController  {



    	private static final String DER_DATENSATZ_MIT_DER = "Der RechnungPosition Datensatz mit der ";
    	@Autowired
    	private RechnungPositionEntityService service;

    	public RechnungPositionEntityController() {
    		super();
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/rechnungposition/insert", produces = "application/json", method = RequestMethod.POST)
    	public String create(@RequestParam(name = "zahlBetrag") MonetaryAmount zahlBetrag
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
    , @RequestParam(name = "rechnungkopf") long rechnungkopf // RechnungKopf
     // toone2many
    ) {

    		try {
    			RechnungPosition d = service.create(zahlBetrag, bruttoBetrag, mwstArt, mwstBetrag, rabattBetrag, zuzahlungBetrag, zuzahlungMwstBetrag, rechnungkopf);
    			return DER_DATENSATZ_MIT_DER + d.getRechnungPositionId() + " wurden erfolgreich angelegt";
    		} catch (Exception e) {
    			return "Beim Anlegen eines RechnungPosition Datensatzes trat ein Fehler auf";
    		}
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/rechnungposition/update/{id}", produces = "application/json", method = RequestMethod.PUT)
    	public String update(@PathVariable(name = "id") long id,
    	              @RequestParam(name = "zahlBetrag") MonetaryAmount zahlBetrag
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
    	              , @RequestParam(name = "rechnungkopf") long rechnungkopf // RechnungKopf
    	               // toone2many
    ) {

    		try {
    			service.update(id,zahlBetrag, bruttoBetrag, mwstArt, mwstBetrag, rabattBetrag, zuzahlungBetrag, zuzahlungMwstBetrag, rechnungkopf);
    			return DER_DATENSATZ_MIT_DER + id + " wurden erfolgreich geändert";
    		} catch (Exception e) {
    			return "Beim Ändern des RechnungPosition Datensatzes mit der " + id + " trat ein Fehler auf";
    		}
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/rechnungposition/delete/{id}", produces = "application/json", method = RequestMethod.DELETE)
    	public String delete(@PathVariable(name = "id") long id) {

    		try {
    			service.delete(id);
    			return DER_DATENSATZ_MIT_DER + id + " wurden erfolgreich entfernt";
    		} catch (Exception e) {
    			return "Beim Entfernen des RechnungPosition Datensatzes mit der " + id + " trat ein Fehler auf";
    		}
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/rechnungposition/get/{id}", produces = "application/json", method = RequestMethod.GET)
    	public RechnungPosition get(@PathVariable(name = "id") long id) {

    		try {
    			Optional<RechnungPosition> o = service.get(id);
    			if (o.isPresent()) {
    				return o.get();
    			}
    		} catch (Exception e) {
    			throw new RuntimeException("Exception bei get ", e);
    		}
    		return null;
    	}




}