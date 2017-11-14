package Tue14Nov;

// Basit Qureshi Nov 14, 2017 8:02:20 AM

import java.util.Scanner;

 
public class Nested7
{
    public static void main(String [] args)
    {
        int LINES = 5;
        
        
        for(int x=0; x < 5; x++)
        {


            for(int i=0;i<LINES;i++)
            {
                for(int j=0;j<LINES-i-1;j++)
                    System.out.print(" ");

                for(int k=0;k<i+1;k++)
                    System.out.print("*");

                for(int l=0;l<i+1;l++)
                    System.out.print("*");
                System.out.println();
            }
            for(int i=0;i<LINES;i++)
            {
                for(int j=0;j<i;j++)
                    System.out.print(" ");

                for(int k=0;k<LINES-i;k++)
                    System.out.print("*");

                for(int l=0;l<LINES-i;l++)
                    System.out.print("*");
                System.out.println();
            }
        }
        
    }//main
}//class
