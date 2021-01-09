package main;

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

	}

}
