package tho.nill.verordnungen.simpleAttributes;

public enum KassenFunktion {
	Krankenversichertenkarte, Abrechnungskasse, Prüfstelle, Datenannahme;

	public static KassenFunktion search(String code) {
		return valueOf(code);
	}
}
