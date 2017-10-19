package Lab5;

// Basit Qureshi Oct 19, 2017 8:18:10 AM

import java.util.Scanner;

 
public class Q2 
{
    public static void main(String [] s)
    {
        int a, b, c;
        Scanner In = new Scanner (System.in);
        a = In.nextInt();
        b = In.nextInt();
        c = In.nextInt();
        
        // which one is the smallest
        if(a < b && a < c)
        {
            // a is the smallest
            System.out.print(a + " ");
            if(b < c)
            {
                // b is second; c is third
                System.out.println(b + " " + c);
            }
            else
            {
                // c is second; b is third
                System.out.println(c + " " + b);
            }
        }
        else if(b < a && b < c)
        {
            // b is the smallest
            if(a < c)
                System.out.println(b + " " + a + " " + c);
            else
                System.out.println(b + " " + c + " " + a);
        }
        else if(c < a && c < b)
        {
            //c is the smallest
            if(a > b)
                System.out.println(c + " " + b + " " + a);
            else
                System.out.println(c + " " + a + " " + c);
        }
        
        
        
        
    }
}
