
import java.util.Scanner;

public class name {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name();
		String name2();
		
		System.out.println("Hej! Vad heter du och din mamma?");
		name = input.nextLine();
		name2 = input.nextLine();
		
		welcomeMessage(name, name2);
		// System.out.print("Hej " + name + "! välkommen hit!");
		
	}
	
	//skriv en metod som returnerar en hälsning till en person
	
	static void welcomeMessage(String name, String name2) {
	
	System.out.println("hej " + name + " välkommen");
	System.out.println("hej " + name2 + " välkommen hit du också");
	}
}
