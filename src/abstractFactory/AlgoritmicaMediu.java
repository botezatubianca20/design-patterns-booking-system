package abstractFactory;

public class AlgoritmicaMediu extends Algoritmica{
	public AlgoritmicaMediu() {
		super();
	}

	public AlgoritmicaMediu(Long id, String denumire, float pret, String locatie, String data, int durata, String limbajProgramare) {
		super(id, denumire, pret, locatie, data, durata, limbajProgramare);
	}

	
	@Override
	public void createEvenimentAlgoritmica(Object o) {
		System.out.println("DETALII ALGORITMICA MEDIU: \n" + o.toString());
	}

	@Override
	public String toString() {
		return "AlgoritmicaMediu [numarEveniment=" + id + ", limbajProgramare=" + getLimbajProgramare() + ", denumire=" + getDenumire() + ", pretTichet="
				+ getPretTichet() + ", locatie=" + getLocatie() + ", data=" + getData() + ", durata=" + getDurata() + "]";
	}
	
	

}
