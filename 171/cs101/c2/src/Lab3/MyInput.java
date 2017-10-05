package Lab3;

// Basit Qureshi Oct 5, 2017 8:06:27 AM

import java.util.Scanner;

 
public class MyInput 
{
    public static void main(String [] args)
    {
        System.out.println("My First Java Input program!");
        
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Please type your name?");
        String name = Input.next();
        
        System.out.println("Please type your age");
        int age = Input.nextInt();
        
        System.out.println("Please type your GPA");
        double gpa = Input.nextDouble();
        
        System.out.println("---------------------------------");
        System.out.println("Hello " + name + ". You are " + age +
                " years old. Your GPA is " + gpa + ".");
        System.out.println("---------------------------------");
        
        
    }
}
