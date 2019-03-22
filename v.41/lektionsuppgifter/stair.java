
public class stair {

	public static void main(String[] args) {
		
		System.out.println(stair(30));

	}
	public static int stair(int steps) 
	{
		char x = 'x';
		for(int i = 0; i < steps; i++) {
			for (int y = 0; y <= i; y++) {
				System.out.print("x");
			}
	System.out.println();
			}
		return steps;
	}
	
	
}
