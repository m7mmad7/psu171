package Sun5Nov;

// Basit Qureshi Nov 5, 2017 7:56:35 AM

import java.util.Scanner;

 
public class while3
{
    public static void main(String [] args)
    {
        int computer = (int) (Math.random() * 100);
        System.out.println("Guess a number between 0 and 100");
        
        Scanner In = new Scanner(System.in);
        int count = 0;
        
        while(count < 10)
        {
            int guess = In.nextInt();

            if(guess == computer)
            {
                System.out.println("You win in " + (count + 1) + " ");
                return;
            }
            else
            {
                if(guess > computer)
                    System.out.println("Select a smaller value");
                else
                    System.out.println("Select a larger value");
            }
            
            count++;
        }
        System.out.println("");
        
    }
}
