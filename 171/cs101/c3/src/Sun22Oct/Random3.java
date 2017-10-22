package Sun22Oct;

// Basit Qureshi Oct 22, 2017 8:49:32 AM

import java.util.Random;

 
public class Random3 
{
    public static void main(String [] args)
    {
        Random R = new Random();
        
        int r1 = R.nextInt();
        System.out.println(r1);
        
        int r2 = R.nextInt(15); // 0 upto 15... 15 not included
        System.out.println(r2);
        
        //range
        int r3 = -15 + R.nextInt(30); // -15  upto 14
                   //    ----------
                   //   0 to 29 ... 30 not included
                // -15 +0    ... -15 + 29  
                // -15  ...      14
        System.out.println(r3);
    
        int r4 = -100 + R.nextInt(501); // -100  upto 401
        //       -100 + (0  ... 500)
        //       -100 + 0 ... -100 + 500
        //       -100    ... 400
        System.out.println(r4);
    }
}
