package Sun29Oct;

// Basit Qureshi Oct 29, 2017 7:57:33 AM

import java.util.Scanner;

 
public class Str10
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner(System.in);
        
        System.out.println("Enter a positive value");
        //int pos = In.nextInt();
        
        
        
        String input = In.next();
        int pos = Integer.parseInt(input);
        //converts string to int
        
        System.out.println("You entered " + pos);
        
    }
}
