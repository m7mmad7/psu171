package Lab12;

// Basit Qureshi Dec 5, 2017 8:09:18 AM

import java.util.Scanner;
 
public class Q6 
{
    public static void main(String [] s)
    {
        
        int [] A = new int [10];
        System.out.println("Enter 10 numbers");
        Scanner In = new Scanner(System.in);
        int pos=0;
        
        for(int i=0;i<10;i++)
        {
            int x = In.nextInt();
            //check if x is inside array
            
            boolean FOUND=false;
            for(int j=0;j<pos;j++)
            {
                if(x==A[j])
                {
                    FOUND=true;
                    break;
                }
            }
            
            if(FOUND==true)
                continue;
            else
            {
                //insert the value in array
                A[pos] = x;
                pos++;
            }
        }
        
        //print values
        for(int i=0;i<pos;i++)
            System.out.print(A[i] + " ");
        
    }
}
