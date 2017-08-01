package main.java;

import java.util.Iterator;
import java.util.NoSuchElementException;



public  class LenketListe<T> {
	
	    private class Node <E>
	    {
		   private E element;
		   private Node<E> neste;
		   private Node<E> forrige;
		 
		   public Node (E aElement)
		   {
			  this.element = aElement;
			  neste= null;
		    }
		
		
		   public E hentElement()
		   {
			return element;
		   }
		   
		   @Override
		   public String toString()
		   {
			   return element.toString();
		   }
	   
	     }
	
	   private class LenkedListeIterator<L> implements ListeIterator<L>
	    {

		   private Node<L> posisjon;
		   private Node<L> forrige;
		boolean oKRemove;
		
		
		
		public LenkedListeIterator()
		{
			posisjon= null;
			forrige = null;
			oKRemove = false;
		}
		

		
		
		
		@Override
		public boolean hasNext() 
		{
			if (posisjon ==null)
				return !erTom();
			else
			{
			  if (posisjon.neste == null)
			     return false;
			  else
			     return true;
			}  
		}

		@Override
		public L next() {
			if (!hasNext())
				throw(new NoSuchElementException() );
			forrige = posisjon;
			oKRemove= true;
			if (posisjon==null)
			    posisjon = (LenketListe<T>.Node<L>) forste;
			else
				posisjon = posisjon.neste;
			return posisjon.hentElement();
			
			
		}
		
		@Override
		public void remove()
		{
			if (!oKRemove)
				throw new IllegalStateException();
			else  if (forste.neste == null && posisjon.neste == null)
			{
				settForste ( null);
				posisjon = null;
				
			}
			else if (forrige == null)
			{
				
				posisjon = posisjon.neste;
				settForste(forste.neste);
			}
			else
			{
				forrige.neste = posisjon.neste;
				posisjon = posisjon.neste;
			}
			oKRemove = false;
			
			
				
			
		}

		@Override
		public void settInn(L element) 
		{
		   if (posisjon == null && forrige == null)
		   {	
			   setinnForan( (T) element);
		   }
		   else
		   if (posisjon == null && forrige != null)
		   {	
			   setInnBak( (T) element);
		   }
		  else
		   {
				Node<L> node =  new Node<>(element);
	
			    if(forrige == null)
			    {	
			    	setinnForan( (T) element);
			    }
			    
			    else
			    {	
			    	
		           node.neste =  posisjon;
		            node.forrige = forrige;
		            forrige.neste = node;
		            storellse ++;
			    }
		        
			}
		   
		}
		
		
		
	}
	
	
    private Node<T> forste;
    private Node<T> siste;
    private int storellse;

    private void settForste(Node<T> forste) 
    {
	     this.forste = forste;
     }

     public Iterator<T> iterator()
{
	return new LenkedListeIterator<>();
}

public ListeIterator<T> listeIterator()
{
	return new LenkedListeIterator<>();
}

	
  public boolean erTom() 
 {
		if (forste == null)
		return true;
		else
		return false;
		

			
	}
	
	public int storrelse()
	{
		return storellse;
	}
	protected void setInnBak(T element)
	{

		Node<T> node = new Node<>(element);
		if  (erTom())
		{
			forste = node;
			siste = node;
			
		} 
		else
		{
			node.forrige =siste;
			siste.neste = node;
			siste= node;
		}
		storellse++;
		
	}
	protected void setinnForan(T element)
	{
		Node<T> node = new Node<>(element);
		if  (erTom())
		{
			forste = node;
			siste = node;
		} 
		else
		{
			node.neste =forste;
			forste.forrige = node;
			forste= node;
		}
		storellse++;
	}
	
	protected T taUtForan()
	{	T element=null;
		if (!erTom()) 
		{
			if (forste.neste== null)
			{
				element=forste.hentElement();
				forste= null;
				siste = null;
			}
			else
			{
				element=forste.hentElement();
				Node<T> neste = forste.neste;
				neste.forrige = null;
				forste = neste;
			}
			storellse--;
			return element;
			
		}
		else
			return null;				
				
	}
	
	protected T taUtBak()
	{	T element =siste.hentElement();
	   if (!erTom()) 
	   {
		   if (forste==siste)
			{
				forste= null;
				siste = null;
			}
		   else
			{
			
				Node<T> forrige = siste.forrige;
				forrige.neste = null;
				siste = forrige;
			}
		   storellse--;
		   return element;
	   }
	     else
		return null;	
	 }
	
	protected T seForan()
	{
		return forste.hentElement();
	}	
	
	

}
