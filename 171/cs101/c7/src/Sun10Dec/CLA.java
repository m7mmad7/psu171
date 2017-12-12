package Sun10Dec;

// Basit Qureshi Dec 10, 2017 8:03:23 AM

 
public class CLA // Command Line Arguments 
{
    public static void main(String [] args)
    {
        System.out.println("Welcome to this program");
        
        if(args.length!=0)
        {
            
            for(int i=0;i<args.length;i++)
                System.out.println(args[i]);
            
            
        }
        
        
    
    }
    
    
        
    
    
}
