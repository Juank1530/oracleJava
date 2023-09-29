import java.util.Scanner;

public class IfTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		float n1 = in.nextFloat();
		System.out.println("Please enter the second number: ");
		float n2 = in.nextFloat();
		System.out.println("Please enter operation symbol: ");
		String operation = in.next();
		
		if(operation.equals("+")) {
			System.out.println("You have selected Add");
			float resulset = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + resulset);
		}else if (operation.equals("-")) {
			System.out.println("You have Sustraction Add");
			float resulset = n1 - n2;
			System.out.println(n1 + " - " + n2 + " = " + resulset);
		}else if (operation.equals("*")) {
			System.out.println("You have selected Multiplication");
			float resulset = n1 * n2;
			System.out.println(n1 + " * " + n2 + " = " + resulset);
		}else if (operation.equals("/")) {
			if (n2 != 0) {
				System.out.println("You have selected Divition");
				float resulset = n1 / n2;
				System.out.println(n1 + " / " + n2 + " = " + resulset);
			} else {
				System.out.println("It is not possible to divide by zero");
			}
		}else {
			System.out.println("Invalid symbol :( try again.");
		}
		in.close();
	}
}
