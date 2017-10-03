package Tue3Oct;

// Basit Qureshi Oct 3, 2017 9:07:11 AM

import java.util.Scanner;

 
public class FtoC 
{
    public static void main(String [] args)
    {
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Please type temprature in F!");
        double tempF;
        //tempF = Input.nextDouble();
        tempF = Input.nextInt();
        double tempC;
        tempC = 5.0 / 9 * (tempF - 32);
        
        System.out.println("Celcius value for temprature"
                + " you entered " + tempF + " is " + tempC);
        
        
    }
}
