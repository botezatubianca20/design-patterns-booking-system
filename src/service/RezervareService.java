package service;

import model.Rezervare;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class RezervareService {

    public Long createReservation(Connection connection, Integer numberOfTickets, Long selectedEventId, Long authenticatedUserId) {

        try {
            Statement stmt = connection.createStatement();
            String INSERT_NEW_RESERVATION = "INSERT INTO Rezervare (nr_bilete, id_utilizator, id_eveniment) VALUES (" + numberOfTickets + ", " + authenticatedUserId + ", " + selectedEventId + ")";
            stmt.execute(INSERT_NEW_RESERVATION);
            return stmt.getGeneratedKeys().getLong(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return 0L;
    }
}
