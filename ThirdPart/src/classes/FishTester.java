package classes;

public class FishTester {

	public static void main(String[] args) {
		
		Fish fish1 = new Fish("Amber", "AngelFish", 5);
		Fish fish2 = new Fish("James", "Guppy", 3);
		Fish fish3 = new Fish("Juan", "Guppy", 8);
		Fish fish4 = new Fish("Jose", "Guppy", 9);
		Fish fish5 = new Fish("Juliana", "Guppy", 15);
		
		
		Fish nicer = fish1.nicestFish(fish1, fish2);
		
		String name = nicer.getName();
		int friendliness = nicer.getFriendliness();
		
		System.out.println("The friendliness fish is " + name + " with " + friendliness + " points" );
		
		Fish nicest = fish1.nicestFish(fish1, fish2, fish3, fish4, fish5);
		
		String name1 = nicest.getName();
		int friendliness1 = nicest.getFriendliness();
		
		System.out.println("The friendliness fish is " + name1 + " with " + friendliness1 + " points" );
		
		

		

	}

}
