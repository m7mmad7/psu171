package Lab8;

// Basit Qureshi Nov 7, 2017 8:38:59 AM

import java.util.Scanner;

 
public class Q1 
{
    public static void main(String [] args)
    {
        double average;
        double sum = 0;
        double count = 0;
        int countNegative = 0;
        int countPositive = 0;
        int input;
        Scanner In = new Scanner(System.in);
        do
        {
            System.out.print("Enter a number. 0 to stop!");
            input = In.nextInt();
            if(input==0)
                break;
            if(input > 0)
                countPositive++;
            else if(input < 0)
                countNegative++;
            
            sum = sum + input;
            count++;
        }
        while(input!=0);
        
        System.out.println("Positives: " + countPositive);
        System.out.println("Negatives: " + countNegative);
        System.out.println("Total: " + sum);
        
        average = sum / count;
        System.out.println("Average: " + average);
        
    }
}
