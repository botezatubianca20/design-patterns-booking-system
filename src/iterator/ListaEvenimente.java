package iterator;
import abstractFactory.Eveniment;

public class ListaEvenimente implements Lista{
	private Eveniment[] evenimente;
	
	

	public ListaEvenimente(Eveniment[] evenimente) {
		super();
		this.evenimente = evenimente;
	}



	@Override
	public Iterator createIterator() {
		 return new EvenimentIterator(evenimente); 
	}

}
