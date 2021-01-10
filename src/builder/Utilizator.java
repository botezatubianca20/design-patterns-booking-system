package builder;

public class Utilizator {
    //campuri obligatorii de completat la autentificare
    private String id;
    private String prenume;
    private String nume;
    private String email;
    private String parola;

    //campuri optionale de completat la autentificare
    private String tara;
    private String sex;

    private Utilizator(BuilderUtilizator builder) {
        this.prenume = builder.prenume;
        this.nume = builder.nume;
        this.email = builder.email;
        this.parola = builder.parola;
        this.tara = builder.tara;
        this.sex = builder.sex;
    }


    public String dbInsertObject() {
        return "'" + nume + "', '" + prenume + "', '" + email + "', '" + parola + "', '" + sex + "', '" + tara + "'";
    }

    @Override
    public String toString() {
        return "Utilizator [prenume=" + prenume + ", nume=" + nume + ", email=" + email + ", parola=" + parola
                + ", tara=" + tara + ", sex=" + sex + "]";
    }


    public static class BuilderUtilizator {
        private String id;
        private String prenume;
        private String nume;
        private String email;
        private String parola;

        private String tara;
        private String sex;


        public BuilderUtilizator(String prenume, String nume, String email, String parola) {
            super();
            this.prenume = prenume;
            this.nume = nume;
            this.email = email;
            this.parola = parola;
        }

        public BuilderUtilizator setTara(String tara) {
            this.tara = tara;
            return this;
        }

        public BuilderUtilizator setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Utilizator build() {
            return new Utilizator(this);
        }


    }
}
