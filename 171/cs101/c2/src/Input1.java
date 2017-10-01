// Basit Qureshi Oct 1, 2017 8:17:54 AM

import java.util.Scanner;

public class Input1
{
    public static void main(String [] args)
    {
        
        Scanner Input = new Scanner (System.in);
        
        System.out.println("Please type your name!");
        String myName;
        
        myName = Input.nextLine();
        
        System.out.print("Thank you. You typed:");
        System.out.println(myName);
        
        
    }
}
