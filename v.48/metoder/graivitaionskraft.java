
public class graivitaionskraft {

	public static void main(String[] args) {
		
		double massaPerson = 80;
		double massaJorden = 5.972 * Math.pow(10, 24);
		double radieJorden = 6378000;
		double gravitationsKonstant = 6.67408 * Math.pow(10, -11);
		
		gravitationKraft(massaJorden, massaPerson, radieJorden, gravitationsKonstant);
	}

	static double gravitationKraft(double massaJorden, double massaPerson, double radieJorden, double gravitationsKonstant) {
		
		double force;
		force = massaPerson * massaJorden * gravitationsKonstant/(radieJorden*radieJorden) 
	}
}
