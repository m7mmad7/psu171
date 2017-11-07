package Tue7Nov;

// Basit Qureshi Nov 7, 2017 8:07:29 AM

import java.util.Scanner;

 
public class dowhile2 
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        
        int count = 1;
        do
        {
            System.out.println("_________MENU_________");
            System.out.println("1. Print 10 integers");
            System.out.println("2. Quit");
            System.out.println("______________________");

            int choice = In.nextInt();
            if(choice==1)
            {
                System.out.println("printing 10 integers");


            }
            else if (choice == 2)
            {
                return;
            }
        }
        while(true);
        
        
        
    }
}
