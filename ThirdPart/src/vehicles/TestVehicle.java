package vehicles;

public class TestVehicle {
	
	public static void main(String[] args) {
		
		System.out.println("Manufacturer: " + Vehicle.MAKE);
		System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles + "\n");
		
		Vehicle vehicle1 = new Vehicle("Fiesta");
		System.out.println("The chassis number is chassisNo: " + vehicle1.getChassisNo() + "\n"
						+ "Car model: " + vehicle1.getModel() + "\n");
		
		Vehicle vehicle2 = new Vehicle("Edict");
		vehicle2.setMAKE("Seer");
		System.out.println("The chassis number is chassisNo: " + vehicle2.getChassisNo() + "\n"
				+ "Car model: " + vehicle2.getModel() + "\n");
		
		System.out.println(vehicle1.toString());
		System.out.println(vehicle2.toString());
		
		//Outerclass.InnerClass object name = new Outerclass.InnerClass (parameter);
		Vehicle.Engine Vehicle3 = new Vehicle.Engine("Fortune");
		
		System.out.println("Vehicle number " + Vehicle3.getChassisNo() 
					     + " is a " + Vehicle3.getModel() + " model "
					     + "and has an engine capacity of " + Vehicle3.getCapacity() + "cc");
		
		System.out.println(vehicle1.total(vehicle1, vehicle2, Vehicle3));



		
		
	}

}
