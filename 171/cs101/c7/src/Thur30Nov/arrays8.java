package Thur30Nov;

// Basit Qureshi Nov 30, 2017 8:02:19 AM

import java.util.Scanner;

//writing program to take 3 sentences from user and determining which is the longest!

public class arrays8
{
    public static void main(String [] strrrr)
    {
        
        double [] scores = {4.0, 5.5, 9.5, 7.5, 10.0};
        
        String [] strs = {"abc", "abcd", "abcdef"};
       
        //for next loop
        for(double temp : scores)
        {
            System.out.println(temp);
        }
        
        
        double max = 0;
        for(double d : scores)
        {
            if(max < d)
                max = d;
        }
        
        System.out.println("Max score is : " + max);
        
        
    }
}
