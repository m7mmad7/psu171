package Lab10;

// Basit Qureshi Nov 23, 2017 8:32:14 AM

import java.util.Scanner;

 
public class Q5
{
    public static void main(String [] str)
    {
        Scanner In = new Scanner(System.in);
        System.out.println("Enter year: ");
        int y = In.nextInt();
        System.out.println(leapYear(y));
    }
    
    public static int leapYear(int year)
    {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))? 366: 365;
    }
}