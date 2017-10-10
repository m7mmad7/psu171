package Lab4;

// Basit Qureshi Oct 10, 2017 9:44:21 AM

import java.util.Scanner;

 
public class Q6 
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner (System.in);
        double x1, x2, y1, y2;
        System.out.println("Type two points (x1, y1) and (x2, y2)");
        x1= In.nextDouble();
        y1= In.nextDouble();
        x2= In.nextDouble();
        y2= In.nextDouble();
        
        double first = (x2-x1)*(x2-x1);
        double second = (y2-y1)*(y2-y1);
        double distance = Math.pow(first + second, 0.5);
        System.out.printf("Distance = %10.3f" , distance);
    }
}
