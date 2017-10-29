package Sun29Oct;

// Basit Qureshi Oct 29, 2017 7:57:33 AM
 
public class Str3
{
    public static void main(String [] s)
    {
        String s1 = "C";
        
        System.out.println(s1);
        System.out.println(s1.compareTo("B"));
        
        if(s1 == "H") // NOT SAFE!!!! DO NOT USE
            System.out.println("same");
        else
            System.out.println("Not same");
        
        System.out.println("A".compareTo("B")); // will give -1 because A comes before B
        System.out.println("D".compareTo("C")); // will give 1 because C comes after B
        
        System.out.println("Hi".compareTo("Hi")); // will give 0
        
    }
}
