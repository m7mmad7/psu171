package Lab5;

// Basit Qureshi Oct 19, 2017 8:06:12 AM

import java.util.Scanner;

 
public class Q1 
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner(System.in);
        int a,b,c;
        double r1;
        a = In.nextInt();
        b = In.nextInt();
        c = In.nextInt();
        r1 = ((-1 * b) + Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
        System.out.println(r1);

    }
}
