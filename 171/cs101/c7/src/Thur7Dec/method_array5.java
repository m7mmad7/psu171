package Thur7Dec;

// Basit Qureshi Dec 7, 2017 7:53:37 AM

import java.util.Scanner;

 
public class method_array5 
{
    public static void main(String [] args)
    {
        
        
        System.out.println(average(1,2,3,4,5,6,7,8,9,10));
        average(new double []{1,2,3});
    }
    
    public static double average(double... A)
    {
        if(A.length==0)
            return 0;
        double sum=0;
        for(int i=0;i<A.length;i++)
            sum = sum + A[i];
        
        return sum/A.length;
    }
    
    public static void dummy(int a,  double... D)
    {
        
    }
}
