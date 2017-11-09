package Midterm;

// Basit Qureshi Nov 9, 2017 1:31:07 PM

import java.util.Scanner;

 
public class Q3
{
    public static void main(String [] args)
    {
        System.out.println("--- Lunch Menu Options ---");
        System.out.println("a. Burger + Fries + Coke");
        System.out.println("b. Burger + Coke");
        System.out.println("c. Burger");
        System.out.println("d. Shwarma + Juice");
        System.out.println("What is your choice?");
        
        Scanner In = new Scanner(System.in);
        String input = In.next().toLowerCase();
        
        switch(input.charAt(0))
        {
            case 'a': System.out.println("You pay 25.0 Riyals for Burger + Fries + Coke.");break;
            case 'b': System.out.println("You pay 22.0 Riyals for Burger + Coke.");break;
            case 'c': System.out.println("You pay 20.0 Riyals for Burger.");break;
            case 'd': System.out.println("You pay 10.0 Riyals for Shwarma + Juice.");break;
            default: System.out.println("Error... quitting"); break;
        }   
    }
}
