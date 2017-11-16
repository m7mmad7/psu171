package Lab9;

// Basit Qureshi Nov 16, 2017 7:50:43 AM

import java.util.Scanner;
import java.util.Random;
 
public class Q6 
{
    public static void main(String [] args)
    {
        Random R = new Random();
        Scanner In = new Scanner(System.in);
        int u_win=0;
        int c_win=0;
        
        do
        {
            System.out.print("scissor (0), rock (1), paper (2):");
            int user = In.nextInt();
            int comp = R.nextInt(3);
            
            //rock paper scissors rules here
        
        }while(Math.abs(u_win-c_win)<2);
        
        if(u_win > c_win)
            System.out.println("You win!");
        else
            System.out.println("Computer wins");
        
        
    }
}
