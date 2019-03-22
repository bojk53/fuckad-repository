package läxor;

import java.util.Scanner;

public class uppgift2 {

public static void main(String[] args){
	
	System.out.println("Skapa ett program som läser in textrader från konsolen och avslutas när texten EXIT skrivs in.");
		
	System.out.println();
			
	System.out.println("Skriv in text: ");

			Scanner scanner = new Scanner(System.in);
		boolean running = true;
		while(running){
	
			//Berättar att när "SLUTA" skrivs in så tar den bort funktionen att skriva i konsolen
			String strIn = scanner.nextLine();
		if(strIn.equals("SLUTA")){
	running = false;
	
	scanner.close();
			}
		}
	}
}