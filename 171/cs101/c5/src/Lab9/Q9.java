package Lab9;

// Basit Qureshi Nov 18, 2017 11:50:43 AM

import java.util.Scanner;

 
public class Q9
{
    public static void main(String [] args)
    {
      
        Scanner In = new Scanner(System.in);
        System.out.println("Enter a sentence");
        
        String S = In.nextLine();
        
        int count = 0;
        
        for(int i=0 ; i<S.length(); i++)
        {
            int code = (int)S.charAt(i);
            if(code >= 65 && code <= 90)
                count++;
            
            
        }
        System.out.println("The number of upper-case letters is "+count);
        
    }
}
