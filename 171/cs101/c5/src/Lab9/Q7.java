package Lab9;

// Basit Qureshi Nov 16, 2017 7:50:43 AM

import java.util.Scanner;
import java.util.Random;
 
public class Q7 
{
    public static void main(String [] args)
    {
      
        Scanner In = new Scanner(System.in);
        System.out.println("Enter a sentence");
        
        String S = In.nextLine();
        
        String other = "";
        
        for(int i=S.length()-1 ; i>=0; i--)
        {
            other = other + S.charAt(i);
        }
        System.out.println(other);
        
    }
}
