package Midterm;

// Basit Qureshi Nov 9, 2017 1:42:07 PM
 
public class Q1 
{
    public static void main(String [] args)
    {
        //part 1
        System.out.println(Math.pow(2 + Math.min(1 , 2), Math.abs(-2)));
        //will give 9.0
        
        //part 2
        System.out.println("3 * 1\n" + (1 / (2 + 2)));
        
        //part 3
        System.out.printf("%-5.2f", Math.pow(2, 2));
        
        
        System.out.println();
        //part 4
        String s1 = "MidTerm Exam";
        if(s1.charAt(0)=='M')
            System.out.println(s1.toUpperCase());
        else
            System.out.println(s1.toLowerCase());
        
        //part 5
        int i = 2;
        System.out.println(3 + i++);
        System.out.println(i);
        
        
        //part 6
        int n = 1;
        switch(n)
        {
            case 1:
            case 2: System.out.println("2");
            case 3: break;
            default: System.out.println("3");
        }
        
        //part 7
        System.out.println(3 + 4 >= 7 && !(2 - 1 < 8));
        
    }
}
