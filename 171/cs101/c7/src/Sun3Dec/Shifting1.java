package Sun3Dec;

// Basit Qureshi Dec 3, 2017 8:05:20 AM
 
public class Shifting1
{
    public static void main(String [] s)
    {
        int [] ptr = {1,2,3};
        
        //shift right all values.... we want to see 3 1 2
        
        ptr[1] = ptr[0];
        
        ptr[2] = ptr[1];
        
        ptr[0] = ptr[2];
        
        for(int i:ptr)
            System.out.println(i+ " ");
        
        System.out.println();
        // so this doesnot work!!!!
        
        //reset values
        ptr[0] = 1;
        ptr[1] = 2;
        ptr[2] = 3;
        
        // this is  shift
        int temp = ptr[0]; //ptr[ptr.length-1];
        
        ptr[0] = ptr[1];
        ptr[1] = ptr[2];
        ptr[2] = temp;
        
        for(int i:ptr)
            System.out.print(i + " ");
        
    }
}
