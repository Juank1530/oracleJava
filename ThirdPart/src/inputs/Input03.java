package inputs;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
    	Scanner sc = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
    	System.out.println("Enter three number separate by spaces: ");
    	int numb = sc.nextInt();
    	int numb2 = sc.nextInt();
    	int numb3 = sc.nextInt();
    	
    	int total = numb + numb2 + numb3;
    	System.out.println(total);
  
        //Remember to close the Scanner
        sc.close();
    }
}
