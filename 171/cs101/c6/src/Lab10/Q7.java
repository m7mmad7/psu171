package Lab10;

// Basit Qureshi Nov 23, 2017 8:32:14 AM
 
public class Q7 
{
    public static void main(String [] str)
    {
        printNumbers(5, 50);
    }
    
    public static void printNumbers(int x, int y)
    {
        int count=0;
        for(int i=x; i<=y;i++)
        {
            if(count==10)
            {
                System.out.println();
                count=0;
            }
            System.out.print(i + " ");
            count++;
        }
    }
    
    
}