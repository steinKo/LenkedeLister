package main;

import java.util.Iterator;

public class Koe<T> implements Liste<T> {
     private LenketListe<T> lenketliste;
	public Koe()
	{
		lenketliste = new LenketListe<>();
		
	}
     
	
	private void setInnBak(T element)
	{
		lenketliste.setInnBak(element);
	}
	
	
	
	private T taUtForan()
	{
		return lenketliste.taUtForan();
	}
	
@Override
	public void settInn(T element) {
		setInnBak(element);
	}

@Override
	public T fjern() {
		return (T) taUtForan();
	}


	@Override
	public Iterator<T> iterator() {
		
		return lenketliste.iterator();
	}


	@Override
	public int storrelse() {
		
		return lenketliste.storrelse();
	}


	@Override
	public boolean erTom() {
		
		return lenketliste.erTom();
	}

}
