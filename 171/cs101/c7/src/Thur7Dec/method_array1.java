package Thur7Dec;

// Basit Qureshi Dec 7, 2017 7:53:37 AM

import java.util.Scanner;

 
public class method_array1 
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        //make an arary
        
        int [] A = new int [5];
        
        //Enter 5 numbers
        System.out.println("Please Enter 5 numbers");
        for(int i=0;i<5;i++)
        {
            A[i]= In.nextInt();
        }
        
        //Add all values
        
        int sum=0;
        for(int i=0;i<5;i++)
            sum += A[i];
        
        //find the average
        
        double average = (double)sum / 5;
        
        //print all values
        for(int i=0;i<5;i++)
            System.out.print(A[i]+" ");
      
        //print average
        System.out.println();
        System.out.println(average);
        
        //print in reverse order
        for(int i=A.length-1; i>=0; i--)
            System.out.print(A[i] + " ");
    }
}
