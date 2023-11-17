package ShoppingCart;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 400;
        double tax = 0.20;
        int quantity = 2;
        double totalPrice = ((price*quantity) * tax) + (price*quantity);
        
        message = custName+" wants to purchase a " + quantity + " " + itemDesc;
        
        String totalMessage = "Total cost with tax is: " + totalPrice + " dollars.";
        
        System.out.println(message);
        System.out.println(totalMessage);
        
        System.out.println("The cat said \"Meow!\" to me.");
        
        
    }    
}
