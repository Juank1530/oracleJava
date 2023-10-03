import java.util.Scanner;

public class Decoder {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String chars[] = {"","D","W","E","L","H","O","R"};
		String secret = "";
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Please enter a number between 1 and 7: ");
			int number = input.nextInt(); 
			
			if(number >= 1 && number <=7) {
				
				secret += chars[number];
				
			}else {
				System.out.println("error");
				i--;
			}
		}
		input.close();
		System.out.println(secret);
	}

}
