import java.util.Scanner;
public class Doublevolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		{
			
		}
		double volym;
		Scanner scan = new Scanner(System.in);
		volym = volume(scan.nextDouble());
		System.out.println(volym);
		}
	
	public static double volume(double radius){
		radius = Math.pow(radius, 3) * 4 * Math.PI;
		radius = radius / 3;
		return radius;
		}
	
}
