package Lab4;

// Basit Qureshi Oct 10, 2017 9:37:07 AM

import java.util.Scanner;

 
public class Q3 
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner(System.in);
        
        System.out.println("Enter Population?");
        double pop = In.nextInt();
        
        System.out.println("Enter growth rate?");
        double rate = In.nextInt();
        
        pop = pop + pop * (rate /100);
        int i=1;
        System.out.println("year " + i + " = " + (int)pop);
        
        pop = pop + pop * (rate /100);
        i++;
        System.out.println("year " + i + " = " + (int)pop);

        pop = pop + pop * (rate /100);
        i++;
        System.out.println("year " + i + " = " + (int)pop);
    }
}
