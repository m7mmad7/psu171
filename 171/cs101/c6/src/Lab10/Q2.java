package Lab10;

// Basit Qureshi Nov 23, 2017 8:32:14 AM
 
public class Q2
{
    public static void main(String [] str)
    {
        printChars();
    }
    
    public static void printChars()
    {
        int counter = 0;
        for(char c= '!'; c<= '~';c++ )
        {
            System.out.print(c + " ");
        
            counter++;
            if(counter == 10)
            {
                System.out.println();
                counter=0;
            }
        }
    }
}
