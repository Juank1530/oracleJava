package classes;

import java.text.DecimalFormat;

public class StudentsTester {

	public static void main(String[] args) {
		
		DecimalFormat format = new DecimalFormat("0.00");
		Students s1 = new Students("Mary Jones", 14, 46);
		Students s2 = new Students("John Stiner", 60, 173);
		Students s3 = new Students("Ari Samala", 31, 69);
		
		System.out.println(s1.toString());
		System.out.println("Average = " + format.format(s1.averageData()) + "\n");
		System.out.println(s2.toString());
		System.out.println("Average = " + format.format(s2.averageData()) + "\n");
		System.out.println(s3.toString());
		System.out.println("Average = " + format.format(s3.averageData()) + "\n");
		
		System.out.println("The new average to " +s3.getName() + "is: " + s3.upDateStudentData());
		System.out.println("Now the Student " +s3.getName() + "has: " + s3.getCredits() + " credits.");
		System.out.println("Now the Student " +s3.getName() + "has: " + s3.getQualityPoints() + " quality points.");
				
	}

}
