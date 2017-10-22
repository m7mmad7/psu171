package Sun22Oct;

// Basit Qureshi Oct 22, 2017 8:49:32 AM

import java.util.Scanner;

 
public class Random2 
{
    public static void main(String [] args)
    {
        //any random number between 0 and 1
        double r1 = Math.random();
        
        //number between 0 and 10
        double r2 = Math.random() * 10;
        
        //number between 0 and 100
        double r3 = Math.random() * 100;
        
        //number from 5 to 15
        double r4 = 5 + Math.random() * 10;
        
        //number between -5 and 5
        double r5 = -5 + Math.random() * 10;
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
    
    
    
    }
}
