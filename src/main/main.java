package main;

import abstractFactory.Eveniment;
import service.EvenimentService;
import builder.Utilizator;
import iterator.Iterator;
import iterator.ListaEvenimente;
import service.RezervareService;
import service.UtilizatorService;
import singleton.Database;

import java.sql.Array;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Rezultat {
    public int val;

    public Rezultat() {
    }

    public Rezultat(int val) {
        super();
        this.val = val;
    }

}

public class main {

    static Connection connection;
    static Long authenticatedUserId;

    public static Rezultat meniuAutentificare() {

        initDbConnection();

        System.out.println("-------------------------------------");
        System.out.println("AUTENTIFICARE");
        System.out.println("Alegeti una din optiunile de mai jos:");
        System.out.println("1 - Creare cont");
        System.out.println("2 - Log in");
        System.out.println("3 - Iesire");

        Scanner s = new Scanner(System.in);
        int value = s.nextInt();

        switch (value) {
            case 1: {
                System.out.println("1 - Creare cont");
                formularCreareCont();
                break;
            }
            case 2: {
                System.out.println("2 - Log in");
                formularLogIn();
                break;
            }
            case 3: {
                if (connection != null) {
                    closeConnection();
                }
                return new Rezultat(2);
            }
            default: {
                System.out.println("Alegeti o valoare intre 1 - 3\n");
                meniuAutentificare();
                break;
            }
        }

        return new Rezultat(2);
    }

    private static void initDbConnection() {
        try {
            if (Database.getInstance() != null) {
                connection = Database.getConnection();
                System.out.println("Connection to database established");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Rezultat formularCreareCont() {
        System.out.println("-------------------------------------");
        System.out.println("FORMULAR CREARE CONT");

        Scanner s = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Prenume: ");
        String prenume = s.next();
        System.out.println("Nume: ");
        String nume = s.next();
        System.out.println("Email: ");
        String email = s.next();
        System.out.println("Parola: ");
        String parola = s.next();
        System.out.println("Tara de provenienta (optional): ");
        String tara = s.next();
        System.out.println("Sex (optional): ");
        String sex = s.next();

        //BUILDER
        Utilizator user1 = new Utilizator.BuilderUtilizator(prenume, nume, email, parola).setTara(tara).setSex(sex).build();

        UtilizatorService service = new UtilizatorService();
        authenticatedUserId = service.insertUser(user1, connection);

        if (authenticatedUserId != 0) {
            System.out.println("ATI CREAT CU SUCCES CONTUL! UserID: " + authenticatedUserId);
            return meniuEvenimente();
        } else {
            System.out.println("INREGISTRAREA NU S-A PROCESAT CU SUCCES");
            return new Rezultat(2);
        }
    }

    public static Rezultat formularLogIn() {
        System.out.println("-------------------------------------");
        System.out.println("LOG IN");

        Scanner s = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Email: ");
        String email = s.next();
        System.out.println("Parola: ");
        String parola = s.next();

        UtilizatorService utilizatorService = new UtilizatorService();
        authenticatedUserId = utilizatorService.checkLoginCredentials(email, parola, connection);

        if (authenticatedUserId != 0) {
            System.out.println("V-ATI LOGAT CU SUCCES!");
            return meniuEvenimente();
        } else {
            System.out.println("USER-UL CU ADRESA DE EMAIL SI PAROLA INTRODUSE NU EXISTA!");
            return formularLogIn();
        }
    }

    public static Rezultat meniuEvenimente() {
        System.out.println("-------------------------------------");
        System.out.println("CATEGORII EVENIMENTE");
        System.out.println("Alegeti categoria de evenimente:");
        System.out.println("1 - HACKATHON");
        System.out.println("2 - ALGORITMICA");
        System.out.println("3 - WORKSHOP");
        System.out.println("5 - CREEAZA O REZERVARE LA UN EVENIMENT");
        System.out.println("4 - Iesire");

        EvenimentService service = new EvenimentService();

        Scanner s = new Scanner(System.in);
        int value = s.nextInt();

        switch (value) {
            case 1: {
                System.out.println("1 - LISTA EVENIMENTE HACKATHON:");
                Iterator iterator = getIterator(service.getListOfHackathons(connection));
                while (iterator.hasNext()) {
                    System.out.println(iterator.next().toString());
                }
                if (connection != null) {
                    closeConnection();
                }
                break;
            }
            case 2: {
                System.out.println("2 - LISTA EVENIMENTE ALGORITMICA:");
                Iterator iterator = getIterator(service.getListOfAlgoritmica(connection));
                while (iterator.hasNext()) {
                    System.out.println(iterator.next().toString());
                }
                if (connection != null) {
                    closeConnection();
                }
                break;
            }
            case 3: {
                System.out.println("3 - LISTA EVENIMENTE WORKSHOP:");
                Iterator iterator = getIterator(service.getListOfWorkshops(connection));
                while (iterator.hasNext()) {
                    System.out.println(iterator.next().toString());
                }
                if (connection != null) {
                    closeConnection();
                }
                break;
            }
            case 4: {
                if (connection != null) {
                    closeConnection();
                }
                return new Rezultat(2);
            }
            case 5: {
                List<Eveniment> listaEvenimente = new ArrayList<>();
                listaEvenimente.addAll(service.getListOfHackathons(connection));
                listaEvenimente.addAll(service.getListOfWorkshops(connection));
                listaEvenimente.addAll(service.getListOfAlgoritmica(connection));

                Iterator iterator = getIterator(listaEvenimente);

                while (iterator.hasNext()) {
                    System.out.println(iterator.next().toString());
                }

                System.out.println("ALEGETI NUMARUL EVENIMENTULUI LA CARE DORITI SA FACETI O REZERVARE.");
                value = s.nextInt();
                System.out.println("CATE BILETE DORITI SA ACHIZITIONATI?");
                Integer numberOfTickets = s.nextInt();

                RezervareService rezervareService = new RezervareService();

                Long reservationId = rezervareService
                        .createReservation(connection, numberOfTickets, (long) value, authenticatedUserId);
                if(reservationId != 0) {
                    System.out.println("REZERVAREA CU ID-UL " + reservationId + " A FOST INREGISTRATA CU SUCCES!");
                } else {
                    System.out.println("REZERVAREA NU A PUTUT FI INREGISTRATA!");
                }
                closeConnection();
                break;
            }
            default: {
                System.out.println("Alegeti o valoare intre 1 - 4\n");
                meniuAutentificare();
                break;
            }
        }

        return new Rezultat(2);
    }

    private static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static Iterator getIterator(List<Eveniment> listOfAlgoritmica) {
        List<Eveniment> evenimenteDb = listOfAlgoritmica;
        Eveniment[] evenimente = new Eveniment[evenimenteDb.size()];
        evenimente = evenimenteDb.toArray(evenimente);
        ListaEvenimente listaEvenimente = new ListaEvenimente(evenimente);
        return listaEvenimente.createIterator();
    }

    public static void main(String[] args) {
        //TO DO
        //pas 1: creare cont nou sau log in
        //pas 2: selectare tip eveniment (1. HACKATHON    2.ALGORITMICA     3. WORKSHOP     4. Iesire)
        //pas 3: afisare lista evenimente din categoria selectata
        //pas 4: selectare eveniment dorit
        //pas 5: realizare rezervare
        //pas 6: afisare rezervare + confirmare
        //pas 7: pas 2
        Rezultat rezultat = new Rezultat(0);

        while (rezultat.val < 1) {
            try {

                rezultat = meniuAutentificare();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //TO BE DELETED/EDITED:
//		
//		//singleton
//		DatabaseConnection db1 = null;
//		DatabaseConnection db2 = null;
//	
//		try {
//			db1 = DatabaseConnection.getInstance();
//			db2 = DatabaseConnection.getInstance();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		db1.creareConexiune();
//		System.out.println(db1);
//		System.out.println(db2);
//		
//		if(db1 == db1)
//			System.out.println("Referinte identice");
//		else
//			System.out.println("Referintele nu sunt identice");
//		
//		 
//		 //iterator
//		 Eveniment[] evenimente = new Eveniment[3];
//		 evenimente[0] = new HackathonAnalizaDeDate("hackathon 1", 40, "Bucuresti", "20.03.2021", 24, "santate");
//		 evenimente[1] = new HackathonAnalizaDeDate("hackathon 2", 70, "Bucuresti", "21.03.2021", 48, "sanatate");
//		 evenimente[2] = new HackathonAnalizaDeDate("hackathon 3", 50, "Bucuresti", "26.03.2021", 24, "mediu");
//		 ListaEvenimente listaEvenimente = new ListaEvenimente(evenimente);
//		 
//		 Iterator iterator = listaEvenimente.createIterator(); 
//	        System.out.println("-------LISTA EVENIMENTE------------"); 
//	        while (iterator.hasNext()) 
//	        { 
//	            Eveniment e = (Eveniment)iterator.next(); 
//	            System.out.println(e.toString()); 
//	        } 
//	        


    }

}
