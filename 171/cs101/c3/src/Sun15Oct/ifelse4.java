package Sun15Oct;

// Basit Qureshi Oct 15, 2017 8:26:43 AM

import java.util.Scanner;

public class ifelse4
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner (System.in);
        System.out.println("Please Enter your score ");
        double score = In.nextDouble();
        
        System.out.print("You earned the following grade! ");
        
        if(score >= 90)
            System.out.println("A");
        else
        {
            if(score >=80)
                System.out.println("B");
            else
            {
                if(score >= 70)
                    System.out.println("C");
                else
                {
                    if(score >=60)
                        System.out.println("D");
                    else
                    {
                        System.out.println("F");
                    }
                }
            }
        }
        
    }
}










