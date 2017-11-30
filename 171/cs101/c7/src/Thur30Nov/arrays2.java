package Thur30Nov;

// Basit Qureshi Nov 30, 2017 8:02:19 AM

import java.util.Scanner;

 
public class arrays2 
{
    public static void main(String [] str)
    {
        Scanner In = new Scanner (System.in);
        
        int [] array;
        
        array = new int [5];// get five int values and store them with array
        
        
        
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        
        int v,w,x,y,z;
        v = 10;
        w = 20;
        x = 30;
        y = 40;
        z = 50;
        
        int sum = v + w + x + y + z;
        
        int sumarray = array[0] + array[1] + array[2] + array[3] + array[4];
        
        for(int i=0;i<array.length;i++)
            sumarray = sumarray + array[i];
        
        
        
        
        
        
        
        
    
    }
}
