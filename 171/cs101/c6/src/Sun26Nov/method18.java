package Sun26Nov;

// Basit Qureshi Nov 26, 2017 7:58:38 AM
// method overloading

public class method18 
{
    public static void main(String [] args)
    {
        System.out.println(max((int)'c', 'd'));


    }
    
    public static int max(int a, int b)
    {
        System.out.println("Im in method max int");

        if(a > b)
            return a;
        else
            return b;
    }
    //over loading
    public static double max(double a, double b)
    {
        System.out.println("Im in method max double");
        if(a > b)
            return a;
        else
            return b;
    }    
    
    public static char max(char a, char b)
    {
        System.out.println("Im in method max char");
        if(a > b)
            return a;
        else
            return b;
    }
}
