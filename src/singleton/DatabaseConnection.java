package singleton;

public class DatabaseConnection {

	private static DatabaseConnection instance = null;
	private boolean conexiuneCreata;
	
	public DatabaseConnection() throws Exception {
		if(instance != null)
			throw new Exception("Conexiune deja creata");
	    System.out.println("S-a realizat conexiunea la baza de date.");
	}
	
	public static DatabaseConnection getInstance() throws Exception {
		if(instance == null)
			instance = new DatabaseConnection();
		return instance;
	}
	
	public void creareConexiune() {
		conexiuneCreata = true;
	}

	@Override
	public String toString() {
		return "DatabaseConnection [conexiuneCreata=" + conexiuneCreata + "]";
	}
}
