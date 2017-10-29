package Sun29Oct;

// Basit Qureshi Oct 29, 2017 7:57:33 AM
 
public class Str2
{
    public static void main(String [] s)
    {
       
        String s1 = "Hello";
        String s2 = "World";
        
        String s3 = s1 + s2; //+ means to put together (concatenate)
        System.out.println(s3);
        
        String s4 = s1.concat(s2);
        System.out.println(s4);
        
        String s5 = s1 + s2;
        s5 += s1;   // s5 = s5 + s1  "HelloWorld" + "Hello" = HelloWorldHello
        System.out.println(s5);
        
        s5 = s1 + " " + s2;
        System.out.println(s5);
    }
}
