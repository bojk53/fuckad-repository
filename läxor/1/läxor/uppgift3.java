package läxor;

import java.util.Scanner;

public class uppgift3 {

    public static void main(String[] args){
    	
        System.out.println("Ett program som läser in en följd av tal och multiplicerar ihop dem. \n" +
                "Inläsningen ska avbrytas då produktens belopp överstigit 100 000 eller då 10 st tal skrivits in.");
        System.out.println();
        System.out.print("Skriv in tal: ");
        
    Scanner scanner = new Scanner(System.in);
      boolean running = true;
      int sum = 0;
      int amountOfNumbers = 0;
      // Loop som kör så länge running är true
      	
      while(running){ 	
      int inNum = scanner.nextInt();

    if(amountOfNumbers == 0){
    	//Kollar ifall det numret är det första numret och då skall den sätta så att summan blir det numret.Annars blir suma alltid 0.
        sum = inNum;
        amountOfNumbers++;        
    }
    
    else if(sum < 100000 && amountOfNumbers < 10){
                // Om det inte är första nummret och summan är mindre än 100 000 och antalet nummer är mindre än 10, multiplicera summan med nya talet.
                sum = sum*inNum;
                amountOfNumbers++;        
    }
    
    	else{
    	// Om summan är mer än 100 000 eller antalet nummer är mer än 10. Avsluta programmet och skriv ut nummret.
        System.out.println("Exiting");
        System.out.println("Result: " + sum);
            running = false;
            scanner.close();
            }
        }
    }
}
