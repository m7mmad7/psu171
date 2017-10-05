package Lab3;

// Basit Qureshi Oct 5, 2017 8:46:41 AM

import java.util.Scanner;

 
public class FeetToMeters 
{
    public static void main(String [] args)
    {
        Scanner Input = new Scanner(System.in);
        
        //one foot = 0.305 meters
        System.out.println("Please type feet?");
        double feet = Input.nextDouble();
        double meters = feet * 0.305;
        
        System.out.println(feet + " feet is " + meters +" meters.");
        
    }
}
