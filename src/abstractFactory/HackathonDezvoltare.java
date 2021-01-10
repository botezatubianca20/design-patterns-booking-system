package abstractFactory;

public class HackathonDezvoltare extends Hackathon{
	
	public HackathonDezvoltare() {
		super();
	}
	
	public HackathonDezvoltare(String denumire, float pret, String locatie, String data, int durata, String domeniu) {
		super(denumire, pret, locatie, data, durata, domeniu);
	}
	
	@Override
	public void createEvenimentHackathon(Object o) {
		System.out.println("DETALII HACKATHON DEZVOLTARE: \n" + o.toString());
	}

	@Override
	public String toString() {
		return "HackathonDezvoltare [domeniu=" + getDomeniu() + ", denumire=" + getDenumire() + ", pretTichet="
				+ getPretTichet() + ", locatie=" + getLocatie() + ", data=" + getData() + ", durata=" + getDurata() + "]";
	}

	
}
