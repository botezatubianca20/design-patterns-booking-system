package abstractFactory;

public class AlgoritmicaIncepator extends Algoritmica{
	public AlgoritmicaIncepator() {
		super();
	}

	public AlgoritmicaIncepator(Long id, String denumire, float pret, String locatie, String data, int durata, String limbajProgramare) {
		super(id, denumire, pret, locatie, data, durata, limbajProgramare);
	}

	
	@Override
	public void createEvenimentAlgoritmica(Object o) {
		System.out.println("DETALII ALGORITMICA INCEPATOR: \n" + o.toString());
	}

	@Override
	public String toString() {
		return "AlgoritmicaIncepator [numarEveniment=" + id + ", limbajProgramare=" + getLimbajProgramare() + ", denumire=" + getDenumire() + ", pretTichet="
				+ getPretTichet() + ", locatie=" + getLocatie() + ", data=" + getData() + ", durata=" + getDurata() + "]";
	}
	
	

}
