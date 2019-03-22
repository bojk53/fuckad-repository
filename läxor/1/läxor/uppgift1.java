

package läxor;

import java.util.Scanner;

//skapa ett program som läser in tal från konsolen och nör man skriver
//in talet 0 så ska den skriva ut summan av alla tal.

public class uppgift1 {
	
	public static void main(String[] args) {
		
		double tal = 1;
		double summa = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please type a number: ");
		
		//loopen körs till att talet 0 matas in i konsolen
		while (tal != 0) {
			
			tal = input.nextDouble();
			summa += tal;
		}
		System.out.println("The sum of all number is " + summa);
	// annars System.out.printf("the sum of all numbers is %.1f", summa);
	
	input.close();

	}
}