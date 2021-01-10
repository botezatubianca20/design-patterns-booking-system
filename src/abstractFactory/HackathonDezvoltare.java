package abstractFactory;

public class HackathonDezvoltare extends Hackathon{
	
	public HackathonDezvoltare() {
		super();
	}
	
	public HackathonDezvoltare(Long id, String denumire, float pret, String locatie, String data, int durata, String domeniu) {
		super(id, denumire, pret, locatie, data, durata, domeniu);
	}
	
	@Override
	public void createEvenimentHackathon(Object o) {
		System.out.println("DETALII HACKATHON DEZVOLTARE: \n" + o.toString());
	}

	@Override
	public String toString() {
		return "HackathonDezvoltare [numarEveniment=" + id + ", domeniu=" + getDomeniu() + ", denumire=" + getDenumire() + ", pretTichet="
				+ getPretTichet() + ", locatie=" + getLocatie() + ", data=" + getData() + ", durata=" + getDurata() + "]";
	}

	
}
