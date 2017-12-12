package Lab13;

// Basit Qureshi Dec 12, 2017 8:03:53 AM
import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) 
    {
        Scanner In = new Scanner(System.in);
        
        System.out.println("Enter size of list 1");
        int size_1 = In.nextInt();
        
        int [] A = new int [size_1];
        System.out.println("Now please enter "+ size_1+ " integers...");
        for(int i=0;i<size_1;i++)
        {
            A[i] = In.nextInt();
        }
    
        System.out.println("Enter size of list 2");
        int size_2 = In.nextInt();
        
        int [] B = new int [size_2];
        System.out.println("Now please enter "+ size_2+ " integers...");
        for(int i=0;i<size_2;i++)
        {
            B[i] = In.nextInt();
        }
        
        
        System.out.println("Strictly identical? " + equals(A,B));
    
    }
    
    public static boolean equals(int [] list1, int [] list2)
    {
        if(list1.length!=list2.length)
            return false;
        
        //we are sure that both arrays now have the same size
        
        for(int i=0;i<list1.length;i++)
        {
            if(list1[i] != list2[i])
                return false;
            
        }
        
        return true;
    }
    
}