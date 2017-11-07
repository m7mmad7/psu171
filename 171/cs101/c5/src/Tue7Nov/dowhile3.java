package Tue7Nov;

// Basit Qureshi Nov 7, 2017 8:07:29 AM

import java.util.Scanner;

 
public class dowhile3 
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        
        //finding max value
        int max = -999999;
        int num = 0;
        do
        {
            System.out.println("(Enter value. 0 to stop) ");
            num = In.nextInt();
            if(num==0)
                break;
            if(num > max)
                max = num;
        }
        while(num!=0);
        
        System.out.println("Max is: " + max);
    }
}
