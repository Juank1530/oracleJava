
public class Candidate {

	private int numberStudens;
	private int ranking;
	private double average;
	private int sat;
	private double AVERAGE1 = 4.0;
	private double AVERAGE2 = 3.5;
	private double AVERAGE3 = 3.0;
	
	public Candidate() {
		
	}
	
	public Candidate(int numberStudens, int rankig, double average, int sat) {
		this.numberStudens = numberStudens;
		this.ranking = rankig;
		this.average = average;
		this.sat = sat;
	}
	
	public boolean rankingNumberStuden(int numberStudens, int ranking) {
		
		if(numberStudens >= 1400 && (ranking == 1 || ranking == 2)){	 
			return true;	
		}
		return false;
	}
	
	public boolean average(double average, int sat) {
		
		if(average >= AVERAGE1 && sat >= 1100){
			return true;	
		}else if (average >= AVERAGE2 && sat >= 1300) {
			return true;
		}else if (average >= AVERAGE3 && sat >= 1500) {
			return true;
		}else {
			return false;
		} 
	}
	
	public void validation(boolean conditon1, boolean condition2) {
		
		String acceted = (conditon1 == true || condition2 == true) ? 
				"Congratulations The student can be accepted :)" : 
				"Unfortunately the student cannot be accepted :(";
		System.out.println(acceted);
	}
	
	public int getNumberStudens() {
		return numberStudens;
	}

	public void setNumberStudens(int numberStudens) {
		this.numberStudens = numberStudens;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public int getSat() {
		return sat;
	}

	public void setSat(int sat) {
		this.sat = sat;
	}
	
	
	
	


	
	
}
