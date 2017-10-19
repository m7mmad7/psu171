package Lab5;

// Basit Qureshi Oct 19, 2017 8:18:10 AM

import java.util.Scanner;

 
public class Q6
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner (System.in);
        System.out.println("Enter sides a b and c ");
        int a = In.nextInt();
        int b = In.nextInt();
        int c = In.nextInt();
    
        boolean valid = (a+b)>c && (b+c)> a && (a+c)>b;
        if(valid)
            System.out.println("Valid");
        else
            System.out.println("invalid");
    }
}
