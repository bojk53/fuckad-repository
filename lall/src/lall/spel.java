package lall;

import java.util.Scanner;

public class spel {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean goback = true;

		/* skapar random variabel mellan 1-100, sparars i svar */
		int svar, guess = 0;
		svar = (int) (1 + Math.random() * 100);

		int antal = 0;

		System.out.println("Hej, Gissa p� en siffra mellan 1-100!");

		/* ber�ttar f�r dig ifall talet �r h�gre eller l�gre �n ditt nuvarande gissning som �r fel*/
		/* den r�knar f�r varje g�ng du gissar fel */
		
		do {
			while (guess != svar) {
				guess = input.nextInt();

				if (guess > svar) {
					System.out.println("talet �r mindre �n: " + guess);
					antal++;
				}
				if (guess < svar) {
					System.out.println("talet �r st�rre �n: " + guess);
					antal++;
				}
				if (guess == svar) {
					System.out.println("Grattis, du gissdade r�tt!");
					antal++;
					System.out.println("Du gissade " + antal + " g�nger");
				}
			}
			/* den fr�gar ifall du vill k�ra en g�ng till eller avsluta, du kan v�lja att g� tillbaka till starten genom boolean */
			System.out.println("Vill du k�ra igen? 1 ja 2 nej");
			guess = input.nextInt();
			if(guess == 1) {
				System.out.println("Hej, Gissa p� en siffra mellan 1-100!");
				svar = (int) (1 + Math.random() * 100);
				guess = 0;
			}else if (guess == 2) {
				goback = false;
			}
		} while (goback); //hej
	}
}
