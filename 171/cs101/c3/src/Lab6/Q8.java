package Lab6;

// Basit Qureshi Oct 24, 2017 8:38:48 AM

import java.util.Random;
import java.util.Scanner;

 
public class Q8
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        Random R = new Random();
        System.out.println("scissor (0), rock (1), paper (2):");
        int user = In.nextInt();
        int computer = R.nextInt(3);
        
        switch(user)
        {
            case 0: //user is scissor. scissor can cut paper
                switch(computer)
                {
                    case 1: // computer is rock. 
                        System.out.println("Computer is Rock. You are Scissors. Computer wins");
                        break;
                    case 2: //computer is paper
                        System.out.println("Computer is Paper. You are Scissors. You win");
                        break;
                    default: // computer is 0
                        System.out.println("Computer is Scissors. You are Scissors. Draw");
                }
                break;
            case 1: //user is rock. rock can knock scissors
                switch(computer)
                {
                    case 1: // computer is rock. 
                        System.out.println("Computer is Rock. You are Rock. Draw");
                        break;
                    case 2://computer is paper
                        System.out.println("Computer is Paper. You are Rock. Computer  win");
                        break;
                    default: // computer is 0
                        System.out.println("Computer is Scissors. You are Rock. You win");
                }
                break;
            case 2: //user is Paper. Paper can wrap rock
                switch(computer)
                {
                    case 1: // computer is rock. 
                        System.out.println("Computer is Rock. You are Paper. You win");
                        break;
                    case 2://computer is paper
                        System.out.println("Computer is Paper. You are Paper. Draw");
                        break;
                    default: // computer is 0
                        System.out.println("Computer is Scissors. You are Paper. Computer win");
                }
            default:
                System.out.println("Error: Wrong Input");
        }
        
    }
}
