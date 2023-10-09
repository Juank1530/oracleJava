
public class tryCacht {

	public static void main(String[] args) {
		String str = "Hello World";
			
		for(int i = 0; i < 4; i++)
			{
				System.out.println(str);
				str+= "!";
			}
		
		int array [][] = {{3,2,1,},{1,1,1}};
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if(array[i][j] == 1 && j == 2)
					System.out.println(array[i][j]);
				
			}
			
		}
			
		try {
		    String nombre = null;
		    int longitud = nombre.length();
		    System.out.println(longitud);
		} catch (NullPointerException e) {
		    System.err.println("Se produjo una NullPointerException.");
		    e.printStackTrace();
		}


	}

}
