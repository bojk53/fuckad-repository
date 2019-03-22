import java.util.Scanner;

public class reppe {

	
	public static void main(String[] args) {
		
		int heltal2; // initiera variabel
		heltal2 = 2; // tilldela varibeln ett värde
		int heltal = 1; // deklarerar
		double decimaltal = 1.1;
		String ord = "Henrik " + "Stahl"; // "+" kallas att konkatinera
		char bokstav = 'b';
		
		// System.out.print("Henrik vill inte ha matte prov nästa vecka \n\t"); // \n betyder ny rad
	
		// System.out.printf("första talet är %d, andra talet är %.2f%n", heltal2, decimaltal);
		// System.out.print("första talet är " + heltal2 + "\n" + ord);
		
		int tal1 = 0; //initierar en variabel som kommer tilldelas ett värde av Scanner
		double average = 0;
		double summa = 0;
		// int tal1; input = new Scanner(System.in);
		
		// Importerar Scanner
		Scanner input = new Scanner(System.in);
		
		// Skriver ut ett medelande 
		System.out.println("please type 10 numbers: ");
		
		//läser in ett heltal från konsolen
		
		for (int i = 1; i <= 10; i++) {
			  (tal1 < 0) {
			System.out.println("Your number in negative. Please type again! ");
			i--;
		}
			
		//SKRIV IN ETT VILLKOR SÅ ATT TAL > 20 INTE SKA KSRIVAS UT
			
		else {
			summa += tal1;
			}
		}

		
		int antalLoopar = 1;
		// samma som forloopen ovan
		while (antalLoopar <=10) {
			
			//tal1 = input.nextInt();
			antalLoopar++;
		}
			
			average = ((double) tal1)/10;
			
			System.out.println(10/3);
			System.out.println(average);
		
	}
	
}
