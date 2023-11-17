package	numericData;

public class Chickens02 {
    public static void main(String[] args) {
        
    	double day1 = 100;
    	double day2 = 121;
    	double day3 = 117;
    	double dailyAverage = (day1+day2+day3)/3; 
    	double monthlyAverage = dailyAverage*30;
    	double monthlyProfit = monthlyAverage*0.18;

        System.out.println("Daily Average:   " + dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
