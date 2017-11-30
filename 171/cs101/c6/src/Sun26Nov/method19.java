package Sun26Nov;

// Basit Qureshi Nov 26, 2017 7:58:38 AM
// method overloading

public class method19
{
    public static void main(String [] args)
    {
        int a = 10;
        int b = 20;
        System.out.println(mystery1(a,b)); // 310
        //System.out.println(c);
    }
    
    public static int mystery1(int a, int b)
    {
        //a is 10; b is 20
        int c = 30;
        System.out.println(a+b); // 30
        return mystery2(a, c) + b; //290 + 20 = 310
    }
    
    public static int mystery2(int a, int b)
    {
        //a is 10; b is 30
        int c = 10;
        System.out.println(a + c); //20
        return a * b - 10; //290
    }
    
}
