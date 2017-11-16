package Lab9;

// Basit Qureshi Nov 16, 2017 7:50:43 AM

import java.util.Scanner;

 
public class Q5
{
    public static void main(String [] args)
    {
        
       //finding factors
        

        for(int n = 1 ; n<=1000000 ; n++)
        {
            int sumOfFactors = 0;

            for(int i=1; i<n ;i++) 
            {
                if(n % i == 0)
                    sumOfFactors = sumOfFactors + i;
            }
            if(n == sumOfFactors)
                 System.out.println("Perfect number " +n);

        }
       
    }
}
