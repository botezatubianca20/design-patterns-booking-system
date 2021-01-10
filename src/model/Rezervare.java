package model;

public class Rezervare {

    private Long id;
    private Integer numarBilete;
    private Long id_utilizator;
    private Long id_eveniment;

    public Rezervare(Long id, Integer numarBilete, Long id_utilizator, Long id_eveniment) {
        this.id = id;
        this.numarBilete = numarBilete;
        this.id_utilizator = id_utilizator;
        this.id_eveniment = id_eveniment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumarBilete() {
        return numarBilete;
    }

    public void setNumarBilete(Integer numarBilete) {
        this.numarBilete = numarBilete;
    }

    public Long getId_utilizator() {
        return id_utilizator;
    }

    public void setId_utilizator(Long id_utilizator) {
        this.id_utilizator = id_utilizator;
    }

    public Long getId_eveniment() {
        return id_eveniment;
    }

    public void setId_eveniment(Long id_eveniment) {
        this.id_eveniment = id_eveniment;
    }

    public String dbInsert() {

        return numarBilete + ", " + id_eveniment + ", " + id_utilizator;
    }
}
