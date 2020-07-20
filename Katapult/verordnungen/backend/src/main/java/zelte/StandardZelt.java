package zelte;

import javax.money.MonetaryAmount;

import tho.nill.grundgestein.zelt.EntityZelt;
import tho.nill.verordnungen.simpleAttributes.Geld;
import tho.nill.verordnungen.simpleAttributes.IK;
import tho.nill.verordnungen.simpleAttributes.LeistungserbringerCode;
import tho.nill.verordnungen.simpleAttributes.Tarifkennzeichen;

public class StandardZelt implements EntityZelt {

	public StandardZelt() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub

	}

	@Override
	public void save() {
		// TODO Auto-generated method stub

	}

	protected IK convertToIK(String value) {
		if ("".contentEquals(value.strip())) {
			return null;
		}
		return new IK(Integer.parseInt(value));
	}
	
	protected Tarifkennzeichen convertToTarifkennzeichen(String value) {
		return new Tarifkennzeichen(value);
	}


	protected MonetaryAmount convertToMonetaryAmount(String value) {
		return Geld.createAmount(Double.parseDouble(value.strip()));
	}
}
