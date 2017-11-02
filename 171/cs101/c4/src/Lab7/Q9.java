package Lab7;

// Basit Qureshi Nov 2, 2017 8:11:03 AM
import java.util.*;
public class Q9
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        String S1 = In.nextLine();
        
        //Hello there. Nice day!
        
        //find space;
        int space = S1.indexOf(" ");
        String word1 = S1.substring(0, space);
        System.out.println(word1);
        
        S1 = S1.substring(space+1);
         //there. Nice day!
        space = S1.indexOf(" ");
        String word2 = S1.substring(0, space);
        System.out.println(word2);
        
        S1 = S1.substring(space+1);
         //Nice day!
        space = S1.indexOf(" ");
        String word3 = S1.substring(0, space);
        System.out.println(word3);
        
        S1 = S1.substring(space+1);
        //day!
        space = S1.indexOf(" ");
        if(space==-1)
            System.out.println(S1);
        
        
        
        
    }
}
