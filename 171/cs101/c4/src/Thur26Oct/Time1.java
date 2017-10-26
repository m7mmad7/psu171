package Thur26Oct;

// Basit Qureshi Oct 26, 2017 8:12:40 AM
 
public class Time1 
{
    public static void main(String [] args)
    {
        long time1=System.currentTimeMillis();
        System.out.println(time1);
        
        long seconds = time1 / 1000;
        System.out.println(seconds);
        
        long minutes = seconds / 60;
        System.out.println(minutes);
        
        long hours = minutes / 60;
        System.out.println(hours);
        
        long days = hours / 24;
        System.out.println(days);
        
        long years = days / 365;
        System.out.println(years);
    }
}
