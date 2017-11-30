package Lab11;

// Basit Qureshi Nov 26, 2017 9:52:21 AM

public class Q6
{
    public static void main(String [] str)
    {
        printChars('!','~',5);
    }
    
    public static void printChars(char start, char end, int lines)
    {
        int counter = 0;
        for(char c= start; c<= end;c++ )
        {
            System.out.print(c + " ");
        
            counter++;
            if(counter == lines)
            {
                System.out.println();
                counter=0;
            }
        }
    }
}