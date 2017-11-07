package Lab8;

// Basit Qureshi Nov 7, 2017 8:38:59 AM

import java.util.Scanner;

 
public class Q4
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        System.out.println("How many students?");
        int N = In.nextInt();
        
        System.out.println("Enter Name and GPA?");
            
        int count = 0;
        double maxGPA = 0;
        String maxName = "";
        
        double max2GPA = 0;
        String max2Name = "";
        
        while(count < N)
        {
            String Name = In.next();
            double GPA = In.nextDouble();
            
            if(GPA > maxGPA)
            {
                max2GPA = maxGPA;
                max2Name = maxName;
                
                maxGPA = GPA;
                maxName = Name;
            }
            
            count++;
        }
        
        System.out.println("Student with max GPA is: " + maxName);
        System.out.println("2nd is: " + max2Name);
        
    }
}
