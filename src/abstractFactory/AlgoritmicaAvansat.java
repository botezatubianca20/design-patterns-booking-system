package abstractFactory;

public class AlgoritmicaAvansat extends Algoritmica{
	public AlgoritmicaAvansat() {
		super();
	}

	public AlgoritmicaAvansat(String denumire, float pret, String locatie, String data, int durata, String limbajProgramare) {
		super(denumire, pret, locatie, data, durata, limbajProgramare);
	}

	
	@Override
	public void createEvenimentAlgoritmica(Object o) {
		System.out.println("DETALII ALGORITMICA AVANSAT: \n" + o.toString());
	}

	@Override
	public String toString() {
		return "AlgoritmicaAvansat [limbajProgramare=" + getLimbajProgramare() + ", denumire=" + getDenumire() + ", pretTichet="
				+ getPretTichet() + ", locatie=" + getLocatie() + ", data=" + getData() + ", durata=" + getDurata() + "]";
	}
	
	

}
