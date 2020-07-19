package tho.nill.kassenversand.modelle;

import org.nill.vorlagen.compiler.model.ObjectModell;
import org.nill.vorlagen.object.ddd.Aggregate;
import org.nill.vorlagen.object.ddd.Entity;

import tho.nill.kassenversand.simpleAttributes.Abrechnungscode;
import tho.nill.kassenversand.simpleAttributes.IK;
import tho.nill.kassenversand.simpleAttributes.Tarifbereich;
import tho.nill.kassenversand.verknüpfungen.Verknüpfungen;

public class Kunde extends ObjectModell implements Entity, Aggregate {
	
	public IK ik;
	public Tarifbereich tarifbereich;
	public Abrechnungscode abrechnungscode;
	public String ansprechpartner;
	public String firma;
	public String plz;
	public String ort;
	public String straße;
	public String telefon;
	public String email;
		
	
	public Kunde() throws Exception {
		super();
		addConnection(new Verknüpfungen());
	}

}
