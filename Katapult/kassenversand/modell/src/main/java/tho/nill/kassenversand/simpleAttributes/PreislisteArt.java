package tho.nill.kassenversand.simpleAttributes;

public enum PreislisteArt {
	Erwachsene, Kinder;
	
	public static PreislisteArt search(String code) {
		return valueOf(code);
	}
}
