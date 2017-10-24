package Lab6;

// Basit Qureshi Oct 24, 2017 8:38:48 AM

import java.util.Random;

 
public class Q5
{
    public static void main(String [] args)
    {
        Random R = new Random();
        int house = R.nextInt(4);
        String house1="";
        switch(house)
        {
            case 0: house1 = "Clubs"; break;
            case 1: house1 = "Diamonds"; break;
            case 2: house1 = "Hearts"; break;
            case 3: house1 = "Spades"; break;
        }
        
        int rank = R.nextInt(13) + 1;
        String rank1="";
        switch(rank)
        {
            case 1: rank1 = "Ace";break;
            case 2: rank1 = "2";break;
            case 3: rank1 = "3";break;
            case 4: rank1 = "4";break;
            case 5: rank1 = "5";break;
            case 6: rank1 = "6";break;
            case 7: rank1 = "7";break;
            case 8: rank1 = "8";break;
            case 9: rank1 = "9";break;
            case 10: rank1 = "10";break;
            case 11: rank1 = "Joker";break;
            case 12: rank1 = "Queen";break;
            case 13: rank1 = "King";break;
            
        }
        System.out.println(rank1 + " of " + house1);
        
    }
}
