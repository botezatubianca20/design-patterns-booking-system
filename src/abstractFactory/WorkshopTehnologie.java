package abstractFactory;

public class WorkshopTehnologie extends Workshop{

	public WorkshopTehnologie() {
		super();
	}

	public WorkshopTehnologie(String denumire, float pret, String locatie, String data, int durata, String publicTinta) {
		super(denumire, pret, locatie, data, durata, publicTinta);
	}
	
	@Override
	public void createEvenimentWorkshop(Object o) {
		System.out.println("DETALII WORKSHOP TEHNOLOGIE: \n" + o.toString());
	}

	@Override
	public String toString() {
		return "WorkshopTehnologie [publicTinta=" + getPublicTinta() + ", denumire=" + getDenumire() + ", pretTichet="
				+ getPretTichet() + ", locatie=" + getLocatie() + ", data=" + getData() + ", durata=" + getDurata() + "]";
	}

	
}
