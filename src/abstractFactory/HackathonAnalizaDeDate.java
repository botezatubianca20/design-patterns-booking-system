package abstractFactory;

public class HackathonAnalizaDeDate extends Hackathon{
	
	public HackathonAnalizaDeDate() {
		super();
	}
	
	public HackathonAnalizaDeDate(String denumire, float pret, String locatie, String data, int durata, String domeniu) {
		super(denumire, pret, locatie, data, durata, domeniu);
	}
	
	@Override
	public void createEvenimentHackathon(Object o) {
		System.out.println("DETALII HACKATHON ANALIZA DE DATE: \n" + o.toString());
	}

	@Override
	public String toString() {
		return "public class HackathonAnalizaDeDate extends Hackathon{\r\n" + 
				" [domeniu=" + getDomeniu() + ", denumire=" + getDenumire() + ", pretTichet="
				+ getPretTichet() + ", locatie=" + getLocatie() + ", data=" + getData() + ", durata=" + getDurata() + "]";
	}

	
}
