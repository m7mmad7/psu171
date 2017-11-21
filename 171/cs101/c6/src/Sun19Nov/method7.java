package Sun19Nov;

// Basit Qureshi Nov 19, 2017 8:02:58 AM

import java.util.Scanner;


 
public class method7
{
    public static void main(String [] args)
    {
        //pass a value as a parameter
        System.out.println(Factorial (5));
        
    }
    
    public static int Factorial(int N)
    {
        // 5! = 5 * 4 * 3 * 2 * 1;
        int f = 1;
        for(int i = 1; i<= N; i++)
        {
            f = f * i;
        }
        return f;
    }
    
    
    
}//end class
