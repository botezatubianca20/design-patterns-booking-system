package main;

import builder.Utilizator;
import singleton.DatabaseConnection;

public class main {

	public static void main(String[] args) {
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
		
		
		 Utilizator user1 = new Utilizator.BuilderUtilizator("Anca", "Luca", "ancaluca@gmail.com", "1234")
                 .build();

		 Utilizator user2 = new Utilizator.BuilderUtilizator("Lavinia", "Toma", "lavinia.toma@gmail.com", "zaq12wsx")
                 .setCountry("Romania")
                 .build();
		 
		 Utilizator user3 = new Utilizator.BuilderUtilizator("Andrei", "Bostan", "bostan.andrei12@gmail.com", "mnbvcxz")
                 .setCountry("Romania").setAge(24).setGender("male")
                 .build();

		 System.out.println(user1.toString() + "\n" + user2.toString() + "\n" + user3.toString());

	}

}
