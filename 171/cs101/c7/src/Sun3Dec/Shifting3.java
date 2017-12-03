package Sun3Dec;

// Basit Qureshi Dec 3, 2017 8:05:20 AM
 
public class Shifting3
{
    public static void main(String [] s)
    {
        int [] ptr = {1,2,3,4,5,6,7,8,9};
        
        // this is RIGHT shift
        int temp = ptr[ptr.length-1];
        
        
        for(int i=ptr.length-1; i>0;i--)
        {
            ptr[i] = ptr[i-1];
            
        }
        ptr[0] = temp;
        
        for(int i:ptr)
            System.out.print(i + " ");
        
        
        
    }
}
