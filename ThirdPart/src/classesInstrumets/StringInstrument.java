package classesInstrumets;

public class StringInstrument extends Instrument {
	int numStrings;

	public StringInstrument() {
		
	}

	public StringInstrument(int numStrings) {
		super();
		this.numStrings = numStrings;
	}

	public int getNumStrings() {
		return numStrings;
	}

	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}
	
	
	
	
}
