import java.util.Scanner;

public class ArrayTester {

	public static void main(String[] args) {
		
		int [] array = new int [9];
		
		float [][] price = new float [10][3];
		
		long [][] array2 = new long[4][3];
		
		for (int i = 0; i < array2.length; i++) {
			
			for (int j = 0; j < array2[i].length; j++) {
				
				array2 [i] [j] = 5;
				System.out.println(array2[i][j]);
			}	
		}
		
		byte [] byteArray = new byte[10];
		
		for (int i = 0; i < byteArray.length; i++) {
			byteArray[i] = 1;
			System.out.println(byteArray[i]);
		}
		
		
		String[][] test = new String[1][5];	
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				
				String note = in.next();
				float noteFloat = Float.parseFloat(note);
				test [i] [j] = noteFloat;
			}
			
		}
		
		
		
		

	}

}
