package Lab3;

// Basit Qureshi Oct 5, 2017 8:38:05 AM

import java.util.Scanner;

 
public class CToF 
{
    public static void main(String [] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Please type Celcius temprature");
        double celcius = Input.nextDouble();
        
        double fah = 9.0 / 5.0 * celcius + 32;
        System.out.println(celcius + " C = " + fah + " F.");
    }
}
