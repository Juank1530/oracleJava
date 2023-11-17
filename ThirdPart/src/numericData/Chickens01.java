package	numericData;

public class Chickens01 {
    public static void main(String[] args) {
        int eggsPerChicken = 5;
        int chickenCount = 3;
        
        int totalEggs = eggsPerChicken*chickenCount;
        chickenCount = chickenCount+1;
        totalEggs = totalEggs +(eggsPerChicken*chickenCount);
        chickenCount = chickenCount/2;
        totalEggs = totalEggs +(eggsPerChicken*chickenCount);
        System.out.println(totalEggs);
        
        eggsPerChicken = 4;
        chickenCount = 8;
   
        totalEggs = eggsPerChicken*chickenCount;
        chickenCount = chickenCount+1;
        totalEggs = totalEggs +(eggsPerChicken*chickenCount);
        chickenCount = chickenCount/2;
        totalEggs = totalEggs +(eggsPerChicken*chickenCount);
        System.out.println(totalEggs);
        
        final double PI = 3.141592;
        
        System.out.println(PI);
        
        
    }   
}
