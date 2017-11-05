package Sun5Nov;

// Basit Qureshi Nov 5, 2017 7:56:35 AM

import java.util.Scanner;

 
public class while4
{
    public static void main(String [] args)
    {
        // add 10 numbers and display result
        int sum = 0;
        //1 + 2 + 3 + 4 ..... 10
        
        int count = 1;
        
        while(count <= 10)
        {
            
            sum = sum + count;   //10
            count++;  //4
        }
        System.out.println(sum);
        
        
        
    }
}
