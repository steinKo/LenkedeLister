package test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

import main.StatiskTabell;
import main.Tabell;



public class StatiskTabelIteratorTest {

	Tabell<String>  tabell;
	Iterator<String> iterator;
	@Before
	public void setUp()
	{
		tabell = new StatiskTabell<String>(2);
		iterator =tabell.iterator();
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
		tabell.settInn(settinnelement1);
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
	tabell.settInn(settinnelement1);
	String nextelement1 = iterator.next();
	assertEquals(settinnelement1, nextelement1);


		}
	@Test 
	public void testtwoNextNodes()
		{
	String settinnelement1 = new String("A");
	tabell.settInn(settinnelement1);
	String settinnelement2 = new String("B");
	tabell.settInn(settinnelement2);
	String nextelement1 = iterator.next();
	assertEquals(settinnelement1, nextelement1);
	String nextelement2 = iterator.next();
	assertEquals(settinnelement2, nextelement2);

		}
	
	@Test(expected = UnsupportedOperationException.class) 
	public void testRemoveNoNodes()
		{
	       iterator.remove();

		}

}
