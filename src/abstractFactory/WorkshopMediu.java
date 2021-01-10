package abstractFactory;

public class WorkshopMediu extends Workshop{

	public WorkshopMediu() {
		super();
	}

	public WorkshopMediu(Long id, String denumire, float pret, String locatie, String data, int durata, String publicTinta) {
		super(id, denumire, pret, locatie, data, durata, publicTinta);
	}
	
	@Override
	public void createEvenimentWorkshop(Object o) {
		System.out.println("DETALII WORKSHOP MEDIU: \n" + o.toString());
	}

	@Override
	public String toString() {
		return "WorkshopMediu [numarEveniment=" + id + ", publicTinta=" + getPublicTinta() + ", denumire=" + getDenumire() + ", pretTichet="
				+ getPretTichet() + ", locatie=" + getLocatie() + ", data=" + getData() + ", durata=" + getDurata() + "]";
	}

	
}