package Lab4;

// Basit Qureshi Oct 10, 2017 9:37:07 AM

import java.util.Scanner;

 
public class Q4 
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner(System.in);
        
        System.out.println("Enter Code between 1 and 254?");
        int code = In.nextInt();
        
        System.out.println((char)code);
        
    }
}
