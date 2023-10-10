package classes;

public class Animal {
	
	private int weight, height;
	private double speed;
	
	public Animal() {
		weight = 50;
		height = 4;
		speed = 2; // Miles per hour 
	}
	
	public Animal(int w, int h, double s ) {
		weight = w;
		height = h;
		speed = s; // Miles per hour 
	}
	
	public double getTime(double miles) {
		//Gets the numbers of the hours to go these miles 
		return miles/speed;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

}
