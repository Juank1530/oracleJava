package vehicles;

public class Vehicle {
	
	public static String MAKE = "Augur";
	public static int numVehicles = 0;
	private String chassisNo;
	private String model;
	
	
	public Vehicle(String model) {
		this.model = model;
		numVehicles ++;
		chassisNo = "ch"+numVehicles;
		System.out.println("Vehicle manufactured.");
	}
	
	public static class Engine extends Vehicle{
		
		private static final String MAKE = "Predicter";
		private static final int CAPACITY = 1600;

		public Engine(String model) {
			super(model);	
		}

		public static String getMake() {
			return MAKE;
		}

		public static int getCapacity() {
			return CAPACITY;
		}
		
		
			
	}

	
	@Override
	public String toString() {
		return "Manufacturer: " + MAKE + "\n\n"
			 + "Vehicle manufactured"  + "\n"
			 + "The vehicle is manufactured by: " + MAKE + "\n"
			 + "The model type is: " + model + "\n"
		     + "The chassis number is: " + chassisNo + "\n"
		     + "The engine make is: " + Engine.MAKE + "\n"
		     + "The engine capacity is: " + Engine.CAPACITY + "\n"
		     ;
	}
	
	public String total(Vehicle ...vehicles) {
		int totalVehicles = 0;
		for (int i = 0; i < vehicles.length; i++) {
			totalVehicles++;
		}
		String FinaltotalVehicles = "Number of vehicles manufactured: " + Integer.toString(totalVehicles);
		return FinaltotalVehicles;
	}

	public static String getMAKE() {
		return MAKE;
	}

	public static void setMAKE(String mAKE) {
		MAKE = mAKE;
	}

	public static int getNumVehicles() {
		return numVehicles;
	}

	public static void setNumVehicles(int numVehicles) {
		Vehicle.numVehicles = numVehicles;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
