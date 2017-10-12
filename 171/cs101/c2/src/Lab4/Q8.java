package Lab4;

// Basit Qureshi Oct 10, 2017 9:44:21 AM

import java.util.Scanner;

 
public class Q8
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner (System.in);
       
        System.out.println("Enter driving distance:");
        double miles = In.nextDouble();
        
        System.out.println("Enter miles per gallon:");
        double mpg = In.nextDouble();
        
        System.out.println("Enter price per gallon:");
        double price = In.nextDouble();
        
        
        double cost= (miles / mpg) * price;

        System.out.printf("The cost of driving is $%8.2f" , cost);
    }
}
