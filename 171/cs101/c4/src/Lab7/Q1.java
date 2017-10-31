package Lab7;

// Basit Qureshi Oct 31, 2017 8:11:03 AM
 import java.util.*;
public class Q1 
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        
        System.out.println("Letter: ");
        String str = In.next();
        str = str.toLowerCase();
        String output = "";
        
        char c = str.charAt(0);
        
        if(c=='a' || c=='b' || c=='c')
        {
            output = "2";
        }
        else if(c=='d' || c=='e' || c=='f')
        {
            output = "3";
        }
        
        // complete the rest!!
        else
        {
            System.out.println("Error!");
            return;
        }
        
        
        System.out.println("Number: " + output);
        
        
        
    }
}
