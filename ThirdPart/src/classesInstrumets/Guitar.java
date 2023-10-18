package classesInstrumets;

public class Guitar extends StringInstrument {
	
	boolean isElectric;
	
	public Guitar() {
		
	}

	public Guitar(boolean isElectric) {
		super();
		this.isElectric = isElectric;
	}

	public boolean isElectric() {
		return isElectric;
	}


	
	

}
