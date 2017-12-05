package Lab12;

// Basit Qureshi Dec 5, 2017 8:09:18 AM

import java.util.Arrays;
import java.util.Scanner;

 
public class Q3arrays 
{
    public static void main(String [] s)
    {
        int [] A = new int [10];

        for(int i=0;i<100;i++)
        {
            int x = (int) (Math.random()*10);
            A[x]++;
        }
        
        for(int i=0;i<10;i++)
            System.out.println(i + " :" + A[i]);

        
        
    }
}
