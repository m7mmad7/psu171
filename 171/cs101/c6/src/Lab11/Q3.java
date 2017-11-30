package Lab11;

// Basit Qureshi Nov 26, 2017 9:52:21 AM

import java.util.Scanner;

 
public class Q3 
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        System.out.println("Please Enter a phone number. e.g. 1-800-Flowers");
        String number = In.next();
        number = number.toLowerCase();
        String output = "";
        for(int i=0;i<number.length();i++)
        {
            char thisChar = number.charAt(i);
            int cc = code(thisChar);
            if(thisChar=='-')
            {
                output = output + '-';
                continue;
            }
            else if(cc==-1)
            {
                System.out.println("Wrong input");
                return;
            }
            output = output + cc;
            
        }
        System.out.println(output);
        
    }
    public static int code(char c)
    {
        if((int)c>=48 && (int)c<=57)
            return ((int)c ) - 48;
        else if(c=='a' || c=='b' || c=='c')
            return 2;
        else if (c=='d' || c=='e' || c=='f')
            return 3;
        else if (c=='g' || c=='h' || c=='i')
            return 4;        
        else if (c=='j' || c=='k' || c=='l')
            return 5;        
        else if (c=='m' || c=='n' || c=='o')
            return 6;        
        else if (c=='p' || c=='q' || c=='r' || c=='s')
            return 7;        
        else if (c=='t' || c=='u' || c=='v')
            return 8;
        else if (c=='w' || c=='x' || c=='y' || c=='z')
            return 9;
        else
            return -1;
        
    }
    
}
