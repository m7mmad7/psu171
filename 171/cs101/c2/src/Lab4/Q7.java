package Lab4;

// Basit Qureshi Oct 10, 2017 9:44:21 AM

import java.util.Scanner;

 
public class Q7
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner (System.in);
        double investment, interest, years;
       
        System.out.println("Enter investment amount:");
        investment= In.nextDouble();
        
        System.out.println("Enter annual interest rate in percentage:");
        interest= In.nextDouble();
        
        interest = interest / 100;
        
        System.out.println("Enter number of years:");
        years= In.nextDouble();
        
        
        double value= investment * Math.pow((1 + interest),(years * 12));

        System.out.printf("Accumulated value is $%8.2f" , value);
    }
}
