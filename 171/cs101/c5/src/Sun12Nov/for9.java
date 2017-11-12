package Sun12Nov;

// Basit Qureshi Nov 12, 2017 8:03:24 AM
 
public class for9
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

        for(int j=0; j < LINES;j++)
        {
            for(int i=0;i < STARS - j;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        STARS=1;

        for(int j=0;j < LINES;j++)
        {
            for(int i=0;i < STARS + j;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
