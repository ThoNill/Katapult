package tho.nill.preislisten;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import repositories.HMVArtRepository;
import repositories.HMVGruppeRepository;
import repositories.HMVOrtRepository;
import repositories.HMVProduktRepository;
import repositories.HMVUntergruppeRepository;
import repositories.KasseRepository;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HilfsmittelVerzeichnisImportTest {
	
	@Autowired
	HilfsmittelVerzeichnisImport hilfsmittelVerzeichnisImport;
	@Autowired
	public KasseRepository kasseRepository;

	@Autowired
	public HMVProduktRepository hmvProduktRepository;

	@Autowired
	public HMVArtRepository hmvArtRepository;

	@Autowired
	public HMVOrtRepository hmvOrtRepository;

	@Autowired
	public HMVUntergruppeRepository hmvUntergruppeRepository;

	@Autowired
	public HMVGruppeRepository hmvGruppeRepository;
	
	@Before
	public void init() {
		Check.clearDb(hmvProduktRepository,hmvArtRepository,hmvUntergruppeRepository,hmvGruppeRepository,hmvOrtRepository,kasseRepository);
	}


	@Test
	public void test() throws IOException {
		init();
		hilfsmittelVerzeichnisImport.performService("src/test/resources/hmv_test.xml");
	}

}
