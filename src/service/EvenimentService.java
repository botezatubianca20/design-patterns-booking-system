package service;

import abstractFactory.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EvenimentService {

    private String GET_WORKSHOP_EVENTS = "SELECT se.denumire as specific, e.* FROM EVENIMENT e, tip_eveniment te, specific_eveniment se " +
            "WHERE e.id_tip_eveniment = te.id AND e.id_specific_eveniment = se.id AND te.tip = 'WORKSHOP'";
    private String GET_HACKATHON_EVENTS = "SELECT se.denumire as specific, e.* FROM EVENIMENT e, tip_eveniment te, specific_eveniment se " +
            "WHERE e.id_tip_eveniment = te.id AND e.id_specific_eveniment = se.id AND te.tip = 'HACKATHON'";
    private String GET_ALGORITMICA_EVENTS = "SELECT se.denumire as specific, e.* FROM EVENIMENT e, tip_eveniment te, specific_eveniment se " +
            "WHERE e.id_tip_eveniment = te.id AND e.id_specific_eveniment = se.id AND te.tip = 'ALGORITMICA'";

    public List<Eveniment> getListOfWorkshops(Connection connection) {
        Statement stmt;
        List<Eveniment> listaEvenimente = new ArrayList<>();
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(GET_WORKSHOP_EVENTS);
            while (rs.next()) {
                Eveniment eveniment = mapRowsToWorkshopObject(rs);
                if (null != eveniment)
                    listaEvenimente.add(eveniment);
            }
            return listaEvenimente;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    public List<Eveniment> getListOfHackathons(Connection connection) {
        Statement stmt;
        List<Eveniment> listaEvenimente = new ArrayList<>();
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(GET_HACKATHON_EVENTS);
            while (rs.next()) {
                Eveniment eveniment = mapRowsToHackathonObject(rs);
                if (null != eveniment)
                    listaEvenimente.add(eveniment);
            }
            return listaEvenimente;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    public List<Eveniment> getListOfAlgoritmica(Connection connection) {
        Statement stmt;
        List<Eveniment> listaEvenimente = new ArrayList<>();
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(GET_ALGORITMICA_EVENTS);
            while (rs.next()) {
                Eveniment eveniment = mapRowsToAlgoritmicaObject(rs);
                if (null != eveniment)
                    listaEvenimente.add(eveniment);
            }
            return listaEvenimente;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    private Workshop mapRowsToWorkshopObject(ResultSet rs) {

        try {
            Long id = rs.getLong("id");
            String specific = rs.getString("specific");
            String denumire = rs.getString("denumire");
            Float pretTichet = rs.getFloat("pret_tichet");
            String locatie = rs.getString("locatie");
            String data = rs.getString("data");
            Integer durata = rs.getInt("durata");
            String publicTinta = rs.getString("public_tinta");

            switch (specific) {
                case "WORKSHOP_MEDIU":
                    return new WorkshopMediu(id, denumire, pretTichet, locatie, data, durata, publicTinta);
                case "WORKSHOP_SANATATE":
                    return new WorkshopSanatate(id, denumire, pretTichet, locatie, data, durata, publicTinta);
                case "WORKSHOP_TEHNOLOGIE":
                    return new WorkshopTehnologie(id, denumire, pretTichet, locatie, data, durata, publicTinta);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    private Hackathon mapRowsToHackathonObject(ResultSet rs) {

        try {
            Long id = rs.getLong("id");
            String specific = rs.getString("specific");
            String denumire = rs.getString("denumire");
            Float pretTichet = rs.getFloat("pret_tichet");
            String locatie = rs.getString("locatie");
            String data = rs.getString("data");
            Integer durata = rs.getInt("durata");
            String domeniu = rs.getString("domeniu");

            switch (specific) {
                case "HACKATHON_BUSINESS_INTELLIGENCE":
                    return new HackathonBusinessIntelligence(id, denumire, pretTichet, locatie, data, durata, domeniu);
                case "HACKATHON_DEZVOLTARE":
                    return new HackathonDezvoltare(id, denumire, pretTichet, locatie, data, durata, domeniu);
                case "HACKATHON_ANALIZA_DATE":
                    return new HackathonAnalizaDeDate(id, denumire, pretTichet, locatie, data, durata, domeniu);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    private Algoritmica mapRowsToAlgoritmicaObject(ResultSet rs) {

        try {
            Long id = rs.getLong("id");
            String specific = rs.getString("specific");
            String denumire = rs.getString("denumire");
            Float pretTichet = rs.getFloat("pret_tichet");
            String locatie = rs.getString("locatie");
            String data = rs.getString("data");
            Integer durata = rs.getInt("durata");
            String limbajProgramare = rs.getString("limbaj_programare");

            switch (specific) {
                case "ALGORITMICA_AVANSAT":
                    return new AlgoritmicaAvansat(id, denumire, pretTichet, locatie, data, durata, limbajProgramare);
                case "ALGORITMICA_MEDIU":
                    return new AlgoritmicaMediu(id, denumire, pretTichet, locatie, data, durata, limbajProgramare);
                case "ALGORITMICA_INCEPATOR":
                    return new AlgoritmicaIncepator(id, denumire, pretTichet, locatie, data, durata, limbajProgramare);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }
}
