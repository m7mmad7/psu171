package Lab11;

// Basit Qureshi Nov 26, 2017 9:52:21 AM

import java.util.*;
public class Q7
{
    public static void main(String [] str)
    {
        Scanner In = new Scanner(System.in);
        System.out.println("Enter n");
        int n= In.nextInt();
        randomMatrix(n);
    }
    
    public static void randomMatrix(int n)
    {
        Random R = new Random();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(R.nextInt(2) + " ");
            System.out.println();
        }

    }
}