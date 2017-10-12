package Quiz1;

// Basit Qureshi Oct 12, 2017 11:39:46 AM

import java.util.Scanner;

 
public class Quiz1PartB 
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner (System.in);
        int sum = 0;
        System.out.print("Enter the tickets for month 1: ");
        int m1 = In.nextInt();

        System.out.print("Enter the tickets for month 2: ");
        int m2 = In.nextInt();

        System.out.print("Enter the tickets for month 3: ");
        int m3 = In.nextInt();   
        
        sum = m1 + m2 + m3;
        
        double total = sum * 299.50;
        
        System.out.printf("\nFor the last 3 months total to pay:%8.2f", total); 
        System.out.printf(" Saudi Riyals. You pay %d SR",  (int) total);
        
    }
}
