import java.util.Scanner;
public class kelvin {

	public static void main(String[] args) 
	{
		System.out.println(kelvin(10));
	}
	public static double kelvin(double celsius) 
	{
		celsius = celsius + 273.15;
		return celsius;
	}
}
