package Lab12;

// Basit Qureshi Dec 5, 2017 8:09:18 AM

import java.util.Random;
 
public class Q5 
{
    public static void main(String [] s)
    {
        Random R = new Random();
        int [] A = new int [100];
        
        //step1: fill the array with random numbers
        for(int i=0;i<100;i++)
        {
            A[i]= -99 + R.nextInt(199);
        }
        
        //step2: find the sum and display average
        int sum=0;
        double average=0;
        for(int i=0;i<100;i++)
            sum+=A[i];
        
        average = (double)sum / 100;
        System.out.println("Average: " +average);
        
        //step3: find the counter values
        int positive=0, negative=0,aboveAvg=0,belowAvg=0;
        for(int i=0;i<100;i++)
        {
            if(A[i]>=0)
                positive++;
            else
                negative++;
            
            if(A[i]>average)
                aboveAvg++;
            else
                belowAvg++;
        }
        System.out.println("Above Average: " + aboveAvg);
        System.out.println("Below Average: " + belowAvg);
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        
        
        
    }
}
