package Tue17Oct;

// Basit Qureshi Oct 17, 2017 8:02:00 AM

import java.util.Scanner;

 
public class ifselse2 
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        
        System.out.println("Enter your score!");
        int score = In.nextInt();
        
        String grade = "";
        
        if(score >=90)
        {
            grade = "A";
            System.out.println(grade);
        }
        else 
        {
            grade = "You fail!";
            System.out.println(grade);
        }
        
        ///////////////////////////////////
        if(score >=90)
            grade = "A";
        else 
            grade = "You fail!";
        
        System.out.println(grade);
        
        
        int i=0,j=0,k=0,x,y,z;
        
        if (i > 0) 
            if(j > 0)
                x = 0; 
            else if (k > 0) 
                y = 0; 
            else 
                z = 0;

        
        
        
    }
}
