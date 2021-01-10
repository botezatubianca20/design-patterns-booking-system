package main;

import abstractFactory.Eveniment;
import abstractFactory.Hackathon;
import abstractFactory.HackathonAnalizaDeDate;
import builder.Utilizator;
import iterator.Iterator;
import iterator.ListaEvenimente;
import singleton.DatabaseConnection;

public class main {

	public static void main(String[] args) {
		//singleton
		DatabaseConnection db1 = null;
		DatabaseConnection db2 = null;
	
		try {
			db1 = DatabaseConnection.getInstance();
			db2 = DatabaseConnection.getInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		db1.creareConexiune();
		System.out.println(db1);
		System.out.println(db2);
		
		if(db1 == db1)
			System.out.println("Referinte identice");
		else
			System.out.println("Referintele nu sunt identice");
		
		//builder
		 Utilizator user1 = new Utilizator.BuilderUtilizator("Anca", "Luca", "ancaluca@gmail.com", "1234")
                 .build();

		 Utilizator user2 = new Utilizator.BuilderUtilizator("Lavinia", "Toma", "lavinia.toma@gmail.com", "zaq12wsx")
                 .setCountry("Romania")
                 .build();
		 
		 Utilizator user3 = new Utilizator.BuilderUtilizator("Andrei", "Bostan", "bostan.andrei12@gmail.com", "mnbvcxz")
                 .setCountry("Romania").setAge(24).setGender("male")
                 .build();

		 System.out.println(user1.toString() + "\n" + user2.toString() + "\n" + user3.toString());
		 
		 //iterator
		 Eveniment[] evenimente = new Eveniment[3];
		 evenimente[0] = new HackathonAnalizaDeDate("hackathon 1", 40, "Bucuresti", "20.03.2021", 24, "santate");
		 evenimente[1] = new HackathonAnalizaDeDate("hackathon 2", 70, "Bucuresti", "21.03.2021", 48, "sanatate");
		 evenimente[2] = new HackathonAnalizaDeDate("hackathon 3", 50, "Bucuresti", "26.03.2021", 24, "mediu");
		 ListaEvenimente listaEvenimente = new ListaEvenimente(evenimente);
		 
		 Iterator iterator = listaEvenimente.createIterator(); 
	        System.out.println("-------LISTA EVENIMENTE------------"); 
	        while (iterator.hasNext()) 
	        { 
	            Eveniment e = (Eveniment)iterator.next(); 
	            System.out.println(e.toString()); 
	        } 
	}

}
