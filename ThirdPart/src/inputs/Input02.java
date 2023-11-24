package inputs;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "I'm here just to show you a message!!",
                "I'm just a Message Box",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Here you can enter differents kind of values",
                "I'm an input Box",
                3,
                null,
                null,
                "Type something here.");
        
        
        String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3","Last Option"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "What option do you want to chose?",
                "I'm a Question Box",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
