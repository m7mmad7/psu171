package Tue17Oct;

// Basit Qureshi Oct 17, 2017 8:14:00 AM

import java.util.Scanner;
 
public class boolean3
{
    public static void main(String [] args)
    {
        Scanner In= new Scanner(System.in);
        int num = In.nextInt();
        boolean expr = (num > 1 && num < 100 || num < 0);
          
        boolean expr1 = Math.abs(num - 5) < 4.5;
        
        int age = In.nextInt();
        boolean expr2 = age > 13 && age < 18;
        
        double weight = 55, height = 55;
        boolean output = weight > 50 || height <60;
        if(output);
        
        
        
    }
}
