package Sun22Oct;

// Basit Qureshi Oct 22, 2017 8:00:37 AM

import java.util.Scanner;

 
public class Switch5
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
        
        System.out.println("(A)ddition");
        System.out.println("(S)ubtraction");
        System.out.println("(M)ultiplication");
        System.out.println("(D)ivision");
        System.out.println("M(o)dulus");
        System.out.println("E(x)it!");
        System.out.println("What is your choice?");
        
        char choice = (In.next()).charAt(0);
        
        switch(choice)
        {
            case 'A':
                    System.out.println(x + " + " + y + " = " + (x+y));
                    break;
            case 'S':
                    System.out.println(x + " - " + y + " = " + (x-y));
                    break;
            case 'M': 
                    System.out.println(x + " * " + y + " = " + (x * y));
                    break;
            case 'D':
                    System.out.println(x + " / " + y + " = " + (double)x/y);
                    break;
            case 'o': 
                    System.out.println(x + " % " + y + " = " + (x % y));
                    break;
            default:
                    System.out.println("Bye bye!");
                    //break;
        }
    }
}
