package tho.nill.verordnungen.simpleAttributes;

import java.time.LocalDate;

public enum Mwst {
	Keine(MwstArt.Keine,null,null,0.0),

	Mwst5(MwstArt.Halb,new MonatJahr(1,1968),new MonatJahr(6,1968),0.05),
	Mwst5k5(MwstArt.Halb,new MonatJahr(7,1968),new MonatJahr(12,1977),0.055),
	Mwst6(MwstArt.Halb,new MonatJahr(1,1978),new MonatJahr(6,1979),0.06),
	Mwst6k5(MwstArt.Halb,new MonatJahr(7,1979),new MonatJahr(6,1983),0.065),
	Mwst7(MwstArt.Halb,new MonatJahr(7,1983),new MonatJahr(6,2020),0.07),
	Mwst5Corona(MwstArt.Halb,new MonatJahr(7,2020),new MonatJahr(12,2020),0.05),
	Mwst7NachCorona(MwstArt.Halb,new MonatJahr(1,2021),null,0.07),
	
	Mwst10(MwstArt.Voll,new MonatJahr(1,1968),new MonatJahr(6,1968),0.10),
	Mwst11(MwstArt.Voll,new MonatJahr(7,1968),new MonatJahr(12,1977),0.11),
	Mwst12(MwstArt.Voll,new MonatJahr(1,1978),new MonatJahr(6,1979),0.12),
	Mwst13(MwstArt.Voll,new MonatJahr(7,1979),new MonatJahr(6,1983),0.13),
	Mwst14(MwstArt.Voll,new MonatJahr(7,1983),new MonatJahr(12,1992),0.14),
	Mwst15(MwstArt.Voll,new MonatJahr(1,1993),new MonatJahr(3,1998),0.15),
	Mwst16(MwstArt.Voll,new MonatJahr(4,1998),new MonatJahr(12,2006),0.16),
	Mwst19(MwstArt.Voll,new MonatJahr(1,2007),new MonatJahr(6,2020),0.19),
	Mwst16Corona(MwstArt.Voll,new MonatJahr(7,2020),new MonatJahr(12,2020),0.16),
	Mwst19NachCorona(MwstArt.Voll,new MonatJahr(1,2021),null,0.19);
	
	
	private MwstArt art;
	private MonatJahr von;
	private MonatJahr bis;
	private double prozentSatz;

	private Mwst(MwstArt art, MonatJahr von, MonatJahr bis, double prozentSatz) {
		this.art = art;
		this.von = von;
		this.bis = bis;
		this.prozentSatz = prozentSatz;
	}

	public MwstArt getArt() {
		return art;
	}

	public MonatJahr getVon() {
		return von;
	}

	public MonatJahr getBis() {
		return bis;
	}

	public double getProzentSatz() {
		return prozentSatz;
	}
	
	private boolean passt(MonatJahr mj) {
		return ((von == null || von.compareTo(mj)<=0) && (bis == null || bis.compareTo(mj)>=0));
	}

	public Mwst getSteuersatz(MwstArt art,LocalDate datum) {
		int m = datum.getMonth().getValue();
		int j = datum.getYear();
		MonatJahr mj = new MonatJahr(m, j);
		for(Mwst mwst : values()) {
			if (mwst.passt(mj)) {
				return mwst;
			}
		}
		return null;
	}
}
/*
https://lutz-rae.de/
*/