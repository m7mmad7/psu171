package Lab13;

// Basit Qureshi Dec 12, 2017 8:03:53 AM
import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) 
    {
        Scanner In = new Scanner(System.in);
        double [] D = input(In);
        System.out.println("Std Dev: " + standardDeviation(D));
    }
    
    public static double [] input(Scanner In)
    {
        System.out.println("Enter 10 values  ");
        
        double [] A = new double[10];
        
        for(int i=0;i<A.length;i++)
            A[i] = In.nextDouble();
        return A;
    }
    
    public static double mean(double [] D)
    {
        double sum = 0;
        for(double e: D)
            sum+= e;
        return sum/D.length;
    }
    
    public static double standardDeviation(double []X)
    {
        double mean = mean(X);
        
        double num = 0;
        
        for(int i=0;i<X.length;i++)
        {
            num += (X[i]-mean)*(X[i]-mean);
        }
        
        return Math.sqrt(num/(X.length-1));
        
        
    }
    
    
}