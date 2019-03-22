
// 1. En metod som gör om Kelvin till grader celsius. 
		// static double kelvinToCelsius(double kelvin), kelvinToCelsius(50) => -223.15 

// 2. En metod som omvandlar cm^3 till m^3.
		// static double cubicCmToCubicM(double radius), cubicCmToCubicM(1000) => 0,001

// 3. En metod som tar in två personers namn och åldrar, skriver ut en hälsning till bägge personer och returnerar summan av deras åldrar. 
		// static int greetingPlusAge(String name1, String name2, int age1, int age2), greetingPlusAge("Tomas", "Henrik", 23, 28) => 51

// 4. En metod som räknar ut skillnad mellan två givna värden. 
		// static double delta(double first, double last), delta(1,10) => 9

// 5. En metod som räknar ut volymen hos en sfär.
		// 	static double volumeOfSphere(double radius), volumeOfSphere(10) => 4186,67

import java.util.Scanner;

public class Metoder {
	
	public static void main(String []args) {
		
		//double x = KelvinToCelsius(50); 
		//System.out.println(x);
		
		//double x = cubicCmToCubicM(1000); 
		//System.out.println(x);
		
		//int x = greetingPlusAge("Tomas ", "Henrik ", 23, 28);
		//System.out.println(x);
		
		//double x = delta(1,10);
		//System.out.println(x);
		
		
		System.out.println(volumeOfSphere(10));
	}
	
	//public static double KelvinToCelsius(double kelvin) {
		//return kelvin + -273.15;
	//}
	
	//public static double cubicCmToCubicM(double radius) {
		//return radius * Math.pow(10, -6);
	//}
	
	//public static int greetingPlusAge(String name1, String name2, int age1, int age2) {
		//System.out.println("Hej och välkomna " + name1 + "och " + name2);
		//return (age1 + age2);
	//}
	
	//public static double delta(double first, double last) {
		//return first - last;
	//}	 		
	
	public static double volumeOfSphere(double radius) {
		double result = 4 * Math.PI * radius * radius * radius / 3;
		return result;
	}
}
