package Lab12;

// Basit Qureshi Dec 5, 2017 8:09:18 AM

import java.util.Arrays;
import java.util.Scanner;

 
public class Q2better 
{
    public static void main(String [] s)
    {
        System.out.println("Enter scores for 4 students out of 100");
        
        Scanner In = new Scanner(System.in);
        
        double [] scores = new double [4];
        
        for(int i = 0; i < 4; i++)
        {
            scores[i] = In.nextDouble();
        }
        
        Arrays.sort(scores); //sorts the array in ascending order
        
        System.out.println("Best: "+scores[3]);
        System.out.println("2nd Best: "+scores[2]);
        System.out.println("3rd Best: "+scores[1]);
        System.out.println("Worst: "+scores[0]);
        
    }
}
