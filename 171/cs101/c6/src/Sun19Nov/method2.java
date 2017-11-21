package Sun19Nov;

// Basit Qureshi Nov 19, 2017 8:02:58 AM

import java.util.Scanner;

//modularity
//dividing or splitting your program is small parts
//better readability
// better organization of code.
 
public class method2
{
    public static void rectangle()
    {
        System.out.println("*****************");
        System.out.println("*               *");
        System.out.println("*               *");
        System.out.println("*****************");
    }
    
    public static void main(String [] str)
    {
       Scanner In = new Scanner(System.in);
       int choice = 0;
       do
       {
       //Menu
            menu();
            choice = In.nextInt();
            switch(choice)
            {
                case 1: box(); break;
                case 2: rectangle(); break;
                case 3: triangle(); break;
                case 4: break;
                default: continue;
            }

       }
       while(choice!=4);
    }
    
    public static void menu()
    {
        System.out.println("---MENU---");
        System.out.println("1. Print a Box");
        System.out.println("2. Print a Rectangle");
        System.out.println("3. Print a Triangle");
        System.out.println("4. Quit");
        System.out.println("What is your choice? ");
    }
    
    public static void box()
    {
        System.out.println("******");
        System.out.println("*    *");
        System.out.println("*    *");
        System.out.println("******");
        
        
    }// end box method / functions
    
    public static void triangle()
    {
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
    }
    
    
    
}//end class
