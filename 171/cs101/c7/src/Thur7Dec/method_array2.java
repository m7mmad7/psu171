package Thur7Dec;

// Basit Qureshi Dec 7, 2017 7:53:37 AM

import java.util.Scanner;

 
public class method_array2 
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        //make an array
        int [] A = Input(In);
        
        printAll(A);
        System.out.println();
        System.out.println("Sum is: " + sum(A));
        System.out.println("Average is: "+ average(A));
        
        printReverse(A);
        
    }
    
    
    public static int [] Input(Scanner Shasha)
    {
        int [] Z = new int [5];
        
        //Enter 5 numbers
        System.out.println("Please Enter 5 numbers");
        for(int i=0;i<Z.length;i++)
        {
            Z[i]= Shasha.nextInt();
        }
        return Z;
    }
    
    public static double average(int [] Key1)
    {
        int arraySum = sum(Key1);

        double average = (double)arraySum / 5;
        return average;
    }
    
    public static int sum(int [] C)
    {
        int sum=0;
        for(int i=0;i<C.length;i++)
            sum += C[i];
        
        return sum;
    }
    
    public static void printAll(int [] B)
    {
        //print all values
        for(int i=0;i<B.length;i++)
            System.out.print(B[i]+" ");
    }
    
    public static void printReverse(int [] Arr)
    {
        //print in reverse order
        for(int i=Arr.length-1; i>=0; i--)
            System.out.print(Arr[i] + " ");
    }
    
    
}
