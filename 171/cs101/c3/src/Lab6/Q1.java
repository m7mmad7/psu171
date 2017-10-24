package Lab6;

// Basit Qureshi Oct 24, 2017 8:07:36 AM

import java.util.Random;

 
public class Q1 
{
    public static void main(String [] args)
    {
        Random R = new Random();
        int month = R.nextInt(12) + 1;
        switch(month)
        {
            case 1: System.out.println(month + " Muharram");
                    break;
            case 2: System.out.println(month + " Safar");
                    break;
            case 3: System.out.println(month + " Rabi I");
                    break;
            case 4: System.out.println(month + " Rabi II");
                    break;
            case 5: System.out.println(month + " Jumadi I");
                    break;
            case 6: System.out.println(month + " Jumadi II");
                    break;
            case 7: System.out.println(month + " Rajab");
                    break;
            case 8: System.out.println(month + " Shaban");
                    break;
            case 9: System.out.println(month + " Ramadan");
                    break;
            case 10: System.out.println(month + " Shawal");
                    break;
            case 11: System.out.println(month + " Z'Qada");
                    break;
            case 12: System.out.println(month + " Z'Hajj");
                    break;                    
        }
        
        
        
    }
}
