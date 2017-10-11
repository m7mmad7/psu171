package Lab4;

// Basit Qureshi Oct 10, 2017 9:44:21 AM

import java.util.Scanner;

 
public class Q5 
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner (System.in);
        double speed, acceleration;
        System.out.println("Enter Speed and acceleration");
        speed= In.nextDouble();
        acceleration= In.nextDouble();

        double length = (speed * speed) / (2 * acceleration);
        System.out.printf("Length = %10.3f" , length);
    }
}
