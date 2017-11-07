package Tue7Nov;

// Basit Qureshi Nov 7, 2017 8:07:29 AM

import java.util.Scanner;

 
public class dowhile1 
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        
        int count = 1;
        System.out.println("Enter count ");
        int x = In.nextInt();
        
        do
        {
            System.out.println(count);
            count++;
        }while(count <= x);
        
        
        
        
    }
}
