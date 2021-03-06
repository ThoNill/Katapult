package tho.nill.kassenversand.modelle;

import org.nill.vorlagen.compiler.model.ObjectModell;
import org.nill.vorlagen.object.ddd.Aggregate;
import org.nill.vorlagen.object.ddd.Entity;

import tho.nill.kassenversand.simpleAttributes.Abrechnungscode;
import tho.nill.kassenversand.simpleAttributes.Bundesland;
import tho.nill.kassenversand.simpleAttributes.DFÜMedium;
import tho.nill.kassenversand.simpleAttributes.DatenlieferungsArt;
import tho.nill.kassenversand.simpleAttributes.IK;
import tho.nill.kassenversand.simpleAttributes.KVBezirk;
import tho.nill.kassenversand.simpleAttributes.Leistungserbringergruppe;
import tho.nill.kassenversand.simpleAttributes.Tarifkennzeichen;
import tho.nill.kassenversand.simpleAttributes.VerweisArt;
import tho.nill.kassenversand.verknüpfungen.Verknüpfungen;

public class VersandZiel extends ObjectModell implements Entity, Aggregate {
	
	public IK von_ik;
	public IK nach_ik;
	public IK kostenträger;
	
	public DatenlieferungsArt art;
	public VerweisArt verweis;
	public DFÜMedium medium;
	public Bundesland land;
	public KVBezirk   bezirk;
	public Abrechnungscode abrechnungscode;
	public Tarifkennzeichen tarifkennzeichen;
	public Leistungserbringergruppe leistungserbringergruppe;
	
	/*
	VKG Segment Verknüpfung M C 3 wdh. VKG  Art der Verknüpfung M N 2  
	Schlüssel Art der Verknüpfung  
	IK
	des Verknüpfungspartners M N 9  Institutionskennzeichen  
	Leistungserbringergruppe K N 1  Schlüssel LE-Gruppe  
	IK der Abrechnungsstelle K N 9  IK der Abrechnungsstelle, für welche dieser Verweis gültig ist. 
	Fehlt dieser Eintrag, ist der Verweis für alle Stellen gültig.  
	
	Art der Datenlieferung K N 2  Schlüssel Art der Datenlieferung  
	Art des Übermittlungsmediums K N 1  Schlüssel Übermittlungsmedium  
	Standort des Leistungserbringers nach Bundesland K N 2  Schlüssel Bundesland  
	Standort des Leistungserbringers nach KV-Bezirk K N 2  Schlüssel KV-Bezirk  
	Abrechnungscode4  (Leistungserbringerart) K N 2  Schlüssel Abrechnungscode  
	Tarifkennzeichen K N 5  Schlüssel Tarifkennzeichen 
	*/
	
	public VersandZiel() throws Exception {
		super();
		addConnection(new Verknüpfungen());
	}

}
