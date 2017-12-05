package Lab12;

// Basit Qureshi Dec 5, 2017 8:09:18 AM

import java.util.Scanner;

 
public class Q2 
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
        
        //find the best student!!
        //the best must have max score;
        //lets find the max value;
        
        double max = scores[0];
        int max_pos = 0;
        
        for(int i=1; i<scores.length;i++)
        {
            if(max < scores[i])
            {
                max = scores[i];
                max_pos = i;
            }
        }
        System.out.println("Best score: " + max);
        
        //now we find the worst
        double min = scores[0];
        int min_pos =0;
        
        for(int i=1; i<scores.length;i++)
        {
            if(min > scores[i])
            {
                min = scores[i];
                min_pos = i;
            }
        }
        System.out.println("Worst score: " + min);
        
        //we know min_pos and max_pos are to be excluded
        //lets find 2nd best and 3rd best;
        //find the ignored positions
        
        /*
        
        if(scores[]>scores[])
        {
            System.out.println("2nd Best: "+scores[]);
            System.out.println("3rd Best: "+scores[]);
        }
        else
        {
            System.out.println("2nd Best: "+scores[]);
            System.out.println("3rd Best: "+scores[]);        
        }

*/
    }
}
