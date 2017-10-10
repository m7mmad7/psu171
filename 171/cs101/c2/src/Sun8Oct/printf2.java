package Sun8Oct;

// Basit Qureshi Oct 10, 2017 7:57:01 AM

import java.util.Scanner;

 
public class printf2
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner(System.in);
        System.out.print("Hello. Please type your name? ");
        
        String name = In.next();
        
        System.out.print("Please type Salary! ");
        
        double salary = In.nextDouble();
        
        salary = salary + (salary / 10);
        
        System.out.printf("%s, you will earn %8.2f next month!",name, salary);
        
        salary = salary + (salary / 10);
        System.out.printf("\n%20.2f", salary);
        
        salary = salary + (salary / 10);
        System.out.printf("\n%20.2f", salary);
        
        salary = salary + (salary / 10);
        System.out.printf("\n%20.2f", salary);
        
        salary = salary + (salary / 10);
        System.out.printf("\n%-20.2f", salary);
        
        salary = salary + (salary / 10);
        System.out.printf("\n%-20.2f", salary);
    }
}
