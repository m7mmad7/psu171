package Sun15Oct;

// Basit Qureshi Oct 15, 2017 8:26:43 AM

import java.util.Scanner;

 
public class if2 
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        
        System.out.println("Enter 0 if you like this program. 1 otherwise!");
        int input = In.nextInt();
        
        if(input == 0)
        {
            System.out.println("Welcome");
        }
        
        System.out.println("Bye bye!");
        
    }
}
