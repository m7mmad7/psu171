package Sun29Oct;

// Basit Qureshi Oct 29, 2017 7:57:33 AM

import java.util.Scanner;

 
public class Str4
{
    public static void main(String [] s)
    {
        System.out.println("Enter yes to continue...");
        Scanner In = new Scanner(System.in);
        
        String s1 = In.next();
        
        if(s1.compareTo("yes")==0 || s1.compareTo("Yes")==0)
        {
            System.out.println("We continue");
        }
        else
            System.out.println("Bye... Exiting!");
        
        s1 = s1.toLowerCase();
        if(s1.compareTo("yes")==0)
        {
            System.out.println("We continue");
        }
        else
            System.out.println("Finally.... bye");
        
        
    }
}
