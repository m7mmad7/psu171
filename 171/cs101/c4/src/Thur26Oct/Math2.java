package Thur26Oct;

// Basit Qureshi Oct 26, 2017 8:45:04 AM
 
public class Math2 
{
    public static void main(String [] args)
    {
        int x = 4;
        if (x > 3)
            System.out.println(x);
        else
            System.out.println("3");
        
        System.out.println(Math.max(3, x));
        
        System.out.println(Math.max(1, Math.max(3, x)));
        
        System.out.println(Math.min(3, x));
        
        System.out.println(Math.min(1, Math.min(3,x)));
        
        
    }
}
