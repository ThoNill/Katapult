package tho.nill.kassenversand.simpleAttributes;

public enum GruppeArt {
 NN;
	
	public static GruppeArt search(String code) {
		return valueOf(code);
	}

}
