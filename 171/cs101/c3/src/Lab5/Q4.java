package Lab5;

// Basit Qureshi Oct 19, 2017 8:18:10 AM

import java.util.Scanner;

 
public class Q4
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner (System.in);
        System.out.println("Enter a three digit integer");
        int num = In.nextInt();
    
        if(num > 999 || num < 100)
        {
            System.out.println("Error: Number is not 3 digits long");
            return;
        }
        
        // num is a 3 digit number;
        int first, last;
        //123
        //lets say 1 is the first digit and 3 is the last
        first = num / 100;
        last = num % 10;
        if(first == last)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    
    
    }
}
