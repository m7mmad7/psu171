package Lab7;

// Basit Qureshi Nov 2, 2017 8:11:03 AM
import java.util.*;
public class Q8
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
        
        char c1a=' ', c1b=' ', c1c=' ';
        
        String NumberPlate = "" + c1 + c2 + c3 + " " + number;
        
        switch(c1)
        {
            case 'a': c1a = '\u0627';break;
            case 'b': c1a = '\u0628';break;
            case 'c': c1a = '\u067a';break;
            case 'd': c1a = '\u062b';break;
            case 'e': c1a = '\u062c';break;
            case 'f': c1a = '\u062d';break;
            case 'g': c1a = '\u062e';break;
            case 'h': c1a = '\u062f';break;
            case 'i': c1a = '\u0630';break;
            case 'j': c1a = '\u0631';break;
            case 'k': c1a = '\u0632';break;
            case 'l': c1a = '\u0633';break;
            case 'm': c1a = '\u0634';break;
            case 'n': c1a = '\u0635';break;
            case 'o': c1a = '\u0636';break;
            case 'p': c1a = '\u0637';break;         
            case 'q': c1a = '\u0638';break;
            case 'r': c1a = '\u0639';break;
            case 's': c1a = '\u063a';break;
            case 't': c1a = '\u0641';break;
            case 'u': c1a = '\u0642';break;
            case 'v': c1a = '\u0643';break;
            case 'w': c1a = '\u0644';break;    
            case 'x': c1a = '\u0645';break;
            case 'y': c1a = '\u0646';break;
            case 'z': c1a = '\u0647';break;
        }
        
        switch(c2)
        {
            case 'a': c1b = '\u0627';break;
            case 'b': c1b = '\u0628';break;
            case 'c': c1b = '\u067a';break;
            case 'd': c1b = '\u062b';break;
            case 'e': c1b = '\u062c';break;
            case 'f': c1b = '\u062d';break;
            case 'g': c1b = '\u062e';break;
            case 'h': c1b = '\u062f';break;
            case 'i': c1b = '\u0630';break;
            case 'j': c1b = '\u0631';break;
            case 'k': c1b = '\u0632';break;
            case 'l': c1b = '\u0633';break;
            case 'm': c1b = '\u0634';break;
            case 'n': c1b = '\u0635';break;
            case 'o': c1b = '\u0636';break;
            case 'p': c1b = '\u0637';break;         
            case 'q': c1b = '\u0638';break;
            case 'r': c1b = '\u0639';break;
            case 's': c1b = '\u063a';break;
            case 't': c1b = '\u0641';break;
            case 'u': c1b = '\u0642';break;
            case 'v': c1b = '\u0643';break;
            case 'w': c1b = '\u0644';break;    
            case 'x': c1b = '\u0645';break;
            case 'y': c1b = '\u0646';break;
            case 'z': c1b = '\u0647';break;
        }
        
        switch(c3)
        {
            case 'a': c1c = '\u0627';break;
            case 'b': c1c = '\u0628';break;
            case 'c': c1c = '\u062a';break;
            case 'd': c1c = '\u062b';break;
            case 'e': c1c = '\u062c';break;
            case 'f': c1c = '\u062d';break;
            case 'g': c1c = '\u062e';break;
            case 'h': c1c = '\u062f';break;
            case 'i': c1c = '\u0630';break;
            case 'j': c1c = '\u0631';break;
            case 'k': c1c = '\u0632';break;
            case 'l': c1c = '\u0633';break;
            case 'm': c1c = '\u0634';break;
            case 'n': c1c = '\u0635';break;
            case 'o': c1c = '\u0636';break;
            case 'p': c1c = '\u0637';break;         
            case 'q': c1c = '\u0638';break;
            case 'r': c1c = '\u0639';break;
            case 's': c1c = '\u063a';break;
            case 't': c1c = '\u0641';break;
            case 'u': c1c = '\u0642';break;
            case 'v': c1c = '\u0643';break;
            case 'w': c1c = '\u0644';break;    
            case 'x': c1c = '\u0645';break;
            case 'y': c1c = '\u0646';break;
            case 'z': c1c = '\u0647';break;
        }
        String NumberPlateArabic = "" + c1a + " "+ c1b +" "+ c1c + " " + number;
        
        
        
        
        System.out.println(NumberPlate.toUpperCase());
        System.out.println(NumberPlateArabic);
    }
}
