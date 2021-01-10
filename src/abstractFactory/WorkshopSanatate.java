package abstractFactory;

public class WorkshopSanatate extends Workshop{

	public WorkshopSanatate() {
		super();
	}

	public WorkshopSanatate(String denumire, float pret, String locatie, String data, int durata, String publicTinta) {
		super(denumire, pret, locatie, data, durata, publicTinta);
	}
	
	@Override
	public void createEvenimentWorkshop(Object o) {
		System.out.println("DETALII WORKSHOP SANATATE: \n" + o.toString());
	}

	@Override
	public String toString() {
		return "WorkshopSanatate [publicTinta=" + getPublicTinta() + ", denumire=" + getDenumire() + ", pretTichet="
				+ getPretTichet() + ", locatie=" + getLocatie() + ", data=" + getData() + ", durata=" + getDurata() + "]";
	}

	
}