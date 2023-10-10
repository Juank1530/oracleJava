package classes;

import java.util.Scanner;

public class Students {
	
	private String name;
	private double credits;
	private double average;
	private double qualityPoints;
	
	public Students(String name, int credits, int qualityPoints) {
		super();
		this.name = name;
		this.credits = credits;
		this.qualityPoints = qualityPoints;
	}
	
	public double averageData() {
		return qualityPoints/credits;
	}
	
	public double upDateStudentData() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the new numbers of credits: ");
		credits = this.getCredits()+in.nextInt();
		System.out.println("Enter the new numbers of Quality Points: ");
		qualityPoints = this.getQualityPoints()+in.nextInt();
		average = this.averageData();
		in.close();
		return average;
	}
	
	
	
	@Override
	public String toString() {
		return "Student\nname = " + name + "\n" + "Credits = " + credits + "\n" + "QualityPoints = " + qualityPoints;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public double getQualityPoints() {
		return qualityPoints;
	}
	public void setQualityPoints(int qualityPoints) {
		this.qualityPoints = qualityPoints;
	}
	
	
	

}
