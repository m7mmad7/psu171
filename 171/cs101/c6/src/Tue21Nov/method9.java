package Tue21Nov;

// Basit Qureshi Nov 21, 2017 7:55:35 AM
 
public class method9 
{
    public static void main(String [] str)
    {
        String envelope = "Hello";
        int Number = 33;
        int doNothing = 0;
        printNlines(envelope, Number);
    }
    
    public static void printNlines(String dharf, int N)//parameter.... param
    {
        for(int i=0; i < N; i++)
        {
            System.out.println(dharf);
        }
    }
}
