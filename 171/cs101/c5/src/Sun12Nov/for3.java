package Sun12Nov;

// Basit Qureshi Nov 12, 2017 8:03:24 AM
 
public class for3
{
    public static void main(String [] args)
    {
        int xyz = 1;
        
        for(int i = 1; i <= 5 ; i++)
        {
            System.out.println(i);
            xyz++;
        }
        
        //System.out.println(i);// i is out of scope!!
        System.out.println(xyz);
        
        
        
    }
}
