package test.java.org.SteinKo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.java.Element;
import main.java.Koe;
import main.java.Liste;




	public class KoeTest {
		Liste<Element>  liste;
		
		@Before
		public void setUp()
		{
		  liste = new Koe<Element>();
		}
		@Test
		public void testerTom() {
			
			assertTrue(liste.erTom());	
		}
		
		@Test
		public void testerikkTom() {
			
			assertTrue(liste.erTom());	
		}
		

	@Test
		
		public void testerTaUTTom() {
			
			Element element = liste.fjern();
			assertNull(element);
		}
	@Test
	public void testSetinn() {

		Element settinnelement = new Element("A");
		liste.settInn(settinnelement);
		assertFalse(liste.erTom());
		Element taUtElement = liste.fjern();
		assertTrue(liste.erTom());
		assertEquals(settinnelement.getNavn(),taUtElement.getNavn());
		
		
	}

	@Test
	public void testSetinn2elementer() {
		
		Element settinnelement1 = new Element("A");
		liste.settInn(settinnelement1);
		Element settinnelement2 = new Element("B");
		liste.settInn(settinnelement2);
		assertFalse(liste.erTom());
		Element taUtElement1 = liste.fjern();
		assertFalse(liste.erTom());
		assertEquals(settinnelement1.getNavn(),taUtElement1.getNavn());
		Element taUtElement2 = liste.fjern();
		assertTrue(liste.erTom());
		assertEquals(settinnelement2.getNavn(),taUtElement2.getNavn());
		}

	@Test
	public void testStorelse() {
		
		Element settinnelement1 = new Element("A");
		liste.settInn(settinnelement1);
		Element settinnelement2 = new Element("B");
		liste.settInn(settinnelement2);
		assertEquals(liste.storrelse(),2);

	   }
	
	@Test
	public void testStorelseNull() {
		assertEquals(liste.storrelse(),0);

	   }
	}

