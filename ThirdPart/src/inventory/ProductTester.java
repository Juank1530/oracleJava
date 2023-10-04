package inventory;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String temName = "";
		double temPrice;
		int temQuantity;
		String temId;
		
		System.out.println("Please enter the product name: ");
		temName = in.next();
		System.out.println("Please enter the product price: ");
		temPrice = in.nextDouble();
		System.out.println("Please enter the product quantity: ");
		temQuantity = in.nextInt();
		System.out.println("Please enter the product ID: ");
		temId = in.next();	
		Product prod = new Product(temName, temPrice, temQuantity, temId); 
		
		in.nextLine();
		
		System.out.println("Please enter the product name: ");
		temName = in.next();
		System.out.println("Please enter the product price: ");
		temPrice = in.nextDouble();
		System.out.println("Please enter the product quantity: ");
		temQuantity = in.nextInt();
		System.out.println("Please enter the product ID: ");
		temId = in.next();	
		Product prod7 = new Product(temName, temPrice, temQuantity, temId); 
		
		in.close();
		
		
		
		Product prod1 = new Product();
		prod1.setId("JK001");
		prod1.setName("Printer");
		prod1.setPrice(450000);
		prod1.setQuantity(6);
		Product prod2 = new Product();
		prod2.setId("JK002");
		prod2.setName("Headset");
		prod2.setPrice(500000);
		prod2.setQuantity(10);
		Product prod3 = new Product("CPU", 85000, 45, "JK003");
		Product prod4 = new Product("Display", 350000, 12, "JK004");
		Product prod5 = new Product("Mouse", 20000, 25, "JK005");
		Product prod6 = new Product("Keyboard", 25000, 65, "JK006");
		prod6.setActive(false);
		
		System.out.println(prod1.toString());
		System.out.println(prod2.toString());
		System.out.println(prod3.toString());
		System.out.println(prod4.toString()); 
		System.out.println(prod5.toString());
		System.out.println(prod6.toString());
		
		
		
		
		
		
	}

}
