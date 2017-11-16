package Lab9;

// Basit Qureshi Nov 16, 2017 7:50:43 AM

import java.util.Scanner;

 
public class Q1 
{
    public static void main(String [] args)
    {
        
        Scanner In = new Scanner(System.in);
        System.out.println("Please Enter a sentence...");
        String S = In.nextLine();
        
        char ch = ' ';
        do
        {
            System.out.println("--- Menu ---");
            System.out.println("a. Display number of characters in the input\n" +
                               "b. Display input in all uppercase letters\n" +
                               "c. Display input in all lowercase letters\n" +
                               "d. Quit");
            ch = In.next().charAt(0);
            switch(ch)
            {
                case 'a': System.out.println(S.length()); break;
                case 'b': System.out.println(S.toUpperCase());break;
                case 'c': System.out.println(S.toLowerCase());break;
                case 'd': break;//notice.. this breaks the switch and NOT the loop
                default: continue;
            }
            
            
        }while(ch!='d');
        
        
    }
}
