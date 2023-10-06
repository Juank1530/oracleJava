import java.util.Scanner;
import java.util.Arrays;

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
		
		
		int[][] test = new int[2][5];	
		Scanner in = new Scanner(System.in);
		int total = 0;
		float avegare = 0; 
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.println("Enter the note");
				String note = in.next();
				int noteInt = Integer.parseInt(note);
				test [i] [j] = noteInt;
				total += test[i][j];
				avegare = (float) total/test[i].length;
			}
			System.out.println(total);
			System.out.println(avegare);
		}
		
		
		
		
		

	}
	
	
	

}

