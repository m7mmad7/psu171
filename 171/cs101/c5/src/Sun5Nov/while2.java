package Sun5Nov;

// Basit Qureshi Nov 5, 2017 7:56:35 AM

import java.util.Scanner;

 
public class while2 
{
    public static void main(String [] args)
    {
        int computer = (int) (Math.random() * 10);
        System.out.println("Guess a number between 0 and 10");
        
        Scanner In = new Scanner(System.in);
        int count = 0;
        
        while(count < 3)
        {
            int guess = In.nextInt();

            if(computer == guess)
            {
                System.out.println("You win");
                return;
            }
            else if(count==2)
                System.out.println("You loser!");
            else
                System.out.println("Wrong! Try again...");
            
            count++;
        }
        //System.out.println("");
        
    }
}
