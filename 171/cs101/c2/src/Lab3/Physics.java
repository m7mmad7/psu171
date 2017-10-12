package Lab3;

// Basit Qureshi Oct 5, 2017 9:16:40 AM

import java.util.Scanner;

 
public class Physics 
{
    public static void main(String [] args)
    {
        Scanner Input = new Scanner (System.in);
        
        System.out.println("Enter v0, v1, t: ");
        double v0, v1, t;
        v0 = Input.nextDouble();
        v1 = Input.nextDouble();
        t = Input.nextDouble();
        double a = (v1-v0) / t;
        System.out.println("a= " + a);
        System.out.printf("a=%10.4f",a);
        
        
    }
}
