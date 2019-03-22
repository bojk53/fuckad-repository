import java.util.Scanner
;
public class siffersumma{
	
public static void main (String[] args) {
	Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		int res = 0;
		while(true) {
			res += x % 10;
			x/= 10;
			
			if(x == 0) {
				break;
			}
		}
		
		System.out.println(res);
	}
}
