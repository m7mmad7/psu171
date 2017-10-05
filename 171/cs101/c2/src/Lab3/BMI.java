package Lab3;

// Basit Qureshi Oct 5, 2017 8:18:44 AM

import java.util.Scanner;

 
public class BMI 
{
    public static void main(String [] args)
    {
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Please type weight in pounds?");
        double weight_pounds = Input.nextDouble();
        double weight_kilos = weight_pounds * 0.45359237;
        
        //do the same for height
        System.out.println("Please type height in inches?");
        double height_inches = Input.nextDouble();
        double height_meters = height_inches * 0.0254;
        //find BMI
        // BMI = w / (h * h)
        
        double bmi = weight_kilos / (height_meters * height_meters);
        
        System.out.println("BMI is " + bmi);
        
        
    }
}
