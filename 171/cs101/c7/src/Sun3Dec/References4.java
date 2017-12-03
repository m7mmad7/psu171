package Sun3Dec;

// Basit Qureshi Dec 3, 2017 8:05:20 AM
 
public class References4
{
    public static void main(String [] s)
    {
        int [] ptr = {1,2,3};
        
        int [] A;
        A = ptr;
        
        A[1] = 10;
        
        for(int i=0;i<A.length;i++)
            System.out.println(A[i]);
        
        
        
        
        
        
    }
}
