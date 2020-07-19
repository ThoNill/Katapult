package tho.nill.kassenversand.versandziel;

import lombok.Data;
import tho.nill.kassenversand.simpleAttributes.IK;

@Data
public class P302Ergebnis {
	private IK versichertenkarte;
	private IK kostenträger;
	private IK papier;
	private IK datenannahmestelle;
	private IK prüfstelle;

	public P302Ergebnis(IK versichertenkarte, IK kostenträger, IK papier,IK prüfstelle, IK datenannahmestelle ) {
		super();
		this.versichertenkarte = versichertenkarte;
		this.kostenträger = kostenträger;
		this.papier = papier;
		this.datenannahmestelle = datenannahmestelle;
		this.prüfstelle = prüfstelle;
	}
	

	
	
}
