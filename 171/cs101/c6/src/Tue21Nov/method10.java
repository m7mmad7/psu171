package Tue21Nov;

// Basit Qureshi Nov 21, 2017 7:55:35 AM
 
public class method10
{
    public static void main(String [] str)
    {
        int Number = 3;
        double doNothing = 10;
       // printNlines(doNothing, Number);
        printNlines(Number, (int)doNothing);

    }
    
    public static void printNlines(double D, int N)//parameter.... param
    {
        for(int i=0; i < N; i++)
        {
            System.out.println(D);
        }
    }
}
