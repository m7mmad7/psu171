package Lab5;

// Basit Qureshi Oct 19, 2017 8:18:10 AM

import java.util.Scanner;

 
public class Q7
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner (System.in);
        System.out.println("Enter weight and price for package 1 ");
        int w1 = In.nextInt();
        double p1 = In.nextDouble();
       
        System.out.println("Enter weight and price for package 2 ");
        int w2 = In.nextInt();
        double p2 = In.nextDouble();    
    
        double perkilo1 = w1 / p1;
        double perkilo2 = w2 / p2;
        
        if(perkilo1 < perkilo2)
            System.out.println("Buy package 1");
        else if(perkilo1 > perkilo2)
            System.out.println("Buy package 2");
        else
            System.out.println("They are the same");
    }
}
