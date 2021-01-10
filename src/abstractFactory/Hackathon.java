package abstractFactory;

public abstract class Hackathon extends Eveniment{
	public String domeniu;

	public Hackathon() {
		super();
	}

	public Hackathon(Long id, String denumire, float pret, String locatie, String data, int durata, String domeniu) {
		super(id, denumire, pret, locatie, data, durata);
		this.domeniu = domeniu;
	}

	public String getDomeniu() {
		return domeniu;
	}

	public void setDomeniu(String domeniu) {
		this.domeniu = domeniu;
	}

	public abstract void createEvenimentHackathon(Object o);
}
