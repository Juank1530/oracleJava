package classes;

public class Shape {
	
	private int numSides;
	private boolean regular;
	
	
	public Shape() {
		
	}
	
	public Shape(int numSides) {
		this.numSides = numSides;
	}
	
	public Shape(boolean regular) {
		this.regular = regular;
	}
	
	public Shape(int numSides, boolean regular) {
		this.numSides = numSides;
		this.regular= regular;
	}

	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	public boolean isRegular() {
		return regular;
	}

	public void setRegular(boolean regular) {
		this.regular = regular;
	}
	
}
