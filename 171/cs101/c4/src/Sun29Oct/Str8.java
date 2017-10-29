package Sun29Oct;

// Basit Qureshi Oct 29, 2017 7:57:33 AM

import java.util.Scanner;

 
public class Str8
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner(System.in);
        
        System.out.println("Enter yes or no");
        String input = In.next();
        
        System.out.println(input.startsWith("y"));
        System.out.println(input.startsWith("s"));
        
        System.out.println(input.startsWith("yes"));
        //pre-fix ... begining for a word
        //suffix ... end of a word
        
        System.out.println(input.endsWith("yes"));
        
        System.out.println(input.contains("yes"));
        
    }
}
