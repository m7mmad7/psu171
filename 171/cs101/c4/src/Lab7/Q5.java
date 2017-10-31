package Lab7;

// Basit Qureshi Oct 31, 2017 8:11:03 AM
import java.util.*;
public class Q5
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        String s1, s2;
        System.out.println("Enter s1 ");
        s1 = In.nextLine();
        
        System.out.println("Enter s2 ");
        s2 = In.nextLine();
        
        if(s1.contains(s2))
            System.out.println(s2 + " is a substring of " +s1);
        else
            System.out.println(s2 + " is NOT a substring of "+s1);
        
        
    }
}
