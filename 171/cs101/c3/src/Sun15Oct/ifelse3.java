package Sun15Oct;

// Basit Qureshi Oct 15, 2017 8:26:43 AM

import java.util.Scanner;

public class ifelse3
{
    public static void main(String [] args)
    {
        int i = 10;
        int j = 2;
        int k = 11;
        // NESTED IF
        if(i > j)
        {
            if(i > k)
                System.out.println("i > j AND i > k");
            else
                System.out.println("i > j BUT i < k");
        }
        else
        {
            if(j > k )
                System.out.println("j >= i AND j > k");
            else
                System.out.println("j >= i BUT j <= k ");
            
        }
        
        
        
        
    }
}










