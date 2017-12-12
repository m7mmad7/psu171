package Thur7Dec;

// Basit Qureshi Dec 7, 2017 7:53:37 AM

import java.util.Scanner;

 
public class method_array4 
{
    public static void main(String [] args)
    {
        int [] A = {1,2,3};
        int [] B = {1, 2, 3};
        
        System.out.println(isEqual(A, B));
        
    }
    
    public static boolean isEqual(int [] A, int [] B)
    {
        if(A.length != B.length)
            return false;
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i] != B[i])
                return false;
            
        }
        return true;
    }
}
