package Sun5Nov;

// Basit Qureshi Nov 5, 2017 7:56:35 AM

import java.util.Scanner;

 
public class while8
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        
        System.out.println("Enter value for x ");
        int x = In.nextInt();
        
        System.out.println("Enter value for y ");
        int y = In.nextInt();
        
        while(true)
        {
            System.out.println("_______________________");
            System.out.println("1. x + y");
            System.out.println("2. x - y");
            System.out.println("3. x * y");
            System.out.println("4. x / y");
            System.out.println("5. Quit!");
            int choice = In.nextInt();
            
            switch(choice)
            {
                case 1: System.out.println("x + y = " + (x + y)); break;
                case 2: System.out.println("x - y = " + (x - y)); break;
                case 3: System.out.println("x * y = " + (x * y)); break;
                case 4: System.out.println("x / y = " + (x / y)); break;
                 
            }
            if(choice == 5)
                break;
            else if(choice >5 || choice < 1)
                System.out.println("Try again! Enter (1 - 5)");
        }
        
    }
}
