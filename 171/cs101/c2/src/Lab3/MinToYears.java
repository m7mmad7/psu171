package Lab3;

// Basit Qureshi Oct 5, 2017 9:06:53 AM

import java.util.Scanner;

 
public class MinToYears 
{
    public static void main(String [] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Type minutes");
        long min = Input.nextLong();
        
        double hours = min / 60;
        double days = hours / 24;
        double years = days / 365;
        long y = (long) years;
        double remainder_days = days % 365;
        int r_days = (int) remainder_days;
        System.out.println("Years = " + y + " and " + r_days + 
                " days approx.");
        
        
    }
    
}
