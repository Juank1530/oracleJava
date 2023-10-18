package inheritance;

public class StudentsTester {

	public static void main(String[] args) {
		Students stu1 = new Students();
		
		double [] notes = new double[5];
		notes[0] = 4;
		notes[1] = 4;
		notes[2] = 4;
		notes[3] = 4;
		notes[4] = 4;
		
		System.out.println(stu1.gpa(notes));

	}

}
