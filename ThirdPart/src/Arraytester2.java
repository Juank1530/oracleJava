import java.util.Arrays;
import java.util.Scanner;

public class Arraytester2 {
	
	int[][] array = new int[2][2];
	int[][] array1 = new int[2][2];
	int[][] array2 = new int[2][2];
	int[][] resulsetArray1 = new int[2][2];
	Scanner in = new Scanner(System.in);
	
	public int[][] enterArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Enter the number");
				int value = in.nextInt();
				array [i] [j] = value;
			}
		}
		in.close();
		return array;
	}
	
	public void add(int[][] array1,int[][] array2) {
		System.out.println("You have selected Add");
		resulsetArray1 [0] [0] = array1 [0][0] + array2[0][0];
		resulsetArray1 [1] [0] = array1 [1][0] + array2[1][0];
		resulsetArray1 [0] [1] = array1 [0][1] + array2[0][1];
		resulsetArray1 [1] [1] = array1 [1][1] + array2[1][1];
		System.out.println(Arrays.deepToString(resulsetArray1));
	} 

	public void substration(int[][] array1,int[][] array2) {
		System.out.println("You have Sustraction Add");
		resulsetArray1 [0] [0] = array1 [0][0] - array2[0][0];
		resulsetArray1 [1] [0] = array1 [1][0] - array2[1][0];
		resulsetArray1 [0] [1] = array1 [0][1] - array2[0][1];
		resulsetArray1 [1] [1] = array1 [1][1] - array2[1][1];
		System.out.println(Arrays.deepToString(resulsetArray1));
	}
	
	public void multiplication(int[][] array1,int[][] array2) {
		System.out.println("You have selected Multiplication");
		resulsetArray1 [0] [0] = (array1 [0][0] * array2 [0][0]) + (array1[0][1] * array2[1][0]);
		resulsetArray1 [1] [0] = (array1 [1][0] * array2 [0][0]) + (array1[1][1] * array2[1][0]);
		resulsetArray1 [0] [1] = (array1 [0][0] * array2 [0][1]) + (array1[0][1] * array2[1][1]);
		resulsetArray1 [1] [1] = (array1 [1][0] * array2 [0][1]) + (array1[1][1] * array2[1][1]);
		System.out.println(Arrays.deepToString(resulsetArray1));
	}
	
	

	public static void main(String[] args) {		
		
		Arraytester2 object1 = new Arraytester2();
		Arraytester2 object2 = new Arraytester2();
		Scanner in = new Scanner(System.in);
		String option;
		
		
		do {
			System.out.println(
					  "a. Enter Arreglo A\r\n"
					+ "b. Enter Arreglo B\r\n"
					+ "c. Display A + B\r\n"
					+ "d. Display A - B\r\n"
					+ "e. Display A * B\r\n"
					+ "f. Exit");
			option = in.nextLine();
			in.nextLine();
			in.close();
			
			switch (option) {
			case "a":
				object1.enterArray(object1.array1);
				break;
			case "b":
				object1.enterArray(object1.array2);
				break;
			case "c":
				object1.add(object1.array1, object1.array2);
				break;
			case "d":
				object1.substration(object1.array1, object1.array2);
				break;
			case "e":
				object1.multiplication(object1.array1, object2.array1);
				break;
			case "f":
				System.out.println("THX!!");
				break;
			default:
				System.out.println("Invalid symbol :( try again.");
				break;
			}
			
		} while (!option.equals("f"));
		
		
		

	}
}

