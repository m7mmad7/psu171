package Sun22Oct;

// Basit Qureshi Oct 22, 2017 8:49:32 AM

import java.util.Scanner;

 
public class Random1 
{
    public static void main(String [] args)
    {
        System.out.println("!---------Guessing Game---------!");
        System.out.println("Computer versus You... Lets see who wins!");
        Scanner In = new Scanner(System.in);
        int Computer;
        int User;
        //System.out.println(Math.random());
        Computer = (int) (100 * Math.random());// gives a number between 0 and 1
        System.out.println(Computer);
        System.out.println("Enter a number between 0 and 9");
        User = In.nextInt();
        
        if(Computer == User)
        {
            System.out.println("You win!");
            return;
        }
        else
        {
            System.out.println("Loser!!!!");
            System.out.println("I guessed. " + Computer);
        }
        
    
    
    
    }
}
