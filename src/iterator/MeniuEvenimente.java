package iterator;

import abstractFactory.Eveniment;

public class MeniuEvenimente {
	ListaEvenimente listaEvenimente; 
	  
    public MeniuEvenimente(ListaEvenimente listaEvenimente) 
    { 
        this.listaEvenimente = listaEvenimente; 
    } 
  
    public void afisareEvenimente() 
    { 
        Iterator iterator = listaEvenimente.createIterator(); 
        System.out.println("-------LISTA EVENIMENTE------------"); 
        while (iterator.hasNext()) 
        { 
            Eveniment e = (Eveniment)iterator.next(); 
            System.out.println(e.toString()); 
        } 
    } 
}
