import java.util.Scanner;

public class minsta {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		int nummer1 = 0;
		int nummer2 = 0;
		System.out.println("Skriv ett heltal: ");
		do
		{
			int nummer = scanner.nextInt();
			if (nummer1 == 0)
			{
				System.out.println("Skirv ännu ett heltal: ");
				nummer1 = nummer;
				
			}
			if (nummer1 !=0)
			{
				if (nummer != 0)
					nummer2 = nummer;
			}
			
			if (nummer1 < nummer2) {
				System.out.println("nummer " + nummer1 + " är minst");
				exit = true;
			}else if (nummer2 < nummer1){
				System.out.println("nummer " + nummer2 + " är minst");
				exit = true;
				}
		}while(!exit);
	}
}

