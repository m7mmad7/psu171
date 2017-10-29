package Sun29Oct;

// Basit Qureshi Oct 29, 2017 7:57:33 AM

import java.util.Scanner;

 
public class Str5
{
    public static void main(String [] s)
    {
        String s1 = "Hello world";
        String s2 = "   !    Hello World    !    ";
        
        /*
        Hello world
        012345678910
        
        */
        System.out.println(s1.length());
        System.out.println(s2.length());
        
        System.out.println(s1.trim());
        System.out.println(s2.trim());// removes the spaces from sides
        
        System.out.println(s1.charAt(0)); // gives H
        System.out.println(s1.charAt(10));// gives d
        
        System.out.println(s1.charAt(11));//error
        
        
        
        
    }
}
