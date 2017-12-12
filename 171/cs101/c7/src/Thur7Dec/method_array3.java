package Thur7Dec;

// Basit Qureshi Dec 7, 2017 7:53:37 AM

import java.util.Scanner;

 
public class method_array3 
{
    public static void main(String [] args)
    {
        int [] A = {1,2,3};
        int [] B = {8,9,4,5};
        
        int [] C = mergeTwoArrays(A, B);
        
        method_array2.printAll(C);
        
    }
    
    public static int [] mergeTwoArrays(int [] X, int [] Y)
    {
        int [] C = new int [X.length + Y.length];
        
        for(int i=0;i<X.length;i++)
        {
            C[i] = X[i];
        }
       
        int count = X.length;
        
        for(int i=0;i<Y.length;i++)
        {
            C[count + i] = Y[i];
        }
            
        return C;
    }
    
}
