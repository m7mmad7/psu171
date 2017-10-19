package Lab5;

// Basit Qureshi Oct 19, 2017 8:18:10 AM

import java.util.Scanner;

 
public class Q5
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner (System.in);
        System.out.println("Enter weight ");
        double num = In.nextDouble();
    
        if(num > 0 && num <= 1)
            System.out.println("You need to pay: " + 3.5);
        else if(num > 1 && num <= 3)
            System.out.println("You need to pay: " + 5.5);
        else if(num > 3 && num <= 10)
            System.out.println("You need to pay: " + 8.5);
        else if(num > 10 && num <= 20)
            System.out.println("You need to pay: " + 10.5);
        else
            System.out.println("The package cannot be shipped");
    }
}
