package iterator;

import abstractFactory.Eveniment;

public class EvenimentIterator implements Iterator{
	
	Eveniment[] listaEvenimente; 
    int pozitie = 0; 

	public EvenimentIterator(Eveniment[] listaEvenimente) {
		super();
		this.listaEvenimente = listaEvenimente;
	}

	@Override
	public boolean hasNext() {
		if (pozitie >= listaEvenimente.length || listaEvenimente[pozitie] == null) 
	            return false; 
	        else
	            return true;
	}

	@Override
	public Object next() {
		Eveniment notification =  listaEvenimente[pozitie]; 
		pozitie += 1; 
        return notification;
	}
}
