package tho.nill.verordnungen.simpleAttributes;

public enum DatumArt {
	Leistungsdatum, Verordnungsdatum, Abgabedatum, ErstesLeistungsdatum;
	
	public static DatumArt search(String code) {
		return valueOf(code);
	}
}
