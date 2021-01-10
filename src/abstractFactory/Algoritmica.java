package abstractFactory;

public abstract class Algoritmica extends Eveniment{
	public String limbajProgramare;

	public Algoritmica() {
		super();
	}

	public Algoritmica(String denumire, float pret, String locatie, String data, int durata, String limbajProgramare) {
		super(denumire, pret, locatie, data, durata);
		this.limbajProgramare = limbajProgramare;
	}

	public String getLimbajProgramare() {
		return limbajProgramare;
	}

	public void setLimbajProgramare(String limbajProgramare) {
		this.limbajProgramare = limbajProgramare;
	}
	
	public abstract void createEvenimentAlgoritmica(Object o);
	
	
}
