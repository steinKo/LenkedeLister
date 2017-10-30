package main;

import java.util.Iterator;

public class Stabel<T>  implements Liste<T> {

	LenketListe<T> lenketlist;
	
	public Stabel ()
	{
		lenketlist = new LenketListe<T>();
	}
	
	private void setinnForan( T element)
	{
		lenketlist.setinnForan(element);
	}
	
	private T taUtForan()
	{
		return lenketlist.taUtForan();
	}
	
	
	 public void settInn(T element) {
		setinnForan( element);
		
	}

	
	public T fjern() {
		return (T) taUtForan();
	}

	@Override
	public Iterator<T> iterator() {
		
		return lenketlist.iterator() ;
	}

	@Override
	public int storrelse() {
		
		return lenketlist.storrelse();
	}

	@Override
	public boolean erTom() {
		
		return lenketlist.erTom();
	}

}
