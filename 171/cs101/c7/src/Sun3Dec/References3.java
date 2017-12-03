package Sun3Dec;

// Basit Qureshi Dec 3, 2017 8:05:20 AM
 
public class References3
{
    public static void main(String [] s)
    {
        int [] A; // A is a reference / key
        
        A = new int[1]; //car
        
        A[0] = 10; // copy 10 in the car
        
        int [] B; // B is a reference / key
        
        B = A; // copied reference/address/key of A on B
        // now B and A are both pointing to the same key/reference
        
        
        System.out.println(A);
        System.out.println(B);
        
        System.out.println(A.length);
        System.out.println(B.length);
        
        System.out.println(A[0]);
        System.out.println(B[0]);
        
        A[0] = 100;
        
        System.out.println(A[0]);
        System.out.println(B[0]);
        
        B[0] = 0;
        
        System.out.println(A[0]);
        System.out.println(B[0]);
        
        
        
        
        
        
        
        
    }
}
