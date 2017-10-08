package Sun8Oct;

// Basit Qureshi Oct 8, 2017 7:54:25 AM

import java.util.Scanner;

//Topics for today
//Operators + assignments
//inrement / decrement
//power
//type conversion
//printf

 
public class Casting1 
{
    public static void main(String [] s)
    {
        long a = (long) 10.0009;
        
        System.out.println(a);
        
        
        char c = 'a';
        
        System.out.println(c);
        
        int code = 'a';
        
        System.out.println(code);
        
        char c1 = 1255;   //SPECIAL CASE
        System.out.println(c1);
        
        System.out.println("---------------");
        
        /*
        for(int i=0; i< 10000; i++)
        {
            System.out.println(i +" will be " + (char) i);
        }
        
        
        Scanner In = new Scanner(System.in);
        String line = In.next();
        
        
        System.out.println(line);
        line = In.next();
        System.out.println(line);
        
        In.nextLine();
        */
        
        
        
    }
}
