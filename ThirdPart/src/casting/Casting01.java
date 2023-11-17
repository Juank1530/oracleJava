package casting;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
    	//byte var1 = 128;
        //Observe NetBeans' complaint

        
        //Declare and initialize a short with a value of 128
    	short var2 = 128;
        //Create a print statement that casts this short to a byte
    	System.out.println(var2 + (short)128);

        
        
        //Declare and initialize a byte with a value of 127
    	byte var3 = 127;
    	
        //Add 1 to this variable and print it
    	var3 += 1;
    	System.out.println(var3);
    	//Add 1 to this variable again and print it again
    	var3 += 1;
    	System.out.println(var3);

        
        
        
    }    
}
