package Midterm;

// Basit Qureshi Nov 9, 2017 1:31:07 PM
 
public class Q2 
{
    public static void main(String [] args)
    {
        int R = 50 + (int) (Math.random() * 51);
        System.out.println("Random number is " + R);
        System.out.println(R + " is divisible by 2 :" + (R % 2 == 0));
        System.out.println(R + " is divisible by 3 :" + (R % 3 == 0));
        System.out.println(R + " is divisible by 2 :" + (R % 2 == 0 && R % 3 == 0));
        
    }
}
