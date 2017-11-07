package Tue7Nov;

// Basit Qureshi Nov 7, 2017 8:07:29 AM

import java.util.Scanner;

 
public class while9 
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        
        int count = 1;
        System.out.println("Enter count ");
        int x = In.nextInt();
        
        while(count <= x)
        {
            System.out.println(count);
            count++;
        }
        
        
        
        
    }
}
