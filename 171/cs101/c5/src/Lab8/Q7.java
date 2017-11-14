package Lab8;

// Basit Qureshi Nov 7, 2017 8:38:59 AM

import java.util.Scanner;

 
public class Q7
{
    public static void main(String [] args)
    {
        int chars = 0;
        for(char c = '!'; c <= '~' ; c++)
        {
            System.out.print(c + " ");
            chars ++;
            
            if(chars == 10)
            {
                chars=0;
                System.out.println();
            }
            
        }
    }
}
