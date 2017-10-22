package Sun22Oct;

// Basit Qureshi Oct 22, 2017 8:00:37 AM

import java.util.Scanner;

 
public class Switch4
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
        
        switch(choice)
        {
            case 1:
                    System.out.println(x + " + " + y + " = " + (x+y));
                    break;
            case 2:
                    System.out.println(x + " - " + y + " = " + (x-y));
                    break;
            case 3: 
                    System.out.println(x + " * " + y + " = " + (x * y));
                    break;
            case 4:
                    System.out.println(x + " / " + y + " = " + (double)x/y);
                    break;
            case 5: 
                    System.out.println(x + " % " + y + " = " + (x % y));
                    break;
            default:
                    System.out.println("Bye bye!");
                    //break;
        }
    }
}
