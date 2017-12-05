package Lab12;

// Basit Qureshi Dec 5, 2017 8:09:18 AM

import java.util.Arrays;
 
public class Q4 
{
    public static void main(String [] s)
    {
        int [] A = new int [100];

        for(int i=0;i<100;i++)
        {
            A[i]= (int)(Math.random()*100);
        }
        //use sort
        Arrays.sort(A);
        System.out.println("Smallest: " + A[0]);
        System.out.println("Largest: " + A[99]);
        
        int sum=0;
        
        for(int i = 0; i < 100; i++)
            sum += A[i];
        
        System.out.println("Average:" + (double)sum / 100);

    }
}
