package singleton;

import java.sql.*;

public class Database {

    private static Database instance = null;
    private static Connection connection;
    private static final String FILE_NAME = "database.db";
    private static final String URL = "jdbc:sqlite:";

    private Database() throws Exception {
        if (instance != null)
            throw new Exception("Conexiune deja creata");
        setConnection();
    }

    public static Database getInstance() throws Exception {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public static void setConnection() {

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(URL + FILE_NAME);
            connection.setAutoCommit(false);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

        System.out.println("Opened database successfully");
    }

    public static Connection getConnection() {
        return connection;
    }

    @Override
    public String toString() {
        return "DatabaseConnection [conexiuneCreata=" + connection + "]";
    }
}

