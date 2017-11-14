package Tue14Nov;

// Basit Qureshi Nov 14, 2017 8:02:20 AM
 
public class Nested4
{
    public static void main(String [] args)
    {
        
        int i = 1;
        while(i <= 10)
        {
            int j = 1;
            do
            {
                System.out.println(i + " * " + j + " = " + (i * j));
                j++;
            }while(j <= 10);
            
            
            System.out.println();
            i++;
        }
        
        
        
    }
}
