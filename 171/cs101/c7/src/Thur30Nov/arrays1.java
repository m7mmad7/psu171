package Thur30Nov;

// Basit Qureshi Nov 30, 2017 8:02:19 AM

import java.util.Scanner;

 
public class arrays1 
{
    public static void main(String [] str)
    {
        Scanner In = new Scanner (System.in);
        int i = 1;
        int sum = 0;
        do
        {
            System.out.println("Enter value: " + i);
            int x = In.nextInt();
            sum = sum + x;
            i++;
        }while(i<=5);
    
        System.out.println("sum = " + sum);
    
    }
}
