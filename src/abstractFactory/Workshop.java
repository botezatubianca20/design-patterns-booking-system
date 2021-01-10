package abstractFactory;

public abstract class Workshop extends Eveniment{
	public String publicTinta;

	public Workshop() {
		super();
	}
	
	public Workshop(String denumire, float pret, String locatie, String data, int durata,String publicTinta) {
		super(denumire, pret, locatie, data, durata);
		this.publicTinta = publicTinta;
	}
	
	
	public String getPublicTinta() {
		return publicTinta;
	}

	public void setPublicTinta(String publicTinta) {
		this.publicTinta = publicTinta;
	}

	public abstract void createEvenimentWorkshop(Object o);


}
