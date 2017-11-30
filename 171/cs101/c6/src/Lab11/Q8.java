package Lab11;

// Basit Qureshi Nov 26, 2017 9:52:21 AM

import java.util.*;
public class Q8
{
    public static void main(String [] str)
    {
        Scanner In = new Scanner(System.in);
        System.out.println("Enter a new Password");
        String Password = In.nextLine();
        
        if(isValid(Password))
            System.out.println("Correct Password");
        else
            System.out.println("Invalid Password");
            
    }
    
    public static boolean isValid(String P)
    {
        
        //A password must have at least eight characters.
        if(P.length()<8)
            return false;
        
        //A password consists of only letters and digits.
        //Ascii code for digits is 48 to 57
        //Ascii code for uppercase letters is 65 to 90
        //Ascii code for lowercase letters is 97 to 122
        
        for(int i=0;i<P.length();i++)
        {
            int thisChar = (int)P.charAt(i);
            if((thisChar >=48 && thisChar<=57) || 
               (thisChar >=65 && thisChar<=90) ||
               (thisChar >=97 && thisChar<=122))
               {
                   continue;
               }
            else
                return false;
        }
        
        //so far so good.. now for the third test
        //A password must contain at least two digits.
        int digitsCount=0;
        for(int i=0;i<P.length();i++)
        {
            int thisChar = (int)P.charAt(i);
            if((thisChar >=48 && thisChar<=57))
            {
                digitsCount++;
            }
        }
        if(digitsCount>=2)
            return true;
        
        return false;
    }
}