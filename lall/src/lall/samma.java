package lall;
import java.util.Scanner;
public class samma {
	public static void main (String[] args) {
	System.out.println(fakultet(3));
	System.out.println(fakultet(2));
	System.out.println(fakultet(3)*fakultet(3));
}

private static int fakultet(int n){
	int prod = 1;
	for(int i = n ; i > 0 ; i--)
		prod *= i;
	return prod;
	}
}
	
