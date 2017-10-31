package Lab7;

// Basit Qureshi Oct 31, 2017 8:11:03 AM
import java.util.*;
public class Q3
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        double area, r, s;
        System.out.println("Enter radius (r) ");
        r = In.nextDouble();
        
        s = 2 * r * Math.sin(Math.PI/5);
        area = (5 * s * s)/(4 * Math.tan(Math.PI/5));
        
        System.out.printf("Area is %10.3f", area);
        
        
    }
}
