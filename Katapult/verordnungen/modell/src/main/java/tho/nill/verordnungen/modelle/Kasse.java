package tho.nill.verordnungen.modelle;

import java.time.LocalDate;

import org.nill.vorlagen.compiler.model.ObjectModell;
import org.nill.vorlagen.object.ddd.Aggregate;
import org.nill.vorlagen.object.ddd.Entity;

import tho.nill.verordnungen.simpleAttributes.IK;
import tho.nill.verordnungen.simpleAttributes.KasseArt;
import tho.nill.verordnungen.simpleAttributes.KassenFunktion;
import tho.nill.verordnungen.verknüpfungen.Verknüpfungen;

public class Kasse extends ObjectModell implements Entity, Aggregate {
	
	public IK ik;
	public KasseArt art;
	public KassenFunktion funktion;
	public String firma;
	public String plz;
	public String ort;
	public String straße;
	public String email;
	// VDT
	public LocalDate gültigAb;
	public LocalDate gültigBis;
	// KTO
	public String iban;
	public String bic;
	public String kontoinhaber;
	// NAM
	public String name;
	public String name2;
	public String name3;
	public String name4;
	// ASP
	
	public String ansprechpartner;
	public String telefon;
	public String fax;
	public String arbeitsgebiet;
	public String benutzerkennung;
	public String übertragung_von;
	public String übertragung_bis;
	public String kommunikationskanal;
	
	public Kasse() throws Exception {
		super();
		addConnection(new Verknüpfungen());
	}

}
