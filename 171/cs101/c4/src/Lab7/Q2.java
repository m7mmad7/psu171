package Lab7;

// Basit Qureshi Oct 31, 2017 8:11:03 AM
import java.util.*;
public class Q2 
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        
        System.out.println("Enter Code? ");
        String code = In.next();
        code = code.toUpperCase();
        
        
        String str_major = "";
        String str_year = "";
        
        switch(code.charAt(0))
        {
            case 'C': str_major = "Computer Science";
                      break;
            case 'U': str_major = "Construction Engineering";
                      break;
            case 'N': str_major = "Network Engineering";
                      break;
            case 'I': str_major = "Information Systems";
                      break;
            default:    
                      str_major = "Error";
        }
        
        if(code.charAt(1)=='1')
            str_year = "freshman";
        else if(code.charAt(1)=='2')
            str_year = "sophomore";
        else if(code.charAt(1)=='3')
            str_year = "junior";
        else if(code.charAt(1)=='4')
            str_year = "senior";
        else
            str_year = "Error";
        
        if(str_major.equals("Error") ||
                str_year.equals("Error"))
            System.out.println("Wrong Input!");
        else
            System.out.println("You are \"" +
                    str_year + "\" in \"" +
                    str_major + "\"");
    }
}
