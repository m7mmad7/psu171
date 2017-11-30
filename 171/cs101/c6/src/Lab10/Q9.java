package Lab10;

// Basit Qureshi Nov 23, 2017 8:32:14 AM
 
public class Q9 
{
    public static void main(String [] str)
    {
        
        System.out.println("All prime numbers from 1 to 10,000 are");
        
        for(int i=1;i<=10000;i++)
        {
            if(isPrime(i))
                System.out.println(i);
        }
        
    }
    
    public static boolean isPrime(int x)
    {
        boolean isTrue = true;
        int count=0;
        for(int i=2;i<x;i++)
            if(x%i==0)
                isTrue=false;
        
        return isTrue;
    }
    
    
    
}