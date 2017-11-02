package Lab7;

// Basit Qureshi Nov 2, 2017 8:11:03 AM
import java.util.*;
public class Q7
{
    public static void main(String [] args)
    {
        Random R = new Random();
        int number = R.nextInt(9999)+1;
        
        
        //now generating string of length 3.
        //System.out.println((char)65);
        //Codes for characters start at 97 up to 122
        //there are 26 characters in English
        
        char c1 = (char) (R.nextInt(27) + 97);
        char c2 = (char) (R.nextInt(27) + 97);
        char c3 = (char) (R.nextInt(27) + 97);
        
        String NumberPlate = "" + c1 + c2 + c3 + " " + number;
        
        System.out.println(NumberPlate.toUpperCase());
    }
}
