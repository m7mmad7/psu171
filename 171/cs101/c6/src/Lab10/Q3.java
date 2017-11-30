package Lab10;

// Basit Qureshi Nov 23, 2017 8:32:14 AM
 
public class Q3
{
    public static void main(String [] str)
    {
        System.out.println("i\t\tm(i)");
        printSeries();
    }
    public static void printSeries()
    {
        for(int i=1;i<=20;i++)
            System.out.printf("%d\t\t%6.4f\n", i, series(i));
    }
    
    public static double series(int i)
    {
        double sum = 0;
        for(double j=1;j<=i;j++)
        {
            sum+= j/(j+1);
        }
        return sum;
    }
}
