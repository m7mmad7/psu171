package Sun8Oct;

// Basit Qureshi Oct 10, 2017 7:57:01 AM
 
public class printf1 
{
    public static void main(String [] s)
    {
        System.out.println("Hello world! 123");
        
        System.out.print("Hello World 123");
        System.out.println("This is supposed to be on the next line!!!");
        
        System.out.println();
        
        System.out.printf("%d", 123);
        // %d is for printing digits i.e. int and long
        
        System.out.printf(" %d",1 ,2);
        System.out.printf("Hello %d World!", 100);
        
        System.out.println();
        System.out.print("\n");
        

        //%f is for printing floating point numbers i.e. float and double
        System.out.printf("%f", 1.2);
        
        System.out.printf("\n%f", 100.52);
        
        System.out.printf("\n%8.2f", 1.5);
        
        System.out.printf("\n%8.3f", 1.1);
        
        System.out.printf("\n%8.4f", 3.225); //by default.. align right
        
        System.out.printf("\n%-8.4f", 3.225); //align left
        
        
        
        // %s is for strings
        
        System.out.printf("Hello %s world", "!");
        
        
        
        
    }
}
