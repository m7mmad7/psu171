package Lab5;

// Basit Qureshi Oct 19, 2017 8:18:10 AM

import java.util.Scanner;

 
public class Q3
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner (System.in);
        System.out.println("Enter Integer");
        int num = In.nextInt();
        boolean first = (num % 5 == 0) && (num % 6 == 0);

        boolean second = (num % 5 == 0) || (num % 6 == 0);
        
        boolean third = (num % 5 == 0) ^ (num % 6 == 0);
       
        if(first == true)
            System.out.println(num + " is divisible by 5 AND 6 ");
        
        if (second)
            System.out.println(num + " is divisible by 5 OR 6 ");

        if (third)
            System.out.println(num + " is divisible by 5 OR 6 but not both! ");
    }
}
