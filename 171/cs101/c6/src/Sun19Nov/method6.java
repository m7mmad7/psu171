package Sun19Nov;

// Basit Qureshi Nov 19, 2017 8:02:58 AM

import java.util.Scanner;


 
public class method6
{
    public static void main(String [] args)
    {
        //pass a value as a parameter
        printBox(15);
        
    }
    
    public static void printBox(int Size)
    {
        for(int i = 0; i < Size; i++)
        {
            for(int j=0; j< Size; j++)
            {
                
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
    
    
}//end class
