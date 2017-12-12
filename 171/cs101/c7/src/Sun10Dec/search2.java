package Sun10Dec;

// Basit Qureshi Dec 10, 2017 8:03:23 AM

import java.util.Random;

 
public class search2 
{
    public static void main(String [] args)
    {
        int [] B = {1,2,3,4,5,6,7,8,9};
        System.out.println(BinarySearch(B, 15));
        
    }
    
    
    public static int BinarySearch(int [] A, int item)
    {
        int lo, mid, hi;
        lo = 0;
        hi = A.length-1;
        
        while(hi >= lo)
        {
            mid = (lo+hi)/2;
            
            if(A[mid]==item)
                return mid;
            else if(A[mid] > item) //item is on the left
                hi = mid-1;
            else // item is on the right
                lo = mid + 1;

        }
        return -1;
    }
    
    
}
