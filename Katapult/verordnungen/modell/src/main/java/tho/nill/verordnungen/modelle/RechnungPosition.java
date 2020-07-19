package tho.nill.verordnungen.modelle;

import javax.money.MonetaryAmount;

import org.nill.vorlagen.compiler.model.ObjectModell;
import org.nill.vorlagen.object.ddd.Aggregate;
import org.nill.vorlagen.object.ddd.Entity;

import tho.nill.verordnungen.simpleAttributes.MwstArt;
import tho.nill.verordnungen.verknüpfungen.Verknüpfungen;

public class RechnungPosition extends ObjectModell implements Entity, Aggregate{

	public RechnungPosition() throws Exception {
		super();
		addConnection(new Verknüpfungen());
	}

	
	MonetaryAmount zahlBetrag;
	MonetaryAmount bruttoBetrag;
	MwstArt        mwstArt;
	MonetaryAmount mwstBetrag;
	MonetaryAmount rabattBetrag;
	MonetaryAmount zuzahlungBetrag;
	MonetaryAmount zuzahlungMwstBetrag;



}
