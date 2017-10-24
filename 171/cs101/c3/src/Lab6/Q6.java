package Lab6;

// Basit Qureshi Oct 24, 2017 8:38:48 AM

import java.util.Scanner;

 
public class Q6
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        System.out.println("Enter day# (0 Sunday)(1 Monday)"
                + "(2 Tuesday)(3 Wednesday)(4 Thursday)"
                + "(5 Friday)(6 Saturday)");
        int day = In.nextInt();
        System.out.println("Enter days to add");
        int add = In.nextInt();
        
        int future = (day + add) % 7;
        switch(future)
        {
            case 0: System.out.println("Sunday");break;
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wedneday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;            
        }
        
    }
}
