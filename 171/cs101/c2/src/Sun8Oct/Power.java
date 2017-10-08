package Sun8Oct;

// Basit Qureshi Oct 8, 2017 7:54:25 AM

import java.util.Scanner;

//Topics for today
//Operators + assignments
//inrement / decrement
//power
//type conversion
//printf

 
public class Power 
{
    public static void main(String [] s)
    {
        //in java.. there is no operator for power ;-(
        // 2 ^ 3 means 2 power 3 (in BASIC)
        
        Math.pow(2, 3); // means 2 ^ 3     two power 3
        //always gives result in double
        
        double num = Math.pow(2, 3);
        System.out.println(num);
        
        num = Math.pow(-1, 2);
        System.out.println(num);
        
        num = Math.pow(10, -2);
        System.out.println(num);
        
        
        
        
        
    }
}
