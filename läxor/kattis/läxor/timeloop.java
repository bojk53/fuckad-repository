package läxor;

import java.util.Scanner;

public class timeloop {


	    public static void main(String[] args){
	        System.out.println("Hokus pokus filli okus!");
	        System.out.println();
	        System.out.print("Skriv in en bas: ");

	        Scanner scanner = new Scanner(System.in);
	        int base = scanner.nextInt();

	        for(int i = 0; i<base; i++){
	            for(int j = base - i; j>1; j--){ //Sriver ut antal mellanrum innan
	                System.out.print(" ");
	            }

	            for(int j = 0; j <= i; j++){ //Skriver ut X tecken
	                System.out.print("Abracadabra");
	            }

	            System.out.println(); //Skapar ny rad så allt inte hamnar på samma rad
	        }
	    }
	}
