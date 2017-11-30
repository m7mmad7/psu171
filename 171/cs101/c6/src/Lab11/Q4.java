package Lab11;

// Basit Qureshi Nov 26, 2017 9:52:21 AM

import java.util.Scanner;

 
public class Q4 
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        System.out.println("Please Enter a Sentence");
        String S = In.nextLine();
        System.out.println("Now please enter a character you want to search");
        char temp = In.next().charAt(0);
        System.out.println(count(S,temp));
    }
    public static int count(String str, char a)
    {
        int c = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==a)
                c++;
        }
        return c;
    }
    
    
}
