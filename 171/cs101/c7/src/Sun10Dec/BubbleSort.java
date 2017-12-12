package Sun10Dec;

// Basit Qureshi Dec 10, 2017 8:03:23 AM

 
public class BubbleSort 
{
    public static void main(String [] args)
    {
        int [] B = {6,2,4,8,9,1,5,3,7};
        
        search1.printAll(B);
        
        bubbleSort(B);
        
        search1.printAll(B);
    
    }
    
    
    public static void bubbleSort(int [] A)
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                if(A[i]<A[j])
                {
                    //swap
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        
    }
    
}
