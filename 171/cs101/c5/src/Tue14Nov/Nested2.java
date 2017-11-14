package Tue14Nov;

// Basit Qureshi Nov 14, 2017 8:02:20 AM
 
public class Nested2
{
    public static void main(String [] args)
    {
        
        for(int i = 1; i <= 10; i++)
        {
            for(int j = 1; j <= 10; j++)
            {
                System.out.printf("%5.0f",(double)(j * i));
            }
            System.out.println();
        }
        
        
        
    }
}
