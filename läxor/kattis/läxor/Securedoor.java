package l�xor;

import java.util.ArrayList;
import java.util.Scanner;

public class Securedoor {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
	ArrayList<String> checkdIn = new ArrayList<String>();
	int numOfLogs = Integer.parseInt(scan.nextLine());
		
	for (int i = 0; i < numOfLogs; i++) {
		String[] entry = scan.nextLine().split(" ");

		/* j�mf�ra de i str�ngen innan mellanslaget f�r entry och s� kollar den om namnet st�mmer */
			if (entry[0].equals("entry") && checkdIn.contains(entry[1])) {
				System.out.println(entry[1] + " entered (ANOMALY)");
				
		/* samma sak fast f�r exit */
			} else if (entry[0].equals("exit") && !checkdIn.contains(entry[1])) {
				System.out.println(entry[1] + " entered (ANOMALY)");
			
		/* �ndrar entry till enterd */
			} else if (entry[0].equals("entry")) {
				checkdIn.add(entry[1]);
				System.out.println(entry[1] + " entered");
			
		/* exit till exited*/
			} else {
				checkdIn.remove(entry[1]);
				System.out.println(entry[1] + " exited");
			}
		}
		scan.close();
	}

}