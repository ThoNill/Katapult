package tho.nill.kassenversand.verknüpfungen;

import org.nill.vorlagen.compiler.model.ObjectModell;
import org.nill.vorlagen.compiler.util.Connection;

import tho.nill.kassenversand.modelle.Kasse;
import tho.nill.kassenversand.modelle.VersandZiel;

public class Verknüpfungen extends ObjectModell {

	public Connection _ziel = new Connection("one2many",Kasse.class,VersandZiel.class);

	public Verknüpfungen() {
		super();
	}
	
}
