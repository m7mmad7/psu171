package Tue14Nov;

// Basit Qureshi Nov 14, 2017 8:02:20 AM

import java.util.Scanner;

 
public class Nested5
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        
        do
        {
            System.out.print("Type a integer value. -1 to quit..");
            int n = In.nextInt();
            if(n==-1)
                break;
            
            int j = 1;
            do
            {
                System.out.println(n + " * " + j + " = " + (n * j));
                j++;
            }while(j <= 10);
            
            
            System.out.println();
           
        
        }while(true);//do
        System.out.println("Thank you");
        
    }//main
}//class
