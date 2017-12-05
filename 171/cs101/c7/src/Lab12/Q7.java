package Lab12;

// Basit Qureshi Dec 5, 2017 8:09:18 AM

import java.util.Scanner;
 
public class Q7
{
    public static void main(String [] s)
    {
        String [] Str = new String [3];
        Scanner In = new Scanner(System.in);
        
        for(int i=0;i<3;i++)
        {
            Str[i] = In.nextLine();
        }
        
        int pos = 0;
        int max_len=Str[0].length();
        
        for(int i=1;i<3;i++)
        {
            if(max_len < Str[i].length())
            {
                max_len = Str[i].length();
                pos = i;
                
            }
        }
        
        System.out.println("Longest String is: " + Str[pos]);
        
    }
}
