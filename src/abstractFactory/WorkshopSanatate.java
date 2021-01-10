package abstractFactory;

public class WorkshopSanatate extends Workshop{

	public WorkshopSanatate() {
		super();
	}

	public WorkshopSanatate(Long id, String denumire, float pret, String locatie, String data, int durata, String publicTinta) {
		super(id, denumire, pret, locatie, data, durata, publicTinta);
	}
	
	@Override
	public void createEvenimentWorkshop(Object o) {
		System.out.println("DETALII WORKSHOP SANATATE: \n" + o.toString());
	}

	@Override
	public String toString() {
		return "WorkshopSanatate [numarEveniment=" + id + ", publicTinta=" + getPublicTinta() + ", denumire=" + getDenumire() + ", pretTichet="
				+ getPretTichet() + ", locatie=" + getLocatie() + ", data=" + getData() + ", durata=" + getDurata() + "]";
	}

	
}