package Sun8Oct;

// Basit Qureshi Oct 8, 2017 7:54:25 AM

import java.util.Scanner;

//Topics for today
//Operators + assignments
//inrement / decrement
//power
//type conversion
//printf

 
public class Operators2 
{
    public static void main(String [] s)
    {
        Scanner Shasha = new Scanner(System.in);
        
        System.out.println("Please type your age!");
        int age = Shasha.nextInt();
        
        age += 5;
        System.out.println("Your age after 5 years: " + age);
        
        System.out.println("How much money you have!");
        double money = Shasha.nextDouble();
        
        money *= 10;
        //money = money * 10;
        System.out.println("Multiplying!!" + money);
        
        
    }
}
