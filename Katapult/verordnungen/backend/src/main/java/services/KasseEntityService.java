package services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Kasse;
import repositories.KasseRepository;

import tho.nill.verordnungen.simpleAttributes.IK;

import tho.nill.verordnungen.simpleAttributes.KasseArt;

import tho.nill.verordnungen.simpleAttributes.KassenFunktion;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.time.LocalDate;

import java.time.LocalDate;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;

import java.lang.String;


import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Service
public class KasseEntityService  {

    	@Autowired
    	KasseRepository repo;



    	public KasseEntityService() {
    		super();
    	}

    	public Optional<Kasse> get(long id) {
    		return repo.findById(id);
    	}

    	public Kasse create(IK  ik, KasseArt  art, KassenFunktion  funktion, String  firma, String  plz, String  ort, String  straße, String  email, LocalDate  gültigAb, LocalDate  gültigBis, String  iban, String  bic, String  kontoinhaber, String  name, String  name2, String  name3, String  name4, String  ansprechpartner, String  telefon, String  fax, String  arbeitsgebiet, String  benutzerkennung, String  übertragung_von, String  übertragung_bis, String  kommunikationskanal) {
    		Kasse d = new Kasse();
    		felderSetzen(d, ik, art, funktion, firma, plz, ort, straße, email, gültigAb, gültigBis, iban, bic, kontoinhaber, name, name2, name3, name4, ansprechpartner, telefon, fax, arbeitsgebiet, benutzerkennung, übertragung_von, übertragung_bis, kommunikationskanal);
    		return repo.save(d);
    	}

    	public void update(long id, IK  ik, KasseArt  art, KassenFunktion  funktion, String  firma, String  plz, String  ort, String  straße, String  email, LocalDate  gültigAb, LocalDate  gültigBis, String  iban, String  bic, String  kontoinhaber, String  name, String  name2, String  name3, String  name4, String  ansprechpartner, String  telefon, String  fax, String  arbeitsgebiet, String  benutzerkennung, String  übertragung_von, String  übertragung_bis, String  kommunikationskanal) {
    		Kasse d = repo.getOne(id);
    		felderSetzen(d, ik, art, funktion, firma, plz, ort, straße, email, gültigAb, gültigBis, iban, bic, kontoinhaber, name, name2, name3, name4, ansprechpartner, telefon, fax, arbeitsgebiet, benutzerkennung, übertragung_von, übertragung_bis, kommunikationskanal);
    		repo.save(d);
    	}

    	public void delete(long id) {
    		repo.deleteById(id);
    	}

    	private void felderSetzen(Kasse d, 
    	IK  ik, KasseArt  art, KassenFunktion  funktion, String  firma, String  plz, String  ort, String  straße, String  email, LocalDate  gültigAb, LocalDate  gültigBis, String  iban, String  bic, String  kontoinhaber, String  name, String  name2, String  name3, String  name4, String  ansprechpartner, String  telefon, String  fax, String  arbeitsgebiet, String  benutzerkennung, String  übertragung_von, String  übertragung_bis, String  kommunikationskanal
    	) {
    	d.setIk(ik);
    	d.setArt(art);
    	d.setFunktion(funktion);
    	d.setFirma(firma);
    	d.setPlz(plz);
    	d.setOrt(ort);
    	d.setStraße(straße);
    	d.setEmail(email);
    	d.setIban(iban);
    	d.setBic(bic);
    	d.setKontoinhaber(kontoinhaber);
    	d.setName(name);
    	d.setName2(name2);
    	d.setName3(name3);
    	d.setName4(name4);
    	d.setAnsprechpartner(ansprechpartner);
    	d.setTelefon(telefon);
    	d.setFax(fax);
    	d.setArbeitsgebiet(arbeitsgebiet);
    	d.setBenutzerkennung(benutzerkennung);
    	d.setÜbertragung_von(übertragung_von);
    	d.setÜbertragung_bis(übertragung_bis);
    	d.setKommunikationskanal(kommunikationskanal);
    	
    	}


}