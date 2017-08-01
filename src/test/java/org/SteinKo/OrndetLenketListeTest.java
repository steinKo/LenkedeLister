package test.java.org.SteinKo;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import main.java.OrdnetLenkeliste;



public class OrndetLenketListeTest {
	private main.java.Liste<String>  liste;
	@Before
	public void setUp()
	{
		 liste = new OrdnetLenkeliste<String>();
	}

		@Test
		public void testerTom() {

			
			assertTrue(liste.erTom());	
		}

	@Test
		
		public void testerTaUTTom() {
			String element = liste.fjern();
			assertNull(element);
		}
	@Test
	public void testSetinnettElelemt() {
	
	    String settinnelement = new String("A");
	    liste.settInn(settinnelement);
	    assertFalse(liste.erTom());
	    String taUtElement = liste.fjern();
	   assertEquals(settinnelement,taUtElement);
		
		
	}

	@Test
	public void testSetinn3elementer() {

	String settinnelement1 = new String("C");
	liste.settInn(settinnelement1);
	String settinnelement2 = new String("A");
	liste.settInn(settinnelement2);
	String settinnelement3 = new String("B");
	liste.settInn(settinnelement3);
	String taUtElement1 = liste.fjern();
	assertFalse(liste.erTom());
	assertEquals("A",taUtElement1);
	String taUtElement2 = liste.fjern();
	assertFalse(liste.erTom());
	assertEquals("B",taUtElement2);
	String taUtElement3 = liste.fjern();
	assertTrue(liste.erTom());
	assertEquals("C",taUtElement3);
	}
	
	@Test
	public void testSetinn5elementer() {

	String settinnelement1 = new String("C");
	liste.settInn(settinnelement1);
	String settinnelement2 = new String("A");
	liste.settInn(settinnelement2);
	String settinnelement3 = new String("B");
	liste.settInn(settinnelement3);
	String settinnelement4 = new String("C");
	liste.settInn(settinnelement4);
	String settinnelement5 = new String("A");
	liste.settInn(settinnelement5);
	String taUtElement1 = liste.fjern();
	assertFalse(liste.erTom());
	assertEquals("A",taUtElement1);
	String taUtElement2 = liste.fjern();
	assertFalse(liste.erTom());
	assertEquals("A",taUtElement2);
	String taUtElement3 = liste.fjern();
	assertFalse(liste.erTom());
	assertEquals("B",taUtElement3);
	String taUtElement4 = liste.fjern();
	assertEquals("C",taUtElement4);
	String taUtElement5 = liste.fjern();
	assertTrue(liste.erTom());
	assertEquals("C",taUtElement5);
	}
	
	
	@Test
	public void testSetinn5fjern1() {

	String settinnelement1 = new String("C");
	liste.settInn(settinnelement1);
	String settinnelement2 = new String("A");
	liste.settInn(settinnelement2);
	String settinnelement3 = new String("B");
	liste.settInn(settinnelement3);
	String settinnelement4 = new String("C");
	liste.settInn(settinnelement4);
	String settinnelement5 = new String("A");
	liste.settInn(settinnelement5);
	String taUtElement1 = liste.fjern();
	 assertEquals(liste.storrelse(),4);
	}

	public void testStorelse2like() {

		String settinnelement1 = new String("C");
		liste.settInn(settinnelement1);
		String settinnelement2 = new String("A");
		liste.settInn(settinnelement2);
		String settinnelement3 = new String("B");
		liste.settInn(settinnelement3);
		String settinnelement4 = new String("C");
		liste.settInn(settinnelement2);
		String settinnelement5 = new String("A");
		 assertEquals(liste.storrelse(),5);
	 } 
	
	public void testStorelsefjern3() {

		String settinnelement1 = new String("C");
		liste.settInn(settinnelement1);
		String settinnelement2 = new String("A");
		liste.settInn(settinnelement2);
		String settinnelement3 = new String("B");
		liste.settInn(settinnelement3);
		String settinnelement4 = new String("C");
		liste.settInn(settinnelement2);
		String settinnelement5 = new String("A");
		String taUtElement1 = liste.fjern();
		 taUtElement1 = liste.fjern();
		 taUtElement1 = liste.fjern();
		
		 assertEquals(liste.storrelse(),3);
	 } 
	@Test
	public void testStorelse() {
		
	    String settinnelement1 = new String("A");
	    liste.settInn(settinnelement1);
	   String settinnelement2 = new String("B");
	   liste.settInn(settinnelement2);
	  assertEquals(liste.storrelse(),2);

	  }

@Test
public void testtwoNodes()
{
	String settinnelement1 = new String("A");
	liste.settInn(settinnelement1);
	String settinnelement2 = new String("B");
	liste.settInn(settinnelement2);
	assertEquals(liste.fjern(),settinnelement2);
	
	assertEquals(liste.fjern(),settinnelement1);

	}
}
	


