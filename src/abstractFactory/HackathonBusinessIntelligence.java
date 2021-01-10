package abstractFactory;

public class HackathonBusinessIntelligence extends Hackathon {

    public HackathonBusinessIntelligence() {
        super();
    }

    public HackathonBusinessIntelligence(Long id, String denumire, float pret, String locatie, String data, int durata, String domeniu) {
        super(id, denumire, pret, locatie, data, durata, domeniu);
    }

    @Override
    public void createEvenimentHackathon(Object o) {
        System.out.println("DETALII HACKATHON BUSINESS INTELLIGENCE: \n" + o.toString());
    }

    @Override
    public String toString() {
        return "HackathonBusinessIntelligence [numarEveniment=" + id + ", domeniu=" + getDomeniu() + ", denumire=" + getDenumire() + ", pretTichet="
                + getPretTichet() + ", locatie=" + getLocatie() + ", data=" + getData() + ", durata=" + getDurata() + "]";
    }


}
