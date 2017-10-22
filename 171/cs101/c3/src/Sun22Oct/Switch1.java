package Sun22Oct;

// Basit Qureshi Oct 22, 2017 8:00:37 AM

import java.util.Scanner;

 
public class Switch1 
{
    public static void main(String [] s)
    {
        System.out.println("Hello. This is a calculator program!");
        System.out.println("You can enter two integers. I will do "
                + "some simple arithmatic on thse numbers!!!");
        
        Scanner In = new Scanner (System.in);
        int x, y;
        x = In.nextInt();
        y = In.nextInt();
        
        int sum = x + y;
        int sub = x - y;
        int mul = x * y;
        double div = (double) x / y;
        int mod = x % y;
        
        System.out.println(x + " + " + y + " = " + sum);
        System.out.println(x + " - " + y + " = " + sub);
        System.out.println(x + " * " + y + " = " + mul);
        System.out.println(x + " / " + y + " = " + div);
        System.out.println(x + " % " + y + " = " + mod);
        
        
    }
}
