package Sun26Nov;

// Basit Qureshi Nov 26, 2017 7:58:38 AM
// method overloading

public class method21
{
    public static void main(String [] args)
    {
        int a = 10;
        int b = 20;
        System.out.println(mystery1(a,b)); // 0
        //System.out.println(c);
        
       // No_main.hello();
       // Lab10.Q5.leapYear(a);
       // Math.pow(1,2);
    }
    
    public static int mystery1(int b, int a)
    {
        //a is 20; b is 10
        int c = 30;
        System.out.println(a+b); // 30
        return (int)mystery2(a, 0, c) + b; //-10+ 10 =0
    }
    
    public static int mystery2(int b, int c)
    {
        //c is 5; b is 0
        int a = 10;
        System.out.println(a + b); //10
        return a * b - 10; //0-10=-10
    }
    /*
    public static double mystery2(int b, int c)
    {
        System.out.println("mystery2 overload!");
        return (int) (b * c);
    }
    */
    public static double mystery2(int b, int c, int a)
    {
        //20, 0 and 30
        System.out.println("mystery2 overload!");
        return (int) mystery2(b * c, 5); //(int)-10.0
    }
}
