package casting;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "150";
        String taxRate = "0.05";
        String gibberish = "fdfvccv5464vx64sf"; 
        
        //Parse shirtPrice and taxRate, and print the total tax
        double shirtPriceDouble = Double.parseDouble(shirtPrice);
        double taxRateDouble = Double.parseDouble(taxRate);
        double totalTax = shirtPriceDouble * taxRateDouble;
        System.out.println(totalTax);
        
        //Try to parse taxRate as an int. Here there's a error for type of data
        int taxRateInt = Integer.parseInt(taxRate);
        System.out.println(taxRateInt);
        //Try to parse gibberish as an int. Here there's a error for type of data
        int gibberishIt = Integer.parseInt(gibberish);
        System.out.println(gibberishIt);
        
    }
    
}
