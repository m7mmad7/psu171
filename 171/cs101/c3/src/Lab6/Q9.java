package Lab6;

// Basit Qureshi Oct 24, 2017 8:38:48 AM

import java.util.Random;
import java.util.Scanner;

 
public class Q9
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);

        System.out.println("Enter the exchange Rate from US Dollars to Saudi Riyals");
        double exchange = In.nextDouble();
        System.out.println("Enter 0 to convert USD to SAR. 1 to convert SAR to USD");
        int choice = In.nextInt();
        if(choice==0)
        {
            System.out.println("Enter the amount in USD ");
            double amount = In.nextDouble();
            double total = amount * exchange;
            System.out.println("$"+ amount + " is equal to " + total + " SAR");
        }
        else if(choice ==1)
        {
            System.out.println("Enter the amount in SAR ");
            double amount = In.nextDouble();
            double total = amount / exchange;
            System.out.println(amount + "SAR is equal to $" + total);
        }
        else
            System.out.println("Error");
    }
}
