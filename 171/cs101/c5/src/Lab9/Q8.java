package Lab9;

// Basit Qureshi Nov 18, 2017 11:50:43 AM

import java.util.Scanner;

 
public class Q8
{
    public static void main(String [] args)
    {
      
        Scanner In = new Scanner(System.in);
        System.out.println("Enter a sentence");
        
        String S = In.nextLine();
        
        String other = "";
        
        for(int i=0 ; i<S.length(); i = i + 2)
        {
            other = other + S.charAt(i);
        }
        System.out.println(other);
        
    }
}
