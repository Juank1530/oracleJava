package classes;

import java.util.Scanner;


public class CardTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String option = "yes";		
		Card[] cards = new Card[2];
		int total = 0;
		int totalCard = 3;
		
		for (int i = 0; i < 2; i++) {
			
			int suitNumberi = (int)(Math.random()*4.0+1);
			int faceNumberi = (int)(Math.random()*13.0+1);
			cards[i] = new Card(suitNumberi, faceNumberi);
			System.out.println(cards[i]);
			total += cards[i].points;
		}
		System.out.println("You have " + total + " points"); 
		
		
		do {
			System.out.println("Do you want aonther card ? \n"
					+ "yes or no");
			option = in.nextLine();
			
			System.out.println("You have " + totalCard + " cards in your hand.");
			
			if(option.equals("yes")) {
				for (int i = 0; i < 1; i++) {	
					int suitNumberi = (int)(Math.random()*4.0+1);
					int faceNumberi = (int)(Math.random()*13.0+1);
					cards[i] = new Card(suitNumberi, faceNumberi);
					System.out.println("Your new card is: " + cards[i] + "\n");
					total += cards[i].points;
				}
				System.out.println("You have " + total + " points");
		
				if(total == 21) {
					System.out.println("You win :) !!!");
					option = "no";
				}else if(total > 21) {
					System.out.println("You lost :(, you have more to 21 points  !!!");
					option = "no";
				}else if(totalCard > 5){
					System.out.println("You lost :(, you have more of 5 cards !!!");
					option = "no";
				}
			}else {
				System.out.println("Game over");
			}
			
			totalCard++;
			
		} while (option.equals("yes")); 
			
		in.close();
	}

}
