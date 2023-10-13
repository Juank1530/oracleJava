package inheritance;

import java.sql.Date;

public class Students extends Person {
	
	private String id;
	private double average;
	private String carreer;
	private Date dateOfDegree;
	
	public Students (String firstName, String middleName, String lastName, Date dateOfBirth, String id, double average, String carreer, Date dateOfDegree) {
		super(firstName, middleName, lastName, dateOfBirth);
		this.id = id;
		this.average = average;
		this.carreer = carreer;
		this.dateOfDegree = dateOfDegree;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public String getCarreer() {
		return carreer;
	}

	public void setCarreer(String carreer) {
		this.carreer = carreer;
	}

	public Date getDateOfDegree() {
		return dateOfDegree;
	}

	public void setDateOfDegree(Date dateOfDegree) {
		this.dateOfDegree = dateOfDegree;
	}
	
	
	

}
