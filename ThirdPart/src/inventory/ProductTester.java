package inventory;
import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		int maxSize = -1;
		
		getMenuOption(maxSize, in);
				
		do {
			try {
				maxSize = getNumProducts(in); 
				
				if (maxSize == 0) {
					System.out.println("It is not necessary to add products");
				}else if(maxSize > 0) {
					Product[] products = new Product[maxSize];
					
					addToInventory(products, in);
					
					displayInventory(products);
					
					
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
	
	public static void displayInventory(Product[] products) {
		// Here I can see the products into the array 
		for (Product product : products) {
			System.out.println(product + "\n");
		}
	}
	
	public static void addToInventory(Product[] products, Scanner in) {
		String temName = "";
		double temPrice;
		int temQuantity;
		String temId;
		
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
	}
	
	public static int getNumProducts(Scanner in) {
		int maxSize = -1;
		System.out.println("Enter the number of products you would like to add \n"
				+ "Enter 0 (zero) if you do not wish to add products");
		maxSize = in.nextInt();
		return maxSize;
	}
	
	public static int getMenuOption(int option, Scanner in) {
		option = -1;
		do {
			try {
				System.out.println("1. View Inventory\r\n"
						+ "2. Add Stock\r\n"
						+ "3. Deduct Stock\r\n"
						+ "4. Discontinue Product\r\n"
						+ "0. Exit\r\n"
						+ "Please enter a menu option:");
				option = in.nextInt();
				switch (option) {
				case 1:
					System.out.println(1);
					break;
				case 2:
					System.out.println(2);
					break;
				case 3:
					System.out.println(3);
					break;
				case 4:
					System.out.println(4);
					break;
				case 0:
					System.out.println(0);
					break;
				default:
					System.out.println(":( Invalid option, try again please.");
					break;
				}
			} catch (Exception e) {
				System.err.println("Please only enter positive numbers");
				// Clean the buffer 
				in.nextLine();
			}
		} while (option < 0 || option > 4);
		in.close();
		return option;
	}
	
	
	
}
