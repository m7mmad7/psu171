package Sun5Nov;

// Basit Qureshi Nov 5, 2017 7:56:35 AM

import java.util.Scanner;

 
public class while5
{
    public static void main(String [] args)
    {
        
        Scanner In = new Scanner(System.in);
        System.out.println("Enter an integer");
        
        int n = In.nextInt();
        n = Math.abs(n);
        
        
        int fac = 1;
        //1 * 2 * 3 * 4 ..... 10   -> factorial of 10
        //factorial of 4 is 1 * 2 * 3 * 4
        //factorial of 7 is 1 * 2 * 3 * 4 * 5 * 6 * 7
        
        
        int count = 1;
        
        while(count <= n)
        {
            
            fac = fac * count;   //10
            count++;  //4
        }
        System.out.println(fac);
        
        
        
    }
}
