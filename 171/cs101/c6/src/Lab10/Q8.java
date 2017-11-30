package Lab10;

// Basit Qureshi Nov 23, 2017 8:32:14 AM
 
public class Q8 
{
    public static void main(String [] str)
    {
        
        System.out.println("Feet\t\tMeters\t|\tMeters\t\tFeet");
        System.out.println("____\t\t______\t \t______\t\t____");
        double j = 20;
        for(double i=1.0;i<=10.0;i++)
        {
            //System.out.println(i + "\t\t" + feetToMeters(i) + "\t|\t" + j + "\t\t" + metersToFeet(j));
            
            
            System.out.printf("%4.1f\t\t%5.3f\t|\t",i,feetToMeters(i));
            System.out.printf("%4.1f\t\t%5.3f\n",j,metersToFeet(j));
            j=j+5;
            
        }
        
        
    }
    
    public static double feetToMeters(double feet)
    {
        return 0.305 * feet;
    }
    public static double metersToFeet(double meters)
    {
        return 3.279 * meters;
    }
    
    
}