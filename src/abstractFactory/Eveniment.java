package abstractFactory;

public abstract class Eveniment {
    Long id;
    String denumire;
    float pretTichet;
    String locatie;
    String data;
    float durata;

    public Eveniment() {
        super();
    }

    public Eveniment(Long id, String denumire, float pretTichet, String locatie, String data, float durata) {
        super();
        this.id = id;
        this.denumire = denumire;
        this.pretTichet = pretTichet;
        this.locatie = locatie;
        this.data = data;
        this.durata = durata;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "Eveniment [numărEveniment=" + id + "denumire=" + denumire + ", pretTichet=" + pretTichet + ", locatie=" + locatie + ", data="
                + data + ", durata=" + durata + "]";
    }


}
