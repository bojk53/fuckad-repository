package scanner;

import java.util.Scanner;

public class genomgångscanner {

		public static void main(String[] args) {
			
			Scanner input=new Scanner(System.in);
			System.out.println("vad heter du?");
			String name=input.nextLine();
			System.out.println("vad är din address?");
			String address=input.nextLine();
			System.out.println("Vilken klass går du i?");
			String klass=input.nextLine();
			System.out.println("Vad är ditt telefonnummer?");
			String nummer=input.nextLine();
			System.out.println("Ditt namn är: " + name);
			System.out.println("Din address är: " + address);
			System.out.println("Du går i klassen: " + klass);
			System.out.println("Ditt nummer är: " + nummer);
			

		}
}
