package Lab13;

// Basit Qureshi Dec 12, 2017 8:03:53 AM

import java.util.Scanner;

 
public class Q1 
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        int [] A = new int [5];
        
        System.out.println("Enter 5 numbers");
        
        for(int i=0;i<5;i++)
        {
            A[i] = In.nextInt();
        }
        
        displayNumbers(A);
    }
    
    public static void displayNumbers(int [] A)
    {
        for(int e: A)
            System.out.println(e);
    }
}
