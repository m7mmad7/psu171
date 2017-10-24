package Lab6;

// Basit Qureshi Oct 24, 2017 8:38:48 AM

import java.util.Scanner;

 
public class Q3 
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        System.out.println("Enter Salary");
        double salary = In.nextDouble();
        int payscale;
        if(salary >=0 && salary <=5000)
            payscale = 1;
        else if(salary >=5001 && salary <=10000)
            payscale = 2;
        else if(salary >=10001 && salary <= 25000)
            payscale = 3;
        else
            payscale = 4;
        
        double tax = payscale * salary /100 + 
                (payscale - 1) * 1000;//formula
        System.out.println("Tax = " + tax);
        System.out.println("Payscale = " + payscale);
        
    }
}
