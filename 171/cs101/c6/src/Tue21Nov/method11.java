package Tue21Nov;

// Basit Qureshi Nov 21, 2017 7:55:35 AM
 
public class method11
{
    public static void main(String [] str)
    {
        int money = 100;
        
        int s = deduct10(money);
        System.out.println(s);

    }
    
    public static int deduct10(int x)
    {
        int sum = x - 10;
        return sum;
    }
}
