
public class CandidateTester {

	public static void main(String[] args) {
		
		Candidate can1 = new Candidate();
		boolean condition1 = can1.rankingNumberStuden(1399, 1);
		boolean condition2 = can1.average(3, 1500);
		can1.validation(condition1, condition2);
		
		Candidate can2 = new Candidate(1200, 3, 4, 1000);
		can2.validation(can2.rankingNumberStuden(can2.getNumberStudens(), can2.getRanking()), 
				can2.average(can2.getAverage(), can2.getSat()));

	}

}
