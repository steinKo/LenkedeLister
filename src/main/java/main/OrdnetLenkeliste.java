package main;

import java.util.Iterator;

public class OrdnetLenkeliste<T extends Comparable<T>> implements Liste<T>{
	
	private LenketListe<T> lenketliste = new LenketListe<T>();

	
	public ListeIterator<T> listeIterator()
	{
		return lenketliste.listeIterator();
	}
	
	
	public boolean erTom()
	{
		return lenketliste.erTom();
	}
	
	
	private void setinnForan(T element)
	{
		lenketliste.setinnForan(element);
	}
	
	private T seForan()
	{
		return lenketliste.seForan();
	}



	




	public void settInn(T element)
	{   ListeIterator<T> iterator = listeIterator();
		if (erTom())
			setinnForan(element);
		else
		
		{ 	
				T denne;
			   denne = seForan();
			    while (element.compareTo(denne) >0 && iterator.hasNext()) 
			    {   denne =iterator.next();
			    }
		   iterator.settInn(element);
		}
		
	}




	public T fjern() {
		return lenketliste.taUtForan();
	}


	@Override
	public Iterator<T> iterator() {
		
		return lenketliste.iterator();
	}


	@Override
	public int storrelse() {
		
		return lenketliste.storrelse();
	}

}
