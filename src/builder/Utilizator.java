package builder;

public class Utilizator {
	//campuri obligatorii de completat la autentificare
	private String prenume;
	private String nume;
	private String email;
	private String parola;

	//campuri optionale de completat la autentificare
	private int varsta;
	private String tara;
	private String sex;
	
	private Utilizator(BuilderUtilizator builder) {
		this.prenume = builder.prenume;
		this.nume = builder.nume;
		this.email = builder.email;
		this.parola = builder.parola;
		this.varsta = builder.varsta;
		this.tara = builder.tara;
		this.sex = builder.sex;
	}
	

	@Override
	public String toString() {
		return "Utilizator [prenume=" + prenume + ", nume=" + nume + ", email=" + email + ", parola=" + parola
				+ ", varsta=" + varsta + ", tara=" + tara + ", sex=" + sex + "]";
	}


	public static class BuilderUtilizator {
		private String prenume;
		private String nume;
		private String email;
		private String parola;
		
		private int varsta;
		private String tara;
		private String sex;
		
		
		public BuilderUtilizator(String prenume, String nume, String email, String parola) {
			super();
			this.prenume = prenume;
			this.nume = nume;
			this.email = email;
			this.parola = parola;
		}
		
		public BuilderUtilizator setAge(int varsta) {
			this.varsta = varsta;
			return this;
		}
		public BuilderUtilizator setCountry(String tara) {
			this.tara = tara;
			return this;
		}
		public BuilderUtilizator setGender(String sex) {
			this.sex = sex;
			return this;
		}
		
		public Utilizator build() {
			return new Utilizator(this);
		}
		
		

	}
}
