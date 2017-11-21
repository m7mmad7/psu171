package Tue21Nov;

// Basit Qureshi Nov 21, 2017 7:55:35 AM
 
public class method13
{
    public static void main(String [] str)
    {
        callMe(1);

    }
    
    public static void callMe(int x)
    {
        
        System.out.println(x++);
        if(x < 10)
        {
            callMe(x); // re-cursion
        }
    }
}
