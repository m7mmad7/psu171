package Lab13;

// Basit Qureshi Dec 12, 2017 8:03:53 AM

import java.util.Scanner;

 
public class Q2 
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
        
        for (int i=0;i<5;i++)
        {
            displayNumbers(A);
            shiftLeft(A);
        }
    }
    
    public static void displayNumbers(int [] A)
    {
        for(int e: A)
            System.out.print(e + " ");
        
        System.out.println();
    }
    
    public static void shiftLeft(int [] A)
    {
        int temp = A[0];
        
        for(int i = 0; i < A.length -1; i++)
        {
            A[i] = A[i + 1];
        }
        
        A[A.length-1] = temp;
    }
}
