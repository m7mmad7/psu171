package Sun29Oct;

// Basit Qureshi Oct 29, 2017 7:57:33 AM

import java.util.Scanner;

 
public class Str9
{
    public static void main(String [] s)
    {
        Scanner In = new Scanner(System.in);
        
        String s1 = "Long sentence";
        
        /*
        
        Long senten_c_e          //ignore _
        0123456789101112
        
        */
        
        System.out.println(s1.substring(5)); //start position 5 upto the end
        System.out.println(s1.substring(5, 9)); //start at 5 end at 9. DO NOT INCLUDE 9
        
        
        System.out.println(s1.indexOf("sen"));
        //find sen.. if it is there then give me the starting position of sen
        //gives 5
        
        
        
        
        
        
    }
}
