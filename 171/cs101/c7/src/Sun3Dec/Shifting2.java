package Sun3Dec;

// Basit Qureshi Dec 3, 2017 8:05:20 AM
 
public class Shifting2
{
    public static void main(String [] s)
    {
        int [] ptr = {1,2,3};
        
        
        // this is LEFT shift
        int temp = ptr[0]; //ptr[ptr.length-1];
        
        //ptr[0] = ptr[1];
       // ptr[1] = ptr[2];
        //ptr[2] = temp;
        
        for(int i=0; i< ptr.length - 1;i++)
        {
            ptr[i] = ptr[i+1];
            
        }
        ptr[ptr.length-1] = temp;
        
        for(int i:ptr)
            System.out.println(i);
        
        
        
    }
}
