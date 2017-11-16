package Lab9;

// Basit Qureshi Nov 16, 2017 7:50:43 AM

import java.util.Scanner;

 
public class Q2
{
    public static void main(String [] args)
    {
        
        Scanner In = new Scanner(System.in);
        System.out.println("Please Enter a sentence...");
        String S = In.nextLine();
        S = S + " ";
        String longestWord = "";
        String thisWord ="";
        
        for(int i=0; i<S.length() ;i++)
        {
                        
            if(S.charAt(i)==' ')
            {
                // a word is complete
                if(thisWord.length()>longestWord.length())
                {
                    longestWord = thisWord;
                }
                thisWord = "";
                continue;
            }
            thisWord = thisWord + S.charAt(i);

        }
        System.out.println("Longest Word is " + longestWord);
        
    }
}
