package inputs;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
    	String input = JOptionPane.showInputDialog("Please write something: ");
    	System.out.println(input);
        
        //Parse the input as an int.
    	int inputNew = Integer.parseInt(input);
        //Print its value +1
    	System.out.println(inputNew++);
    	
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
    	int num1 = Integer.parseInt(JOptionPane.showInputDialog("please enter a numeric value: ")) + 1;
    	System.out.println(num1);

        
    }
}
