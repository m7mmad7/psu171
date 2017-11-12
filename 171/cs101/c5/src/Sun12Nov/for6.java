package Sun12Nov;

// Basit Qureshi Nov 12, 2017 8:03:24 AM
 
public class for6
{
    public static void main(String [] args)
    {
        int STARS=5, LINES=5;
        
        int i = 0, j = 0;
        
        while(j < LINES)
        {
            while(i < STARS - j)
            {
                System.out.print("*");
                i++;
            }
            i=0;
            System.out.println();
            j++;
        }
    }
}
