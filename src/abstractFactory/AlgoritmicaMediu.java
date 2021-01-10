package abstractFactory;

public class AlgoritmicaMediu extends Algoritmica{
	public AlgoritmicaMediu() {
		super();
	}

	public AlgoritmicaMediu(String denumire, float pret, String locatie, String data, int durata, String limbajProgramare) {
		super(denumire, pret, locatie, data, durata, limbajProgramare);
	}

	
	@Override
	public void createEvenimentAlgoritmica(Object o) {
		System.out.println("DETALII ALGORITMICA MEDIU: \n" + o.toString());
	}

	@Override
	public String toString() {
		return "AlgoritmicaMediu [limbajProgramare=" + getLimbajProgramare() + ", denumire=" + getDenumire() + ", pretTichet="
				+ getPretTichet() + ", locatie=" + getLocatie() + ", data=" + getData() + ", durata=" + getDurata() + "]";
	}
	
	

}
