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

		System.out.println("Hej, Gissa på en siffra mellan 1-100!");

		/* berättar för dig ifall talet är högre eller lägre än ditt nuvarande gissning som är fel*/
		/* den räknar för varje gång du gissar fel */
		
		do {
			while (guess != svar) {
				guess = input.nextInt();

				if (guess > svar) {
					System.out.println("talet är mindre än: " + guess);
					antal++;
				}
				if (guess < svar) {
					System.out.println("talet är större än: " + guess);
					antal++;
				}
				if (guess == svar) {
					System.out.println("Grattis, du gissdade rätt!");
					antal++;
					System.out.println("Du gissade " + antal + " gånger");
				}
			}
			/* den frågar ifall du vill köra en gång till eller avsluta, du kan välja att gå tillbaka till starten genom boolean */
			System.out.println("Vill du köra igen? 1 ja 2 nej");
			guess = input.nextInt();
			if(guess == 1) {
				System.out.println("Hej, Gissa på en siffra mellan 1-100!");
				svar = (int) (1 + Math.random() * 100);
				guess = 0;
			}else if (guess == 2) {
				goback = false;
			}
		} while (goback); //hej
	}
}
