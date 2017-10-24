package Lab6;

// Basit Qureshi Oct 24, 2017 8:22:52 AM

import java.util.Random;
import java.util.Scanner;

 
public class Q2 
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        Random R = new Random();
        
        int a = R.nextInt(100);
        int b = R.nextInt(100);
        System.out.println(a + " + " + b + " = ?");
        int c = In.nextInt();
        if(a+b == c)
        {
            System.out.println("Correct!");
        }
        else
        {   
            System.out.println("Wrong!");
        }
    }
}
