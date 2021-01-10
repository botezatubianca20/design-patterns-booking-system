package service;

import builder.Utilizator;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UtilizatorService {

    public Long insertUser(Utilizator utilizator, Connection connection) {

        String INSERT_NEW_USER = "INSERT INTO Utilizator (nume, prenume, email, parola, sex, tara) values (" + utilizator.dbInsertObject() + ")";
        try {
            Statement stmt = connection.createStatement();
            stmt.execute(INSERT_NEW_USER);

            return stmt.getGeneratedKeys().getLong(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return 0L;
    }

    public Long checkLoginCredentials(String email, String parola, Connection connection) {

        String CHECK_CREDENTIALS = "SELECT id, COUNT(*) as credentials_exist FROM Utilizator WHERE email = '" + email + "' AND parola = '" + parola + "'";
        try {
            Statement stmt = connection.createStatement();
            return stmt.executeQuery(CHECK_CREDENTIALS).getLong("id");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return 0L;
    }
}
