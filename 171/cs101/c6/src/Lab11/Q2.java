package Lab11;

// Basit Qureshi Nov 26, 2017 9:52:21 AM

import java.util.Scanner;

 
public class Q2 
{
    public static void main(String [] args)
    {
        Scanner In = new Scanner(System.in);
        System.out.println("Please Enter month number [1 to 12]");
        int month = In.nextInt();
        System.out.println(arabicMonth(month));
    }
    public static String arabicMonth(int m)
    {
        String month = "";
        switch(m)
        {
            case 1: month = "Muharram";break;
            case 2: month = "Safar";break;
            case 3: month = "Rabi I";break;
            case 4: month = "Rabi II";break;
            case 5: month = "Jumada I";break;
            case 6: month = "Jumada II";break;
            case 7: month = "Rajab";break;
            case 8: month = "Shaban";break;
            case 9: month = "Ramadan";break;
            case 10: month = "Shawal";break;
            case 11: month = "Zu Qad";break;
            case 12: month = "Zu Hajj";break;
            default: month = "Wrong input";
        }
        return month;
    }
    
}
