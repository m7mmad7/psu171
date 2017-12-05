package Lab12;

// Basit Qureshi Dec 5, 2017 8:09:18 AM

import java.util.Scanner;

 
public class Q1 
{
    public static void main(String [] s)
    {
        System.out.println("Enter 5 numbers");
        
        Scanner In = new Scanner(System.in);
        
        int [] Arr = new int [5];
        
        for(int i=0;i<5;i++)
        {
            Arr[i] = In.nextInt();
        }
        
        // now to display in reverse order
        for(int i = Arr.length-1; i >= 0; i--)
            System.out.println(Arr[i]);
        
        
    }
}
