package Lab8;

// Basit Qureshi Nov 7, 2017 8:38:59 AM

import java.util.Scanner;

 
public class Q2 
{
    public static void main(String [] args)
    {
        int kilo = 1;
        System.out.println("Kilograms   Pounds");
        while(kilo < 200)
        {
            System.out.printf("%d\t%10.2f\n", kilo, kilo * 2.2);
            kilo += 2;
        }
        
    }
}
