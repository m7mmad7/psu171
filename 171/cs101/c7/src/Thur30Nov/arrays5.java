package Thur30Nov;

// Basit Qureshi Nov 30, 2017 8:02:19 AM

import java.util.Scanner;

//writing program to take 3 sentences from user and determining which is the longest!

public class arrays5
{
    public static void main(String [] str)
    {
        System.out.println("Enter three sentences followed by Enter");
        
        Scanner In = new Scanner(System.in);
        /*
        String a, b, c;
        a = In.nextLine();
        
        b = In.nextLine();
        
        c = In.nextLine();
        
        if(a.length()>b.length() && a.length() > c.length())
            System.out.println(a);
        else if(b.length()>a.length() && b.length() > c.length())
            System.out.println(b);
        else
            System.out.println(c);
            
        */
        int size = 10;
        String [] S = new String [size];
        
        for(int i=0;i<size;i++)
            S[i] = In.nextLine();
        
        String max = "";
        
        for(int i=0;i<S.length;i++)
        {
            if(max.length()<S[i].length())
                max = S[i];
        }
        System.out.println(max);
        
    }
}
