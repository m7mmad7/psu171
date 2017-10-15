package Sun15Oct;

// Basit Qureshi Oct 15, 2017 8:26:43 AM

import java.util.Scanner;

public class ifelse1
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        double pay = 10000;
        double score = 0;
        System.out.println("Type value of score");
        score = In.nextDouble();
        
        if(score > 90)
        {
            pay = pay + 0.03 * pay;
            System.out.println("Congrats! Your new pay " + pay);
        }
        else
        {
            System.out.println("No Pay increase for you :-(");
        }
        
        System.out.println("End of program");

        if(score > 90)
            System.out.println("Hello");
        else
            System.out.println("Give back my hello!");
        
        
        
        
    }
}










