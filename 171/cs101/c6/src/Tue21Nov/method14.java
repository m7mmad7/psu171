package Tue21Nov;

// Basit Qureshi Nov 21, 2017 7:55:35 AM

import java.util.Scanner;

 
public class method14
{
    public static void main(String [] str)
    {
        Scanner In = new Scanner(System.in);
        int input = 0;
        System.out.println("Enter x and y");
        int x = In.nextInt();
        int y = In.nextInt();
        
        do
        {
            Menu();
            input = In.nextInt();
            switch(input)
            {
                case 1: System.out.println(x + " + " + y + " = " + sum(x, y));
                        break;
                case 2: System.out.println(x + " - " + y + " = " + sub(x, y));
                        break;
                case 3: System.out.println(x + " * " + y + " = " + mul(x, y));
                        break;
                case 4: System.out.println(x + " / " + y + " = " + div(x, y));
                        break;
                case 5: break;
                default: continue;
            }
            
        }while(input!=5);

    }
    
    public static void Menu()
    {
        System.out.println("---Menu---");
        System.out.println("1. x + y");
        System.out.println("2. x - y");
        System.out.println("3. x * y");
        System.out.println("4. x / y");
        System.out.println("5. Quit");
        System.out.println("---choice ?");
    }
    
    public static int sum(int a, int b)
    {
        return a + b;
    }
    public static int sub(int c, int d)
    {
        return c - d;
    }
    public static int mul(int a, int d)
    {
        return a * d;
    }
    public static int div(int x, int z)
    {
        return x / z;
    }
}
