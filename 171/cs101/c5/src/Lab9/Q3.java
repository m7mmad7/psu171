package Lab9;

// Basit Qureshi Nov 16, 2017 7:50:43 AM

import java.util.Scanner;

 
public class Q3
{
    public static void main(String [] args)
    {
        
        Scanner In = new Scanner(System.in);
        System.out.println("Please Enter a sentence...");
        String S = In.nextLine();
        S = S + " ";
        
        System.out.println("Please enter a pre-fix word");
        String preFix = In.next();
        
        String currentWord = "";
        int pos = 0;
        int i = 0;
        
        boolean FOUND = false;
        while(true)
        {
            if(S.charAt(i)== ' ')
            {
                if(currentWord.contains(preFix) == true)
                {
                    System.out.println(preFix + " found at position " + pos);
                    FOUND = true;
                    break;
                }
                pos = i+1;
            }
            currentWord = currentWord + S.charAt(i);
            i++;
            
            if(i >= S.length())
                break;
        }
        if(!FOUND)
            System.out.println(preFix + " was not found..");
    }
}
