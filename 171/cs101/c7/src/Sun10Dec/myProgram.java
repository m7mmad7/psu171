package Sun10Dec;

// Basit Qureshi Dec 10, 2017 8:03:23 AM

 
public class myProgram // Command Line Arguments 
{
    public static void main(String [] args)
    {
        System.out.println("Welcome to this program");
        int sum = 0;
        for(int i=0;i<args.length;i++)
        {
            sum = sum + Integer.parseInt(args[i]);
        }
        
        System.out.println("sum is: " + sum);
        
        
    
    }
    
    
        
    
    
}
