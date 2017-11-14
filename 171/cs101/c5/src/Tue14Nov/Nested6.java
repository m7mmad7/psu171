package Tue14Nov;

// Basit Qureshi Nov 14, 2017 8:02:20 AM

import java.util.Scanner;

 
public class Nested6
{
    public static void main(String [] args)
    {
        int LINES = 10;
        
        for(int i=0;i<LINES;i++)
        {
            for(int j=0;j<LINES-i;j++)
                System.out.print("*");
            
            for(int k=0;k<LINES;k++)
                System.out.print(".");
            
            for(int l=0;l<1+i;l++)
                System.out.print("*");
            
            
            System.out.println();
        }
    }//main
}//class
