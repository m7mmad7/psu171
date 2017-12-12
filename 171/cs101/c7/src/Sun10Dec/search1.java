package Sun10Dec;

// Basit Qureshi Dec 10, 2017 8:03:23 AM

import java.util.Random;

 
public class search1 
{
    public static void main(String [] args)
    {
        int [] key = createIntArray(10);
        printAll(key);
        
        fillArray(key, -10, 10);
        printAll(key);
        
        //search(5);
        System.out.println(Search(key, 5));
        
        System.out.println(SearchPosition(key, 5));
        
        int pos= SearchPosition(key,5);
        if(pos==-1)
            System.out.println("Not found");
        else
            System.out.println("found at: "+ pos );
    }
    
    public static int [] createIntArray(int size)
    {
        int [] key = new int [size];
        return key;
    }
    
    public static void fillArray(int [] A, int minRange, int maxRange)
    {
        Random R = new Random();
        for(int i=0;i < A.length;i++)
        {
            A[i] = minRange + R.nextInt(maxRange-minRange) ;// 00 to 10
        }
        return;//redundant
    }
    
    public static void printAll(int [] A)
    {
        for(int i=0;i<A.length;i++)
            System.out.print(A[i] + " ");
        
        System.out.println();
    }
    
    public static boolean Search(int [] A, int item)
    {
        boolean found = false;
        for(int i=0;i<A.length;i++)
        {
            if(A[i] == item)
            {
                found= true;
                break;
            }
        }
        return found;
    }
    
    public static int SearchPosition(int [] A, int item)
    {
        int position = -1;
        for(int i=0;i<A.length;i++)
        {
            if(A[i] == item)
            {
                position = i;
                break;
            }
        }
        
        return position;
    }
    
}
