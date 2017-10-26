package Thur26Oct;

// Basit Qureshi Oct 26, 2017 8:18:17 AM

import java.util.Scanner;

 
public class StopWatch 
{
    public static void main(String [] args)
    {
        long start = System.currentTimeMillis();
        
        System.out.println((int)(Math.random() * 1000));
        
        System.out.println("Enter a value!");
        Scanner In = new Scanner (System.in);
        In.nextInt();
        
        
        long finish = System.currentTimeMillis();
        
        System.out.println("Time taken: " + (finish - start) + 
                "milli seconds");
        
    }
}
