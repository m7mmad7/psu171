package Lab10;

// Basit Qureshi Nov 23, 2017 8:32:14 AM
 
public class Q4
{
    public static void main(String [] str)
    {
        System.out.println("i\t\tm(i)");
        printSeries();
    }
    public static void printSeries()
    {
        for(int i=1;i<1000;i+=100)
            System.out.printf("%d\t\t%6.4f\n", i, series(i));
    }
    
    public static double series(int i)
    {
        double sum = 0;
        int count=0;
        for(double j=1;j<=i;j++)
        {
            
           //sum+= Math.pow(-1,j+1)/ (2*j-1);
           if((j+1)%2==0)
               sum+= 1/(double)(j*2-1);
           else
               sum-= 1/(double)(j*2-1);
           
        }
        return 4*sum;
    }
}
