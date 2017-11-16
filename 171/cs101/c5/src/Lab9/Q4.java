package Lab9;

// Basit Qureshi Nov 16, 2017 7:50:43 AM

import java.util.Scanner;

 
public class Q4
{
    public static void main(String [] args)
    {
        
        Scanner In = new Scanner(System.in);
        System.out.println("Enter x and y");
        int x = In.nextInt();
        int y = In.nextInt();
        
        for(int j = 0; j < y; j++)
        {
            double sum = 0;
            for(int i = j + 1; i<=y; i++)
            {
                sum = sum + Math.pow(x, i);
            }
            System.out.println("F(a" + j + ") = "+sum);
        }
        
    }
}
