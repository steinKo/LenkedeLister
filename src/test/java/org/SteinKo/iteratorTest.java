package test.java.org.SteinKo;


import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

import main.java.Koe;
import main.java.Liste;
import main.java.ListeIterator;
import main.java.OrdnetLenkeliste;








public class iteratorTest {
	Liste<String>  liste;
	Iterator<String> iterator;
	@Before
	public void setUp()
	{
		liste = new Koe<String>();
		iterator =liste.iterator();
	}
	
	
	@Test
	public void testerTom() {	
		assertTrue(liste.erTom());	
	}
	
	@Test
	public void testhasNotNextNodes()
		{
		assertFalse(iterator.hasNext());
		}
	
	@Test
	public void testhasNextNode()
		{
		String settinnelement1 = new String("A");
		liste.settInn(settinnelement1);
		assertTrue(iterator.hasNext());

		}
	@Test
	public void testhasNextNoder()
		{
		
		
		String settinnelement1 = new String("A");
		liste.settInn(settinnelement1);
	    settinnelement1 = new String("B");
		liste.settInn(settinnelement1);
		assertTrue(iterator.hasNext());


		}
	
	@Test (expected= NoSuchElementException.class )
	public void testNotNextNodes()
		{
	
		iterator.next();


		}
	@Test 
	public void testonetNextNodes()
		{
	String settinnelement1 = new String("A");
	liste.settInn(settinnelement1);
	String nextelement1 = iterator.next();
	assertEquals(settinnelement1, nextelement1);


		}
	@Test 
	public void testtwoNextNodes()
		{
	String settinnelement1 = new String("A");
	liste.settInn(settinnelement1);
	String settinnelement2 = new String("B");
	liste.settInn(settinnelement2);
	String nextelement1 = iterator.next();
	assertEquals(settinnelement1, nextelement1);
	String nextelement2 = iterator.next();
	assertEquals(settinnelement2, nextelement2);

		}
	@Test 
	public void testNewIterator()
		{
	String settinnelement1 = new String("A");
	liste.settInn(settinnelement1);
	String settinnelement2 = new String("B");
	liste.settInn(settinnelement2);
	String nextelement1 = iterator.next();;
	String nextelement2 = iterator.next();
	Iterator newIterator = liste.iterator();
	String nextelement3 = (String) newIterator.next();
	assertEquals(settinnelement1, nextelement3);
		}
	
	@Test(expected = IllegalStateException.class) 
	public void testRemoveNoNodes()
		{
	       iterator.remove();

		}
	
	@Test(expected = IllegalStateException.class) 
	public void testRemoveNotNext()
		{
		String settinnelement1 = new String("A");
		liste.settInn(settinnelement1);
	       iterator.remove();

		}
	
	@Test(expected = IllegalStateException.class) 
	public void testTwoRemove()
		{
		String settinnelement1 = new String("A");
		liste.settInn(settinnelement1);
		   iterator.next();
	       iterator.remove();
	       iterator.remove();

		}
	
	@Test
	public void testRemoveNext()
		{
		  String settinnelement1 = new String("A");
		   liste.settInn(settinnelement1);
		   iterator.next();
	       iterator.remove();
           assertTrue(liste.erTom());
		}
	
	@Test
	public void testRemoveLast()
		{
		  String settinnelement1 = new String("A");
		   liste.settInn(settinnelement1);
		   String settinnelement2 = new String("B");
		   liste.settInn(settinnelement2);
		   iterator.next();
		   iterator.next();
	       iterator.remove();
	       Iterator iterator2 = liste.iterator();
           assertEquals(settinnelement1,iterator2.next());
		}
	
	@Test
	public void testRemoveFirst()
		{
		  String settinnelement1 = new String("A");
		   liste.settInn(settinnelement1);
		   String settinnelement2 = new String("B");
		   liste.settInn(settinnelement2);
		   String settinnelement3 = new String("C");
		   liste.settInn(settinnelement3);
		   iterator.next();
	       iterator.remove();
	   
	       
		}
	@Test (expected= IllegalStateException.class)
	public void testRTWOemoveMiddel()
		{
		  String settinnelement1 = new String("A");
		   liste.settInn(settinnelement1);
		   String settinnelement2 = new String("B");
		   liste.settInn(settinnelement2);
		   String settinnelement3 = new String("C");
		   liste.settInn(settinnelement3);
		   iterator.next();
	       iterator.remove();
	       iterator.remove();
	       
		}
	
	@Test
	public void testSEttinn()
	{   OrdnetLenkeliste<String> ordnet = new OrdnetLenkeliste<String>();
		String settelement1 = new String("A");
		 ordnet.settInn(settelement1);
		ListeIterator<String> leggtilIterator = ordnet.listeIterator();
	
		assertEquals(leggtilIterator.next(),settelement1);
	}
	

}
