package tho.nill.kassenversand.versandziel;

import lombok.Data;
import tho.nill.kassenversand.simpleAttributes.Abrechnungscode;
import tho.nill.kassenversand.simpleAttributes.Bundesland;
import tho.nill.kassenversand.simpleAttributes.IK;
import tho.nill.kassenversand.simpleAttributes.KVBezirk;
import tho.nill.kassenversand.simpleAttributes.Leistungserbringergruppe;
import tho.nill.kassenversand.simpleAttributes.Tarifkennzeichen;

@Data
public class VersandzielAbfrageDaten {
	public IK ik;
	public Bundesland land;
	public KVBezirk   bezirk;
	public LeistungserbringerCode abrechnungscode;
	public Tarifkennzeichen tarifkennzeichen;
	public Leistungserbringergruppe leistungserbringergruppe;

	
	public VersandzielAbfrageDaten(IK ik,Bundesland land, KVBezirk bezirk,
			LeistungserbringerCode abrechnungscode, Tarifkennzeichen tarifkennzeichen,
			Leistungserbringergruppe leistungserbringergruppe) {
		super();
		this.ik = ik;
		this.land = land;
		this.bezirk = bezirk;
		this.abrechnungscode = abrechnungscode;
		this.tarifkennzeichen = tarifkennzeichen;
		this.leistungserbringergruppe = leistungserbringergruppe;
	}
	

}