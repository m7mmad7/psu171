package Tue3Oct;

// Basit Qureshi Oct 3, 2017 8:45:54 AM
 
public class String1 
{
    public static void main(String [] args)
    {
        String str;
        str = "Hello.. Whats up!!";
        
        System.out.println(str);
        
        System.out.println("Hello" + 1);
        
        //String + anything will give string
        //int + string with give string
        //double + string will give string
        
        System.out.println(1 + "Hello");
     
        System.out.println(1 + 2 + "Hello"); //3Hello
        System.out.println("Hello" + 1 + 2); //Hello12
        System.out.println("Hello" + (1 + 2));//Hello3
        
        //System.out.println("Hello" * 3);
        //Only ONE operation of string is allowed: +
        // + for string means con-cat-ination
        // which means to put together
        
        System.out.println("Hello" + " " + 1);
        
    }
}
