package classes;

public class AnimalTester {
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal(52, 2, 65);
		Animal a2 = new Animal(28, 6, 85);
		
		System.out.println("The speed of animal 1 is: " + a1.getTime(170)+ " per hour.");
		System.out.println("The speed of animal 1 is: " + a2.getTime(170)+ " per hour.");		
	}

}
