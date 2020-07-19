package tho.nill.verordnungen.modelle;

import javax.money.MonetaryAmount;

import org.nill.vorlagen.compiler.model.ObjectModell;
import org.nill.vorlagen.object.ddd.Aggregate;
import org.nill.vorlagen.object.ddd.Entity;

import tho.nill.verordnungen.simpleAttributes.IK;
import tho.nill.verordnungen.simpleAttributes.MwstArt;
import tho.nill.verordnungen.verknüpfungen.Verknüpfungen;

public class Verordnung302Kopf extends ObjectModell implements Entity, Aggregate{

	public Verordnung302Kopf() throws Exception {
		super();
		addConnection(new Verknüpfungen());
	}

	IK versichertenKarteIk;
	IK kostenträgerIk;

	MonetaryAmount zahlBetrag;
	MonetaryAmount bruttoBetrag;
	MonetaryAmount mwstBetrag;
	MonetaryAmount rabattBetrag;
	MonetaryAmount zuzahlungBetrag;
	MonetaryAmount zuzahlungMwstBetrag;
}
