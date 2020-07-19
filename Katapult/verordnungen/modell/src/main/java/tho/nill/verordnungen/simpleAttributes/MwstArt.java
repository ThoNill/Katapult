package tho.nill.verordnungen.simpleAttributes;

public enum MwstArt {
	Keine,Halb,Voll;
	
	public static MwstArt search(String code) {
		return valueOf(code);
	}
}
