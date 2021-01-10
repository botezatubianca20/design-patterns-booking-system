package main;
import abstractFactory.Eveniment;
import abstractFactory.Hackathon;
import abstractFactory.HackathonAnalizaDeDate;
import builder.Utilizator;
import iterator.Iterator;
import iterator.ListaEvenimente;
import singleton.DatabaseConnection;
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
	
	public static Rezultat meniuAutentificare() {
		System.out.println("-------------------------------------");
		System.out.println("AUTENTIFICARE");
		System.out.println("Alegeti una din optiunile de mai jos:");
		System.out.println("1 - Creare cont");
		System.out.println("2 - Log in");
		System.out.println("3 - Iesire");
		
		Scanner s = new Scanner(System.in);
		int value = s.nextInt();
		
		switch(value) {
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
		case 3 :{
			return new Rezultat(2);
		}
		default:{
			System.out.println("Alegeti o valoare intre 1 - 3\n");
			meniuAutentificare();
			break;
		}
		}
		
		return new Rezultat(2);
	}
	
	
	public static void formularCreareCont(){
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
		 
		System.out.println("ATI CREAT CU SUCCES CONTUL!");
		meniuEvenimente();
		
	}
	
	public static void formularLogIn(){
		System.out.println("-------------------------------------");
		System.out.println("LOG IN");
		
		Scanner s = new Scanner(System.in).useDelimiter("\n");
		
		System.out.println("Email: ");
		String email = s.next();
		System.out.println("Parola: ");
		String parola = s.next();
		
		//TO DO: VERIFICARE IN BAZA DE DATE
		
		System.out.println("V-ATI LOGAT CU SUCCES!");
		meniuEvenimente();
	}
	
	public static Rezultat meniuEvenimente() {
		System.out.println("-------------------------------------");
		System.out.println("CATEGORII EVENIMENTE");
		System.out.println("Alegeti categoria de evenimente:");
		System.out.println("1 - HACKATHON");
		System.out.println("2 - ALGORITMICA");
		System.out.println("3 - WORKSHOP");
		System.out.println("4 - Iesire");
		
		return new Rezultat(2);
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
