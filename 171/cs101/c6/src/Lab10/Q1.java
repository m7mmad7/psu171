package Lab10;

// Basit Qureshi Nov 23, 2017 8:32:14 AM
 
public class Q1 
{
    public static void main(String [] str)
    {
        print2Table();
        System.out.println();
        print3Table();
    }
    
    public static void print2Table()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }


    public static void print3Table()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("3 * " + i + " = " + (3 * i));
        }
    }

}
