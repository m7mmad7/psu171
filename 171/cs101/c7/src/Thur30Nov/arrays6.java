package Thur30Nov;

// Basit Qureshi Nov 30, 2017 8:02:19 AM

import java.util.Scanner;

//writing program to take 3 sentences from user and determining which is the longest!

public class arrays6
{
    public static void main(String [] str)
    {
        
        Scanner In = new Scanner(System.in);
        System.out.println("Enter number of students");
        
        int students = In.nextInt();
        
        double [] scores = new double [students];
        
        for(int i = 0;i< scores.length;i++)
            scores[i] = In.nextDouble();
        
        //for next loop
        for(double temp : scores)
        {
            System.out.println(temp);
        }
        
        
        double max = 0;
        for(int i = 0;i<scores.length;i++)
        {
            if(max < scores[i])
                max = scores[i];
        }
        
        System.out.println("Max score is : " + max);
        
        
    }
}
