package Tue3Oct;

// Basit Qureshi Oct 3, 2017 9:07:11 AM

import java.util.Scanner;

 
public class Input2 
{
    public static void main(String [] args)
    {
        Scanner Input = new Scanner(System.in);
        
        int age = Input.nextInt();
        System.out.println(age);
        
        double gpa = Input.nextDouble();
        System.out.println(gpa);
        
        //String firstName = Input.next();
        //System.out.println(firstName);
        
        Input.nextLine(); //clean BUFFER
       
        String sentence = Input.nextLine();
        System.out.println(sentence);
        
        
        
       
    }
}
