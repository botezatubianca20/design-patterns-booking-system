package abstractFactory;

public class HackathonBusinessIntelligence extends Hackathon{

	public HackathonBusinessIntelligence() {
		super();
	}
	
	public HackathonBusinessIntelligence(String denumire, float pret, String locatie, String data, int durata, String domeniu) {
		super(denumire, pret, locatie, data, durata, domeniu);
	}
	
	@Override
	public void createEvenimentHackathon(Object o) {
		System.out.println("DETALII HACKATHON BUSINESS INTELLIGENCE: \n" + o.toString());
	}

	@Override
	public String toString() {
		return "HackathonBusinessIntelligence [domeniu=" + getDomeniu() + ", denumire=" + getDenumire() + ", pretTichet="
				+ getPretTichet() + ", locatie=" + getLocatie() + ", data=" + getData() + ", durata=" + getDurata() + "]";
	}

	

}
