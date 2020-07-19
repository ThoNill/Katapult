package tho.nill.kassenversand.modelle;

import java.time.LocalDate;

import org.nill.vorlagen.compiler.model.ObjectModell;
import org.nill.vorlagen.object.ddd.Aggregate;
import org.nill.vorlagen.object.ddd.Entity;

import tho.nill.kassenversand.simpleAttributes.DFÜMedium;
import tho.nill.kassenversand.simpleAttributes.DFÜParameter;
import tho.nill.kassenversand.simpleAttributes.DFÜProtokoll;
import tho.nill.kassenversand.simpleAttributes.IK;
import tho.nill.kassenversand.simpleAttributes.KasseArt;
import tho.nill.kassenversand.simpleAttributes.KassenFunktion;
import tho.nill.kassenversand.simpleAttributes.Komprimierungsart;
import tho.nill.kassenversand.simpleAttributes.Übermittlungszeichensatz;
import tho.nill.kassenversand.simpleAttributes.Übertragungstage;
import tho.nill.kassenversand.verknüpfungen.Verknüpfungen;

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
	
	// UEM
	public DFÜMedium medium;
	public DFÜParameter parameter;
	public Übermittlungszeichensatz zeichensatz;
	public Komprimierungsart komprimierung;
	
	// DFU
	
	public DFÜProtokoll protokoll;
	public String benutzerkennung;
	public String übertragung_von;
	public String übertragung_bis;
	public Übertragungstage übertragungstage;
	public String kommunikationskanal;
	
	public Kasse() throws Exception {
		super();
		addConnection(new Verknüpfungen());
	}

}
