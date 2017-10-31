package Lab7;

// Basit Qureshi Oct 31, 2017 8:11:03 AM
import java.util.*;
public class Q4
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        double x1,x2,y1,y2,r,d;
        r= 6371.01;
        
        System.out.println("Enter Latitude and Longitude of First city");
        x1 = In.nextDouble();
        y1 = In.nextDouble();
        
        System.out.println("Enter Latitude and Longitude of Second city");
        x2 = In.nextDouble();
        y2 = In.nextDouble();
        
        //convert from Degree to Radians
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);
        
        d = r * Math.acos(Math.sin(x1) * 
                Math.sin(x2) + Math.cos(x1) *
                        Math.cos(x2) *
                        Math.cos(y1-y2));
        System.out.println("Distance: "+d);
    }
}
