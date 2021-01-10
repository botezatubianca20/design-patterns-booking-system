package abstractFactory;

public class AlgoritmicaIncepator extends Algoritmica{
	public AlgoritmicaIncepator() {
		super();
	}

	public AlgoritmicaIncepator(String denumire, float pret, String locatie, String data, int durata, String limbajProgramare) {
		super(denumire, pret, locatie, data, durata, limbajProgramare);
	}

	
	@Override
	public void createEvenimentAlgoritmica(Object o) {
		System.out.println("DETALII ALGORITMICA INCEPATOR: \n" + o.toString());
	}

	@Override
	public String toString() {
		return "AlgoritmicaIncepator [limbajProgramare=" + getLimbajProgramare() + ", denumire=" + getDenumire() + ", pretTichet="
				+ getPretTichet() + ", locatie=" + getLocatie() + ", data=" + getData() + ", durata=" + getDurata() + "]";
	}
	
	

}
