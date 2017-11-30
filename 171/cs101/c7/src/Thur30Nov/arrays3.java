package Thur30Nov;

// Basit Qureshi Nov 30, 2017 8:02:19 AM

import java.util.Scanner;

 
public class arrays3 
{
    public static void main(String [] str)
    {
        Scanner In = new Scanner (System.in);
        
        int [] array= new int [5];
        
        int i = 0;
        int sum = 0;
        do
        {
            System.out.println("Enter value: " + i);
            array[i] = In.nextInt();
            sum = sum + array[i];
            i++;
        }while(i<5);
    
        for(int j=0; j < 5; j++)
        {
            System.out.println(array[j]);
        }
        
        
        System.out.println("sum = " + sum);
    
    }
}
