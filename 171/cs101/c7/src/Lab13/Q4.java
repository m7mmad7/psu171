package Lab13;

// Basit Qureshi Dec 12, 2017 8:03:53 AM
import java.util.Scanner;

public class Q4 
{   
    public static int [] input(Scanner In)
    {
        System.out.println("Enter 10 integer values");
        
        int [] A = new int [10];
        
        for(int i=0;i<A.length;i++)
            A[i] = In.nextInt();
        
        return A;
    }    
    
    public static int min(int [] A)
    {
        int min=A[0];
        for(int i=1; i<A.length;i++)
        {
            if(min > A[i])
                min = A[i];
        }
        return min;
    }
    
    public static int max(int [] A)
    {
        int max=A[0];
        for(int i=1; i<A.length;i++)
        {
            if(max < A[i])
                max = A[i];
        }
        return max;
    }
    
    public static void main(String [] s)
    {
        Scanner Shasha = new Scanner (System.in);
        int [] Key = input(Shasha);
     
        System.out.println("Max: " + max(Key));
        System.out.println("Min: " + min(Key));
    }
}