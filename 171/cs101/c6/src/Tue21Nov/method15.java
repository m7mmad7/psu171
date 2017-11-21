package Tue21Nov;

// Basit Qureshi Nov 21, 2017 7:55:35 AM
import java.util.Scanner;

public class method15 {

    public static void main(String[] str) {
        Scanner In = new Scanner(System.in);
        int input = 0;
        System.out.println("Enter x and y");
        int x = In.nextInt();
        int y = In.nextInt();

        powers(x, y);

    }

    public static void powers(int x, int y) {

        for (int i = 1; i <= y; i++) {
            System.out.println(x + " pow " + i + " = " + findpow(x, i));
        }

    }
    
    public static int findpow(int a, int b)
    {
        int pow = 1;
        for(int i=1;i<=b;i++)
        {
            pow = pow * a;
        }
        return pow;
    }

}
