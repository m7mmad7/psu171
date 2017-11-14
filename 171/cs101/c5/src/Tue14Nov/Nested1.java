package Tue14Nov;

// Basit Qureshi Nov 14, 2017 8:02:20 AM
 
public class Nested1 
{
    public static void main(String [] args)
    {
        int V = 1;
        for(int i=1; i <= 100; i++)
        {
            
            for(int j=1;j < 11;j++)
            {
                
                System.out.printf("%5.0f",(double)V);
                V++;
                
            }
            System.out.println();
            
        }
        
        
    }
}
