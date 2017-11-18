package Lab9;

// Basit Qureshi Nov 18, 2017 11:50:43 AM

import java.util.Scanner;

 
public class Q10
{
    public static void main(String [] args)
    {
      
        Scanner In = new Scanner(System.in);
        System.out.println("Enter a sentence");
        
        String S = In.nextLine();
        S = S.toUpperCase();
        
        int vowels = 0;// A E I O U 
        int consonants = 0;//B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, X, Z, and W and Y.
        
        
        for(int i=0 ; i<S.length(); i++)
        {
            char thisChar = S.charAt(i);
            if(thisChar == 'A' || thisChar == 'E' || thisChar == 'I' || thisChar == 'O' || thisChar == 'U')
                vowels ++;
            else
                consonants ++;
            
        }
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants " + consonants);
        
    }
}
