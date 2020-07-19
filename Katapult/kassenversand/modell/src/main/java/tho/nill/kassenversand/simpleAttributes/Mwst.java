package tho.nill.kassenversand.simpleAttributes;

public enum Mwst {
	Mwst7,Mwst16,Mwst19;
	
	public static Mwst search(String code) {
		return valueOf(code);
	}
}
