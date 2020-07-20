package tho.nill.verordnungen.modelle;

import org.nill.vorlagen.compiler.model.ObjectModell;
import org.nill.vorlagen.object.ddd.Aggregate;
import org.nill.vorlagen.object.ddd.Entity;

import tho.nill.verordnungen.simpleAttributes.LeistungserbringerCode;
import tho.nill.verordnungen.verknüpfungen.Verknüpfungen;

public class Leistungserbringer extends ObjectModell implements Entity, Aggregate {
	
	public LeistungserbringerCode leistungserbringercode;
	
	public Leistungserbringer() throws Exception {
		super();
		addConnection(new Verknüpfungen());
	}

}
