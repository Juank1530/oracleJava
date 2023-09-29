import java.text.DecimalFormat;
import java.util.Scanner;

public class WeightOutSite {

	public static void main(String[] args) {
		
		double p1 = 0.38, p2 = 0.91, p3 = 2.36, p4 = 0.92, p5 = 0.89, p6 = 1.13;
		DecimalFormat format = new DecimalFormat("0.00");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your weight: ");
		float weight = in.nextFloat();
		System.out.println("Please enter number of the planet when yu want to know your weight: ");
		System.out.println(""
				+ "1. Mercury" + "\n"
				+ "2. Venus" + "\n"
				+ "3. Mars" + "\n"
				+ "4. Jupiter" + "\n"
				+ "5. Saturn" + "\n"
				+ "6. Uranus" + "\n"
				+ "7. Neptune" + "\n"
				);
		int planet = in.nextInt();
		
		switch (planet) {
		case 1:
			double pm = weight * p1; 
			System.out.println("Your weight in Mercury is " + format.format(pm) + " kg."  );
			break;
		case 2:
			double pv = weight * p2; 
			System.out.println("Your weight in Venus is " + format.format(pv) + " kg."  );
			break;
		case 3:
			double pma = weight * p1; 
			System.out.println("Your weight in Mars is " + format.format(pma) + " kg."  );
			break;
		case 4:
			double pj = weight * p3; 
			System.out.println("Your weight in Jupiter is " + format.format(pj) + " kg."  );
			break;
		case 5:
			double ps = weight * p4; 
			System.out.println("Your weight in Saturn is " + format.format(ps) + " kg."  );
			break;
		case 6:
			double pu = weight * p5; 
			System.out.println("Your weight in Uranus is " + format.format(pu) + " kg."  );
			break;
		case 7:
			double pn = weight * p6; 
			System.out.println("Your weight in Neptune is " + format.format(pn) + " kg."  );
			break;
		default:
			System.out.println("Invalid planet :( try again.");
			break;
		}
		in.close();
	}
}
