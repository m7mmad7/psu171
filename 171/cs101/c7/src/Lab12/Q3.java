package Lab12;

// Basit Qureshi Dec 5, 2017 8:09:18 AM

import java.util.Arrays;
import java.util.Scanner;

 
public class Q3 
{
    public static void main(String [] s)
    {
        
        int c0=0;
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        int c5=0;
        int c6=0;
        int c7=0;
        int c8=0;
        int c9=0;        
        
        for(int i=0;i<100;i++)
        {
            int x = (int) (Math.random()*10);
            switch(x)
            {
                case 0: c0++; break;
                case 1: c1++; break;
                case 2: c2++; break;
                case 3: c3++; break;
                case 4: c4++; break;
                case 5: c5++; break;
                case 6: c6++; break;
                case 7: c7++; break;
                case 8: c8++; break;
                case 9: c9++; break;
                
            }
        }
        
        System.out.println("0: "+c0);
        System.out.println("1: "+c1);
        System.out.println("2: "+c2);
        System.out.println("3: "+c3);
        System.out.println("4: "+c4);
        System.out.println("5: "+c5);
        System.out.println("6: "+c6);
        System.out.println("7: "+c7);
        System.out.println("8: "+c8);
        System.out.println("9: "+c9);

        
        
    }
}
