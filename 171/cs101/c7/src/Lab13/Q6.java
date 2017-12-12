package Lab13;

// Basit Qureshi Dec 12, 2017 8:03:53 AM
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) 
    {
        Scanner In = new Scanner(System.in);
        System.out.println("Enter N");
        int N = In.nextInt();
        
        int [] A = new int [N];
        System.out.println("Now please enter N integers...");
        for(int i=0;i<N;i++)
        {
            A[i] = In.nextInt();
        }
    
        System.out.println("sorted? " + isSorted(A));
    
    }
    
    public static boolean isSorted(int [] list)
    {
        for(int i=0;i<list.length-1;i++)
            if(list[i]>list[i+1])
                return false;
        
        return true;
    }
    
}