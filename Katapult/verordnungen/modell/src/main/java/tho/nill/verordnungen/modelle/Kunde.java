package tho.nill.verordnungen.modelle;

import org.nill.vorlagen.compiler.model.ObjectModell;
import org.nill.vorlagen.object.ddd.Aggregate;
import org.nill.vorlagen.object.ddd.Entity;

import tho.nill.verordnungen.simpleAttributes.LeistungserbringerCode;
import tho.nill.verordnungen.simpleAttributes.IK;
import tho.nill.verordnungen.simpleAttributes.Tarifbereich;
import tho.nill.verordnungen.verknüpfungen.Verknüpfungen;

public class Kunde extends ObjectModell implements Entity, Aggregate {
	
	public IK ik;
	public Tarifbereich tarifbereich;
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
