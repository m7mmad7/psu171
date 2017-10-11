package Lab4;

// Basit Qureshi Oct 10, 2017 9:44:21 AM

import java.util.Scanner;

 
public class Q10
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner (System.in);
       
        System.out.println("Enter three points (x1, y1), (x2,y2) and (x3,y3)");

        double x1 = In.nextDouble();
        double y1 = In.nextDouble();

        double x2 = In.nextDouble();
        double y2 = In.nextDouble();

        double x3 = In.nextDouble();
        double y3 = In.nextDouble();
        
        double side1 = Math.pow((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1),0.5);
        
        double side2 = Math.pow((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2),0.5);
        
        double side3 = Math.pow((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1),0.5);
        
        double s = (side1 + side2 + side3) / 2;
        
        double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
        
        System.out.println("Area:" + area);
        
    }
}
