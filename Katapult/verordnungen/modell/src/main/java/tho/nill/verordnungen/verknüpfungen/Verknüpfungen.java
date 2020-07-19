package tho.nill.verordnungen.verknüpfungen;

import org.nill.vorlagen.compiler.model.ObjectModell;
import org.nill.vorlagen.compiler.util.Connection;

import tho.nill.verordnungen.modelle.Kasse;
import tho.nill.verordnungen.modelle.RechnungKopf;
import tho.nill.verordnungen.modelle.RechnungPosition;
import tho.nill.verordnungen.modelle.Verordnung302Kopf;
import tho.nill.verordnungen.modelle.Verordnung302Position;


public class Verknüpfungen extends ObjectModell {

	public Connection _rechnung_pos = new Connection("one2many",RechnungKopf.class,RechnungPosition.class);
	public Connection _verordnung_pos = new Connection("one2many",Verordnung302Kopf.class,Verordnung302Position.class);

	public Verknüpfungen() {
		super();
	}
	
}
