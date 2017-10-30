package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Element;
import main.Liste;
import main.Stabel;


public class StabelTest {
	Liste<Element>  liste;
	
	
	
	@Before
	public void setUp()
	{
		liste = new Stabel<Element>();
		
	}
	@Test
	public void testerTom() {
		
		
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
	assertEquals(settinnelement2.getNavn(),taUtElement1.getNavn());
	Element taUtElement2 = liste.fjern();
	assertTrue(liste.erTom());
	assertEquals(settinnelement1.getNavn(),taUtElement2.getNavn());
	}

@Test
public void testStorelse() {
	
	Element settinnelement1 = new Element("A");
	liste.settInn(settinnelement1);
	Element settinnelement2 = new Element("B");
	liste.settInn(settinnelement2);
	assertEquals(liste.storrelse(),2);

   }
}