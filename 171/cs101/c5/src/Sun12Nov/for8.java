package Sun12Nov;

// Basit Qureshi Nov 12, 2017 8:03:24 AM
 
public class for8
{
    public static void main(String [] args)
    {
        /*
        ***
        **
        *
        *
        **
        ***
        */
        
        int STARS=50, LINES=50;
        
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
        
        STARS=1;

        
        i = 0;
        j = 0;
        
        while(j < LINES)
        {
            while(i < STARS + j)
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
