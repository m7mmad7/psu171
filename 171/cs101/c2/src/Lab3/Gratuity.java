package Lab3;

// Basit Qureshi Oct 5, 2017 8:54:20 AM

import java.util.Scanner;

 
public class Gratuity 
{
    public static void main(String [] args)
    {
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Please type Total value");
        double total = Input.nextDouble();
        
        System.out.println("Please type rate");
        double rate = Input.nextDouble();
        
        double gratuity = total * (rate / 100);
        //total = 10
        //rate = 15
        //gratuity = 10 * (15 / 100)
        //           10 * (0.15)
        //           1.5
        
        //gratuity = 10 * 15 / 100
        //           150 / 100
        //           1.5
           
        double new_total = total + gratuity;
        
        System.out.println("Gratuity = " + gratuity);
        System.out.println("New Total = " + new_total);
        
    }

}
