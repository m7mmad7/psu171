package Lab12;

// Basit Qureshi Dec 5, 2017 8:09:18 AM

import java.util.Scanner;
 
public class Q9
{
    public static void main(String [] s)
    {
        //Take double values from user and store in array.
        Scanner In = new Scanner(System.in);
        System.out.println("Enter 10 double values ");
        
        double [] D = new double [10];
        
        for(int i=0;i<10;i++)
        {
            D[i] = In.nextDouble();
        }

        //find mean
        double mean = 0;
        double sum = 0;
        for(int i=0;i<D.length;i++)
            sum = sum + D[i];
        mean = sum / 10;
        
        //find std dev.
        
        //find the numerator
        double top=0;
        for(int i=0;i<D.length;i++)
        {
            top = top + (D[i] - mean) * (D[i] - mean);
        }
        
        double stdDev = Math.sqrt(top/ (10-1));
        System.out.println("Mean: " + mean);
        System.out.println("StdDev: " + stdDev);
    }
}
