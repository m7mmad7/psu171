package Sun3Dec;

// Basit Qureshi Dec 3, 2017 8:05:20 AM
 
public class Copy1
{
    public static void main(String [] s)
    {
        int [] ptr = {1,2,3};
        
        double [] D;
        
       // D =  ptr; // not allowed
        
       // D = new int [3]; //not allowed
        
        D = new double [3];
        
        
        D[0] = ptr[0];
        D[1] = ptr[1];
        D[2] = ptr[2];
        
        for(int i=0;i<D.length;i++)
            D[i] = ptr[i];
        
        for(int i:ptr)
            System.out.println(i);
        
        for(double i:D)
            System.out.println(i);
        
    }
}
