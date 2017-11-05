package Sun5Nov;

// Basit Qureshi Nov 5, 2017 7:56:35 AM

import java.util.Scanner;

 
public class while7
{
    public static void main(String [] args)
    {
        System.out.println("This program adds user input "
                + "until user enters -1");
        Scanner In = new Scanner(System.in);
        int sum = 0;
        //int count = 0;
        int value = 0;
        while(true) // infinite loop
        {
            value = In.nextInt();
            if(value == -1) // sentinel value
                break;   // keyword "break" stops the loop
            sum = sum + value;
            
           // count++;
        }
        
        System.out.println(sum);
        
        
        
        
    }
}
