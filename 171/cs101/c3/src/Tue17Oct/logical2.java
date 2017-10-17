package Tue17Oct;

// Basit Qureshi Oct 17, 2017 8:53:24 AM

import java.util.Scanner;

 
public class logical2
{
    public static void main(String [] args)
    {
        //boolean logical operators
        int myAge;
        int hisAge;
        
        Scanner In = new Scanner(System.in);
        System.out.println("What is your age?");
        myAge = In.nextInt();
        
        System.out.println("What is your brothers age?");
        hisAge = In.nextInt();
        
        if(myAge == hisAge)
            System.out.println("Twins!");
        else if(myAge > hisAge)
            System.out.println("You are older!");
        else 
            System.out.println("You are younger!");
        
        if(myAge == hisAge && myAge > hisAge)
        {
            //it must be false
        }
        
        if(myAge < hisAge && myAge == 10)
        {
            
        }
        
        if(hisAge > 20 && myAge < 15)
        {
            
        }
        
        if(hisAge == myAge || hisAge > myAge)
        {
            //flase || fasle is false
            //false || true is true
        }
        
        if(hisAge > myAge ^ hisAge < myAge)
        {
            //always true only if ages are not equal
            //if they equal ... it will give false
        }
        
    }
}
