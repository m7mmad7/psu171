package Lab11;

// Basit Qureshi Nov 26, 2017 9:52:21 AM
 
public class Q1 
{
    public static void main(String [] args)
    {
        System.out.println(countLetters("Hello 123."));
    }
    public static int countLetters(String s)
    {
        int count=0;
        s = s.toUpperCase();
        for(int i=0;i<s.length();i++)
        {
            //code for s.charAt(i)
            int code = s.charAt(i);
            if(code <=90 && code >=65)
                count++;
        }
        return count;
    }
    
}
