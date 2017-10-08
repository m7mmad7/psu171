package Sun8Oct;

// Basit Qureshi Oct 8, 2017 7:54:25 AM

import java.util.Scanner;

//Topics for today
//Operators + assignments
//inrement / decrement
//power
//type conversion
//printf

 
public class Casting 
{
    public static void main(String [] s)
    {
        double num = Math.pow(10, 2);
        System.out.println(num);
        
        num = 100; // 100 is integer!!!.. This copy 100 (integer) into num
                   // which is a double!!
                   
        num = 100.0; //double to double
        
        int n = 10; //int to int
        
        //n = 10.0; //PROBLEM!!!!... cannot put dobule in int
        
        // TYPE CASTING
        
        int a = (int) 10.0;
        
        System.out.println(a);
        
        a = (int) 10.3;
        System.out.println(a);
        
        a = (int) 10.99999;
        System.out.println(a);
        
        //a = (int) 10.1 + 10.9;
        
        a = (int) 10.1 + (int) 10.9; // 20
        
        a = (int)(10.1 + 10.9); //21
        
        
    }
}
