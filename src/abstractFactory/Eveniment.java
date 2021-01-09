package abstractFactory;

public abstract class Eveniment {
	String denumire;
	float pretTichet;
	String locatie;
	String data;
	float durata;
	
	public Eveniment() {
		super();
	}
	
	public Eveniment(String denumire, float pretTichet, String locatie, String data, float durata) {
		super();
		this.denumire = denumire;
		this.pretTichet = pretTichet;
		this.locatie = locatie;
		this.data = data;
		this.durata = durata;
	}
	
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public float getPretTichet() {
		return pretTichet;
	}
	public void setPretTichet(float pretTichet) {
		this.pretTichet = pretTichet;
	}
	public String getLocatie() {
		return locatie;
	}
	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public float getDurata() {
		return durata;
	}
	public void setDurata(float durata) {
		this.durata = durata;
	}
	
	@Override
	public String toString() {
		return "Eveniment [denumire=" + denumire + ", pretTichet=" + pretTichet + ", locatie=" + locatie + ", data="
				+ data + ", durata=" + durata + "]";
	}
	
	
	

}
