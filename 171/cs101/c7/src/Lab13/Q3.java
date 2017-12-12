package Lab13;

// Basit Qureshi Dec 12, 2017 8:03:53 AM
import java.util.Random;
import java.util.Random;

public class Q3 {

    public static void main(String[] args) {
        Random R = new Random();

        int[] A = new int[10];
        for (int i = 0; i < A.length; i++) {
            A[i] = R.nextInt(100);
        }

        System.out.println(average(A));
    }

    public static int average(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        System.out.println("Hey! I am integer method!");
        return sum / A.length;
    }

    public static double average(double[] A) {
        double sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        return sum / A.length;
    }

}
