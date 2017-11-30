package Sun26Nov;

// Basit Qureshi Nov 26, 2017 7:58:38 AM
// method overloading

public class method20
{
    public static void main(String [] args)
    {
        int a = 10;
        int b = 20;
        System.out.println(mystery1(a,b)); // 200
        //System.out.println(c);
    }
    
    public static int mystery1(int b, int a)
    {
        //a is 20; b is 10
        int c = 30;
        System.out.println(a+b); // 30
        return mystery2(a, c) + b; //190+ 10 =200
    }
    
    public static int mystery2(int b, int c)
    {
        //c is 30; b is 20
        int a = 10;
        System.out.println(a + b); //30
        return a * b - 10; //200-10=190
    }
    
}
