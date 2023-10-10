package inventory;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String temName = "";
		double temPrice;
		int temQuantity;
		String temId;
		int maxSize = -89;
				
		do {
			try {
				System.out.println("Enter the number of products you would like to add \n"
						+ "Enter 0 (zero) if you do not wish to add products");
				maxSize = in.nextInt();
				if (maxSize == 0) {
					System.out.println("It is not necessary to add products");
				}else if(maxSize > 0) {
					Product[] products = new Product[maxSize];
					
					for (int i = 0; i < products.length; i++) {
						in.nextLine();
						System.out.println("Please enter the product name: ");
						temName = in.next();
						System.out.println("Please enter the product price: ");
						temPrice = in.nextDouble();
						System.out.println("Please enter the product quantity: ");
						temQuantity = in.nextInt();
						System.out.println("Please enter the product ID: ");
						temId = in.next();	
						products[i] = new Product(temName, temPrice, temQuantity, temId);
					}
					
					// Here I can see the products into the array 
					for (Product product : products) {
						System.out.println(product + "\n");
					}
				}else {
					System.out.println("You have entered an invalid value :(");
				}
			} catch (Exception e) {
				System.err.println("Please only enter positive numbers");
				// Clean the buffer 
				in.nextLine();

			}
					
		} while (maxSize < 0);
		
		//Close Scanner 
		in.close();
	}
}
