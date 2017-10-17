package Tue17Oct;

// Basit Qureshi Oct 17, 2017 8:14:00 AM
 
public class boolean2
{
    public static void main(String [] args)
    {
        boolean newLine;
        int count = 10;
        if (count % 10 == 0) 
            newLine = false;
        else
            newLine = true;
        //equivalent
        newLine = count % 10 != 0;
        
        
        
    }
}
