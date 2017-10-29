package Sun29Oct;

// Basit Qureshi Oct 29, 2017 7:57:33 AM

import java.util.Scanner;

 
public class Str6
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner(System.in);
        
        System.out.println("Enter y or Y for yes!!");
        
        String input1 = In.next();
        char y = input1.charAt(0);
        
        if(y == 'y' || y == 'Y')
        {
            System.out.println("YEssssss");
        }
        else
            System.out.println("Exit!");
        
        
        
        
    }
}
