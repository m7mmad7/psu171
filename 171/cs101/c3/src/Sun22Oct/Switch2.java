package Sun22Oct;

// Basit Qureshi Oct 22, 2017 8:00:37 AM

import java.util.Scanner;

 
public class Switch2 
{
    public static void main(String [] s)
    {
        System.out.println("Hello. This is a calculator program!");
        System.out.println("You can enter two integers. I will do "
                + "some simple arithmatic on these numbers!!!");
        
        Scanner In = new Scanner (System.in);
        int x, y;
        x = In.nextInt();
        y = In.nextInt();
        
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("0. Do nothing!");
        System.out.println("What is your choice?");
        
        int choice = In.nextInt();
        
        if(choice == 1)
        {
            int sum = x + y;
            System.out.println(x + " + " + y + " = " + sum);
            
        }
        else if(choice == 2)
        {
            int sub = x - y;
            System.out.println(x + " - " + y + " = " + sub);
        }
        else if(choice == 3)
        {
             int mul = x * y;
             System.out.println(x + " * " + y + " = " + mul);
        }
        else if(choice == 4)
        {
            double div = (double) x / y;
            System.out.println(x + " / " + y + " = " + div);
        }
        else if(choice == 5)
        {
            int mod = x % y;
            System.out.println(x + " % " + y + " = " + mod);
        }
        else
        {
            System.out.println("Bye bye!");
            return;
        }
        
    }
}
