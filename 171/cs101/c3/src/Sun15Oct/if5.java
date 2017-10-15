package Sun15Oct;

// Basit Qureshi Oct 15, 2017 8:26:43 AM

import java.util.Scanner;

//3.5 Write an if statement that increases pay by 3% if score
//is greater than 90. 
public class if5
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
            System.out.println("New pay " + pay);
        }
        

        
    }
}










