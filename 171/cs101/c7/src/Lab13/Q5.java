package Lab13;

// Basit Qureshi Dec 12, 2017 8:03:53 AM
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.println("Enter information for five students"
                + " id gpa name");

        int[] ID = new int[5];
        String[] Name = new String[5];
        double[] GPA = new double[5];

        for (int i = 0; i < 5; i++) {
            ID[i] = In.nextInt();
            GPA[i] = In.nextDouble();
            Name[i] = In.nextLine();
        }

        Best(ID, Name, GPA);
    }

    public static void Best(int[] id, String[] name, double[] gpa) {
        //find the position for max gpa
        int pos = 0;
        double max = gpa[0];
        for (int i = 0; i < gpa.length; i++) {
            if (max < gpa[i]) {
                pos = i;
                max = gpa[i];
            }
        }

        //now pos contains the max gpa
        System.out.println(id[pos] + " " + gpa[pos] + " " + name[pos]);
    }
}
