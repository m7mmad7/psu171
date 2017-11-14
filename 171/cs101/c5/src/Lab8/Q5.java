package Lab8;

// Basit Qureshi Nov 7, 2017 8:38:59 AM

import java.util.Scanner;

 
public class Q5
{
    public static void main(String [] args)
    {
        int N = 0;
        
        for(int i = 100; i <= 1000; i++)
        {
            if(i % 5==0 &&  i % 6==0)
            {
                System.out.printf("%5.0f",(double)i);
                N++;
            }
            
            if(N==10)
            {
                System.out.println();
                N=0;
            }
            
        }
    }
}
