package Sun8Oct;

// Basit Qureshi Oct 8, 2017 7:54:25 AM

import java.util.Scanner;

//Topics for today
//Operators + assignments
//inrement / decrement
//power
//type conversion
//printf

 
public class Increment2 
{
    public static void main(String [] s)
    {
        int i = 0;
        
        System.out.println(++i + i++); // prints 2
        // here i is 3
        System.out.println(i);
        
        //i was 2
        i = 2;
        System.out.println(i-- + --i); // 2 + 0 ->2
        
        System.out.println(i);
        
        i = 2;
        System.out.println( --i + i--); // 1 + 1 -> 2
        //i is 0
        System.out.println(i);
        
        //ERRORS
        //something that makes your program crash /// or unstable
        
        // Syntax Errors: --> shown by RED lines
        
        
        // Logical Errors: --> hard to catch!!
        
        
    }
}
