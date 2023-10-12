package classes;

public class Fish {
	
	String typeOfFish, name;
	int friendliness;
	
	public Fish () {
		typeOfFish = "Unknow";
		friendliness = 3;
	}
	
	public Fish (String n, String t, int f) {
		this.name = n;
		this.typeOfFish = t;
		this.friendliness = f;

	}
	
	public int Fish () {
		return this.friendliness;
	}
	
	public Fish nicestFish(Fish f1, Fish f2) {
		
		if (f1.getFriendliness() > f2.getFriendliness()) {
			return f1;
		}
		return f2;
	}
	
	public Fish nicestFish(Fish ...fish) {
	    
		if (fish.length == 0) {
	        System.out.println("There is not any fish.");
			return null; 
	    }
		
		Fish tempFish = fish[0];
		
		for (int i = 0; i < fish.length; i++) {
			
			if (fish[i].getFriendliness() > tempFish.getFriendliness()) {
				tempFish = fish[i];
			}
		}return tempFish;
		
	}

	public String getTypeOfFish() {
		return typeOfFish;
	}

	public void setTypeOfFish(String typeOfFish) {
		this.typeOfFish = typeOfFish;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFriendliness() {
		return friendliness;
	}

	public void setFriendliness(int friendliness) {
		this.friendliness = friendliness;
	}
	
	
	

}
