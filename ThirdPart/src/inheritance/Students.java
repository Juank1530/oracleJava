package inheritance;

import java.sql.Date;

public class Students extends Person {
	
	private String id;
	private double average;
	private String carreer;
	private Date dateOfDegree;
	private double[] notes;
    private int maximunSize;
	
	public Students () {
	}
	
    public Students (String firstName, String middleName, String lastName, Date dateOfBirth, String id, double average, String carreer, Date dateOfDegree,double[] notes, int maximunSize) {
		super(firstName, middleName, lastName, dateOfBirth);
		this.id = id;
		this.average = average;
		this.carreer = carreer;
		this.dateOfDegree = dateOfDegree;
		this.notes = notes;
		this.maximunSize = maximunSize;
	}
	
	public String gpa(double[] notes) {
		
		double totalNotes = 0;
		String qualification = "";
		for (int i = 0; i < notes.length; i++) {
			totalNotes += notes[i] ;
		}
		double average = totalNotes/notes.length;
		
		if(average < 1) {
			return "Your qualification is: F";
		}else if(average >= 1 && average < 2) {
			return "Your qualification is: D";
		}else if(average >= 2 && average < 2.33) {
			return "Your qualification is: C";
		}else if(average >= 2.33 && average < 2.67) {
			return "Your qualification is: C+";
		}else if(average >= 2.67 && average < 3) {
			return "Your qualification is: B-";
		}else if(average >= 3 && average < 3.33) {
			return qualification = "Your qualification is: B+";
		}else if(average >= 3.67 && average < 4) {
			return "Your qualification is: A-";
		}else if(average >= 4){
			return "Your qualification is: A";
		}
		return qualification;
	}


	public double[] getNotes() {
		return notes;
	}

	public void setNotes(double[] notes) {
		this.notes = notes;
	}

	public int getMaximunSize() {
		return maximunSize;
	}

	public void setMaximunSize(int maximunSize) {
		this.maximunSize = maximunSize;
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
