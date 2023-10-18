package classesInstrumets;

public class Instrument {
	private boolean onSale;
	private double price;
	private int numInStock;
	
	public Instrument() {
		
	}
	
	public Instrument(boolean onSale, double price, int numInStock) {
		this.onSale = onSale;
		this.price = price;
		this.numInStock = numInStock;
	}
	
	public double applyEmloyeeDiscount() {
		double discuont = this.price*0.75;
		return discuont;
	}

	public boolean isOnSale() {
		return onSale;
	}

	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}

	public double getPrice() {
		if (this.onSale == true) {
			price = this.price * 0.85;
			return price;
		} else {
			this.price = this.price;
			return price;
		}
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumInStock() {
		return numInStock;
	}
	
	
	
	

}
