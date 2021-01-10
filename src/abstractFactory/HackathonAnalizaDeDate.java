package abstractFactory;

public class HackathonAnalizaDeDate extends Hackathon {

    public HackathonAnalizaDeDate() {
        super();
    }

    public HackathonAnalizaDeDate(Long id, String denumire, float pret, String locatie, String data, int durata, String domeniu) {
        super(id, denumire, pret, locatie, data, durata, domeniu);
    }

    @Override
    public void createEvenimentHackathon(Object o) {
        System.out.println("DETALII HACKATHON ANALIZA DE DATE: \n" + o.toString());
    }

    @Override
    public String toString() {
        return "public class HackathonAnalizaDeDate extends Hackathon{\r\n" +
                " [numarEveniment= " + id + ", domeniu=" + getDomeniu() + ", denumire=" + getDenumire() + ", pretTichet="
                + getPretTichet() + ", locatie=" + getLocatie() + ", data=" + getData() + ", durata=" + getDurata() + "]";
    }


}
