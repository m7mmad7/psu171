package Lab6;

// Basit Qureshi Oct 24, 2017 8:38:48 AM

import java.util.Scanner;

 
public class Q4
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        System.out.println("Enter (x,y) and r for circle1");
        double x1 = In.nextDouble();
        double y1 = In.nextDouble();        
        double r1 = In.nextDouble();        
        System.out.println("Enter (x,y) and r for circle2");
        double x2 = In.nextDouble();
        double y2 = In.nextDouble();        
        double r2 = In.nextDouble();         
        
        double distance = Math.pow((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1), 0.5);
        if(distance <= Math.abs(r1 - r2))
        {
            System.out.println("Circle 2 inside circle 1");
        }
        else if (distance <= r1 + r2)
        {
            System.out.println("Overlap");
        }
        else
        {
            System.out.println("Not overlapping");
        }
        
        
    }
}
