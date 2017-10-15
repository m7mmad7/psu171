package Sun15Oct;

// Basit Qureshi Oct 15, 2017 8:26:43 AM

import java.util.Scanner;

 
public class if4
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        
        System.out.println("Type value of X");
        int input = In.nextInt();
        
        if(input < 5)
        {
            System.out.println(input + " is less than 5");
        }
        
        if(input >= 5)
        {
            System.out.println(input + " is bigger than or equal to 5");
        }
        
        int x, y;
        y = In.nextInt();
        if (y > 0)
        {
            x = 1;
        }

        
    }
}










