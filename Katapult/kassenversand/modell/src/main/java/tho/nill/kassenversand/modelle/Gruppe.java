package tho.nill.kassenversand.modelle;

import org.nill.vorlagen.compiler.model.ObjectModell;
import org.nill.vorlagen.object.ddd.Aggregate;
import org.nill.vorlagen.object.ddd.Entity;

import tho.nill.kassenversand.simpleAttributes.GruppeArt;
import tho.nill.kassenversand.verknüpfungen.Verknüpfungen;


public class Gruppe extends ObjectModell implements Entity, Aggregate {
	
	public GruppeArt art;
	public Long   nummer;
	public String bezeichnung;
	public String wert;
		
	
	public Gruppe() throws Exception {
		super();
		addConnection(new Verknüpfungen());
	}

}
