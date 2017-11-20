package c6;

// Basit Qureshi Nov 19, 2017 8:02:58 AM

import java.util.Scanner;


 
public class method4
{
    public static void main(String [] args)
    {
        int abc = giveMeThree();
        double xyz = giveMeThree();
        
        abc = (int) giveDouble();
        xyz = giveDouble();
        
        String myString = giveHello();
        
        System.out.println(giveHello());
        
        return;
        
    }
    
    public static int giveMeThree()
    {
        int x = 1;
        int y = 2;
        int z = x + y;
        return z;
        
        //x = 1 + 3;
    }
    
    public static double giveDouble()
    {
        return 0.5;
    }
    
    public static char giveChar()
    {
        return 'a';
    }
    
    public static boolean TrueOrFlase()
    {
        return false;
    }
    
    public static String giveHello()
    {
        return "Hello";
    }
    
}//end class
