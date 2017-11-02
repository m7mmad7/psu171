package Lab7;

// Basit Qureshi Nov 2, 2017 8:11:03 AM
import java.util.*;
public class Q6
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        String c1, c2, c3;
        System.out.println("Enter Names of 3 cities");
        c1 = In.next();
        c2 = In.next();
        c3 = In.next();
        
        if(c1.compareTo(c2)<0 && c1.compareTo(c3)<0)
            //c1 comes first... c2 and c3 is second or third
        {
            if(c2.compareTo(c3)<0)
                //c2 comes second..
            {
                System.out.print(c1 + " " + c2 + " " + c3);
            }
            else
                System.out.print(c1 + " " + c3 + " " + c2);
            
        }
        else if(c2.compareTo(c1)<0 && c2.compareTo(c3)<0)
            //c2 comes first... c1 and c3 is second or third
        {
            if(c1.compareTo(c3)<0)
                //c1 comes second..
            {
                System.out.print(c2 + " " + c1 + " " + c3);
            }
            else
                System.out.print(c2 + " " + c3 + " " + c1);
            
        }
        else if(c3.compareTo(c1)<0 && c3.compareTo(c2)<0)
            //c3 comes first... c1 and c2 is second or third
        {
            if(c1.compareTo(c2)<0)
                //c1 comes second..
            {
                System.out.print(c3 + " " + c1 + " " + c2);
            }
            else
                System.out.print(c3 + " " + c2 + " " + c1);
            
        }
    }
}
