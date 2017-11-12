package Sun12Nov;

// Basit Qureshi Nov 12, 2017 8:03:24 AM
 
public class for5
{
    public static void main(String [] args)
    {
        int STARS=15, LINES=15;
        
        int i = 0, j = 0;
        
        while(j < LINES)
        {
            while(i < STARS)
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
