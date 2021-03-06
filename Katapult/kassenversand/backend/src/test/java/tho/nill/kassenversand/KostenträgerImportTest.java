package tho.nill.kassenversand;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import entities.Kasse;
import lombok.extern.slf4j.Slf4j;
import repositories.KasseRepository;
import repositories.VersandZielRepository;
import tho.nill.kassenversand.simpleAttributes.Abrechnungscode;
import tho.nill.kassenversand.simpleAttributes.Bundesland;
import tho.nill.kassenversand.simpleAttributes.IK;
import tho.nill.kassenversand.simpleAttributes.KVBezirk;
import tho.nill.kassenversand.simpleAttributes.Leistungserbringergruppe;
import tho.nill.kassenversand.simpleAttributes.Tarifkennzeichen;
import tho.nill.kassenversand.versandziel.P302Ergebnis;
import tho.nill.kassenversand.versandziel.VersandzielAbfrageDaten;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class KostenträgerImportTest {

	@Autowired
	KostenträgerImportService kostenträgerImportService;

	@Autowired
	KostenträgerInfoService kostenträgerInfoService;

	@Autowired
	public KasseRepository kasseRepository;

	@Autowired
	public VersandZielRepository versandZielRepository;

	@Before
	public void init() {
		Check.clearDb(versandZielRepository, kasseRepository);
	}

	@Test
	public void test() throws IOException {
		kostenträgerImportService.performService("src/test/resources/BK05Q220.ke0");
		List<Kasse> kl = kasseRepository.findByIk(new IK(661430046));
		assertEquals(1, kl.size());
		Kasse k = kl.get(0);
		/*
		 * UNH+00342+KOTR:02:001:KV' IDK+661430046+99+DAVASO (vorm. Syntela)'
		 * VDT+20050101' FKT+01' NAM+01+DAVASO GmbH (vorm. Syntela)'
		 * ANS+1+04356+Leipzig+Am Alten Flughafen 1' ANS+3+04311+Leipzig'
		 * ASP+01+0341/25920-0+0341/25920-20++Zentrale' UEM+1+00+I8'
		 * DFU+01+070+++++da302@syntela.de' DFU+02+016+++++ftam.syntela.de?:9000'
		 */
		assertEquals("DAVASO (vorm. Syntela)", k.getFirma());
		assertEquals("DAVASO GmbH (vorm. Syntela)", k.getName());
		assertEquals("04356", k.getPlz());
		assertEquals("Leipzig", k.getOrt());
		assertEquals("Am Alten Flughafen 1", k.getStraße());
		assertEquals("0341/25920-0", k.getTelefon());
		assertEquals("0341/25920-20", k.getFax());
		assertEquals("Zentrale", k.getArbeitsgebiet());
		assertEquals("da302@syntela.de", k.getKommunikationskanal());

		VersandzielAbfrageDaten abfrage = new VersandzielAbfrageDaten(new IK(101320032),
				Bundesland.Baden_Württemberg_08, KVBezirk.Koblenz_47,
				LeistungserbringerCode.Ergotherapeut_26, new Tarifkennzeichen("00"), Leistungserbringergruppe.Sonstige_5);

		P302Ergebnis erg = kostenträgerInfoService.service(abfrage);
		assertEquals(new IK(101320032), erg.getVersichertenkarte());
		assertEquals(new IK(101320032), erg.getKostenträger());
		assertEquals(new IK(107436557), erg.getPrüfstelle());
		assertEquals(new IK(107436557), erg.getPapier());
		assertEquals(new IK(107436557), erg.getDatenannahmestelle());
	}

	@Test
	public void doppeltEinlesen() throws IOException {
		kostenträgerImportService.performService("src/test/resources/BK05Q220.ke0");
		long anzKassen = kasseRepository.count();
		long anzVersandZiele = versandZielRepository.count();
		kostenträgerImportService.performService("src/test/resources/BK05Q220.ke0");
		List<Kasse> kl = kasseRepository.findByIk(new IK(661430046));
		assertEquals(1, kl.size());
		assertEquals(anzKassen, kasseRepository.count());
		assertEquals(anzVersandZiele, versandZielRepository.count());

	}
}
