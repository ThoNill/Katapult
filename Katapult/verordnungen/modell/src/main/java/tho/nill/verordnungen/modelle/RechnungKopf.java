package tho.nill.verordnungen.modelle;

import javax.money.MonetaryAmount;

import org.nill.vorlagen.compiler.model.ObjectModell;
import org.nill.vorlagen.object.ddd.Aggregate;
import org.nill.vorlagen.object.ddd.Entity;

import tho.nill.verordnungen.simpleAttributes.IK;
import tho.nill.verordnungen.verknüpfungen.Verknüpfungen;

public class RechnungKopf extends ObjectModell implements Entity, Aggregate {

	public RechnungKopf() throws Exception {
		super();
		addConnection(new Verknüpfungen());
	}

	IK versichertenKarteIk;
	IK kostenträgerIk;
	IK papierIk;
	IK prüfstelleIk;
	IK datenannahmeIk;
	IK image_prüfstelleIk;
	IK image_datenanahmeIk;
	
	MonetaryAmount zahlBetrag;
	MonetaryAmount zuzahlungBetrag;
	MonetaryAmount mwstBetrag;
	MonetaryAmount rabattBetrag;
	MonetaryAmount skontoBetrag;
}
