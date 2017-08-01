package main.java;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StatiskTabell<T> implements Tabell<T> {

	private T[] tabell;
	int antall;
	int avsatt;
	
	
	public StatiskTabell(int i) {
		avsatt = i;
		this.tabell = (T[]) new Object[i];
		antall = 0;
	}
private class StatiskTabellIterator<T> implements Iterator<T>
{
	int neste;
	boolean OKToRemove;
	
	public StatiskTabellIterator()
	{
		neste = 0;
		OKToRemove = false;
	}
	
	

	@Override
	public boolean hasNext() {
		if(neste<antall) return true;
		else return false;
	}

	@Override
	public T next() {
		if (!hasNext())
			throw(new NoSuchElementException() );
		T element = (T) tabell[neste];
		neste =neste +1;
		return element;
	}
	
}

	public Iterator<T> iterator() {
		
		return new StatiskTabellIterator<T>();
	}


	public int storrelse() {
		return antall;
	}

	public boolean erTom() {
		if (antall == 0)
			return true;
		else
		
		return false;
	}


	public void settInn(T element) {
		try
		
		{
			
		  tabell[antall] = element;
		  antall++;	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			throw new FullTabellUnntak(antall);
		}
	

	}

	
	public T hentFraPlass(int plass) {
		try
		{
		
		return tabell[plass];
		}
		catch(ArrayIndexOutOfBoundsException up)
		{
			throw new UgyldigPlassUnntak(plass,avsatt);
		}
	}

}
