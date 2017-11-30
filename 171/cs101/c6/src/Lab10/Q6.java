package Lab10;

// Basit Qureshi Nov 23, 2017 8:32:14 AM
 
public class Q6 
{
    public static void main(String [] str)
    {
        for(int i=1;i<=10;i++)
            printXTable(i);

    }
    
    public static void printXTable(int x)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(x+" * " + i + " = " + (x * i));
        }
    }
}