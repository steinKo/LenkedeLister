package org.SteinKo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.Element;
import main.java.FullTabellUnntak;
import main.java.StatiskTabell;
import main.java.Tabell;
import main.java.UgyldigPlassUnntak;

public class StatiskTabellTest {
	
	private Tabell<Element>  tabell;
	@Before
	public void setUp()
	{
		tabell= new StatiskTabell<Element>(100);
	}

	@Test
	public void testTom() {
		assertTrue(tabell.erTom());

	}
	
	

	  @Test (expected=UgyldigPlassUnntak.class)
	  public void testUgyldigPlassSattInn() {
		  Element element = new Element("A");
			tabell.settInn(element);
			tabell.hentFraPlass(100);
	    
	  }
	  
	  @Test (expected=UgyldigPlassUnntak.class)
	  public void testUgyldigPlassikkeSattInn() {
			tabell.hentFraPlass(100);
	    
	  }
	
	  

	  @Test (expected=FullTabellUnntak.class)
	  public void testFullTabel() {
		  Tabell<Element> tabell1 = new StatiskTabell<Element>(1);
		  Element element = new Element("A");
			tabell1.settInn(element);
			Element element2 = new Element("B");
			tabell1.settInn(element2);
			
	    
	  }
	
	  @Test (expected=FullTabellUnntak.class)
	  public void testFullTabelNull() {
		  Tabell<Element> tabell1 = new StatiskTabell<Element>(0);
		  Element element = new Element("A");
			tabell1.settInn(element);
			Element element2 = new Element("B");
			tabell1.settInn(element2);
			
	    
	  }
	
	@Test
	public void tesSettInnt() {
		
		Element element = new Element("A");
		tabell.settInn(element);
		assertEquals(element,tabell.hentFraPlass(0));

	}
	@Test
	public void tesSettInnto() {
		Element element1 = new Element("A");
		tabell.settInn(element1);
		Element element2 = new Element("B");
		tabell.settInn(element2);
		assertEquals(element2,tabell.hentFraPlass(1));

	}
	
	@Test
	public void testTaUTNull() {
	
		assertNull(tabell.hentFraPlass(0));

	}
	
	@Test
	public void testStorelseNull() {
		assertEquals(0,tabell.storrelse());

	}
	@Test
	public void tesStorelseTo() {
		Element element1 = new Element("A");
		tabell.settInn(element1);
		Element element2 = new Element("B");
		tabell.settInn(element2);
		assertEquals(2,tabell.storrelse());

	}
	
	

}
