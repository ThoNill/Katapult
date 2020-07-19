package tho.nill.kassenversand.simpleAttributes;

public enum KassenFunktion {
	Krankenversichertenkarte, Abrechnungskasse, Prüfstelle, Datenannahme;

	public static KassenFunktion search(String code) {
		return valueOf(code);
	}
}
