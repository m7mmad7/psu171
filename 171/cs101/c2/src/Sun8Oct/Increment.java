package Sun8Oct;

// Basit Qureshi Oct 8, 2017 7:54:25 AM

import java.util.Scanner;

//Topics for today
//Operators + assignments
//inrement / decrement
//power
//type conversion
//printf

 
public class Increment 
{
    public static void main(String [] s)
    {
        int a = 1;
        a = a + 1;
        a += 1;
        
        a++; // add one in a
        //a uniary operator
        //adds only 1
        //works with integers
        double d = 1.0;
        d++;
        
        //subtraction
        a--;
        a = a - 1;
        a -= 1;
        
        
        ++a;
        --a;
        
        //so whats the difference???
        
        a = 1;
        System.out.println(a);//prints 1
        
        a++;// process and then add
        System.out.println(a);//prints 2
        
        ++a;// add and then process
        System.out.println(a);//prints 3
        
        //example... 
        //here a is 3
        System.out.println(a++);// print 3 or 4??
        
        //what is in a?  a is 4
        System.out.println(a);
        
        //a is 4
        System.out.println(++a);//add and then print(process)
        //prints 5
        
        
        
        //works with --
        //a now is 5
        System.out.println(a--);//prints 5
        //but here a is 4
        
        System.out.println(a); // prints 4
        
        System.out.println(--a);//prints 3
        
        
    }
}
