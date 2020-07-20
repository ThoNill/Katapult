package services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import entities.Leistungserbringer;

import tho.nill.verordnungen.simpleAttributes.LeistungserbringerCode;





@RestController
@CrossOrigin(origins = "https://localhost:4200", maxAge = 3600)
@RequestMapping("/api")
public class LeistungserbringerEntityController  {



    	private static final String DER_DATENSATZ_MIT_DER = "Der Leistungserbringer Datensatz mit der ";
    	@Autowired
    	private LeistungserbringerEntityService service;

    	public LeistungserbringerEntityController() {
    		super();
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/leistungserbringer/insert", produces = "application/json", method = RequestMethod.POST)
    	public String create(@RequestParam(name = "leistungserbringercode") LeistungserbringerCode leistungserbringercode
     // enumeration
    , @RequestParam(name = "kunde") long kunde // Kunde
     // toone2many
    , @RequestParam(name = "rechnungposition") long rechnungposition // RechnungPosition
     // fromone2many
    , @RequestParam(name = "verordnung302kopf") long verordnung302kopf // Verordnung302Kopf
     // fromone2many
    ) {

    		try {
    			Leistungserbringer d = service.create(leistungserbringercode, kunde, rechnungposition, verordnung302kopf);
    			return DER_DATENSATZ_MIT_DER + d.getLeistungserbringerId() + " wurden erfolgreich angelegt";
    		} catch (Exception e) {
    			return "Beim Anlegen eines Leistungserbringer Datensatzes trat ein Fehler auf";
    		}
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/leistungserbringer/update/{id}", produces = "application/json", method = RequestMethod.PUT)
    	public String update(@PathVariable(name = "id") long id,
    	              @RequestParam(name = "leistungserbringercode") LeistungserbringerCode leistungserbringercode
    	               // enumeration
    	              , @RequestParam(name = "kunde") long kunde // Kunde
    	               // toone2many
    	              , @RequestParam(name = "rechnungposition") long rechnungposition // RechnungPosition
    	               // fromone2many
    	              , @RequestParam(name = "verordnung302kopf") long verordnung302kopf // Verordnung302Kopf
    	               // fromone2many
    ) {

    		try {
    			service.update(id,leistungserbringercode, kunde, rechnungposition, verordnung302kopf);
    			return DER_DATENSATZ_MIT_DER + id + " wurden erfolgreich geändert";
    		} catch (Exception e) {
    			return "Beim Ändern des Leistungserbringer Datensatzes mit der " + id + " trat ein Fehler auf";
    		}
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/leistungserbringer/delete/{id}", produces = "application/json", method = RequestMethod.DELETE)
    	public String delete(@PathVariable(name = "id") long id) {

    		try {
    			service.delete(id);
    			return DER_DATENSATZ_MIT_DER + id + " wurden erfolgreich entfernt";
    		} catch (Exception e) {
    			return "Beim Entfernen des Leistungserbringer Datensatzes mit der " + id + " trat ein Fehler auf";
    		}
    	}

    	@CrossOrigin
    	@RequestMapping(path = "/entity/leistungserbringer/get/{id}", produces = "application/json", method = RequestMethod.GET)
    	public Leistungserbringer get(@PathVariable(name = "id") long id) {

    		try {
    			Optional<Leistungserbringer> o = service.get(id);
    			if (o.isPresent()) {
    				return o.get();
    			}
    		} catch (Exception e) {
    			throw new RuntimeException("Exception bei get ", e);
    		}
    		return null;
    	}




}