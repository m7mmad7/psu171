package Sun29Oct;

// Basit Qureshi Oct 29, 2017 7:57:33 AM

import java.util.Scanner;

 
public class Str7
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner(System.in);
        
        System.out.println("Enter yes or no");
        String input = In.next();
        input = input.toLowerCase();
        if(input.equals("yes")) //input.compareTo("yes")==0
        {
            System.out.println("Yessssss");
        }
        else
            System.out.println("Noooo");
        
        if(input.startsWith("y")||input.startsWith("Y"))
        {
            
            System.out.println("YES");
        }
        else
            System.out.println("NO");
        
    }
}
