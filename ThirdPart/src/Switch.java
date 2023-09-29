import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		float n1 = in.nextFloat();
		System.out.println("Please enter the second number: ");
		float n2 = in.nextFloat();
		System.out.println("Please enter operation symbol: ");
		String operation = in.next();

		switch (operation) {
		case "+":
			System.out.println("You have selected Add");
			float resulset = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + resulset);
			break;
		case "-":
			System.out.println("You have Sustraction Add");
			float resulset1 = n1 - n2;
			System.out.println(n1 + " - " + n2 + " = " + resulset1);
			break;
		case "*":
			System.out.println("You have selected Multiplication");
			float resulset2 = n1 * n2;
			System.out.println(n1 + " * " + n2 + " = " + resulset2);
			break;
		case "/":
			if (n2 != 0) {
				System.out.println("You have selected Divition");
				float resulset3 = n1 / n2;
				System.out.println(n1 + " / " + n2 + " = " + resulset3);
				break;
			} else {
				System.out.println("It is not possible to divide by zero");
				break;
			}
		default:
			System.out.println("Invalid symbol :( try again.");
		}
		in.close();
	}

}
