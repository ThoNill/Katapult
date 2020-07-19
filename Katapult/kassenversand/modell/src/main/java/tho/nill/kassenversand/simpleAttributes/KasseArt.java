package tho.nill.kassenversand.simpleAttributes;

public enum KasseArt {
	AOK, BKK, IKK, Knappschaft, Barmer, TK;
	
	public static KasseArt search(String code) {
		return valueOf(code);
	}
}
