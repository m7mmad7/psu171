package Tue3Oct;

// Basit Qureshi Oct 3, 2017 8:11:49 AM
public class Artihmatic3 {

    public static void main(String[] args) {

        System.out.println(1 + 3);
        System.out.println("1 + 3");
        
        //arithmatic rule:
        // double with double -> double
        // int with double -> double
        // double with int -> double
        // int with int -> int
        
        System.out.println(3 / 2); //loss of precision-> loss all decimal places
        System.out.println(3 / 2.0);
        System.out.println(3.0 / 2);
        System.out.println(3.0 / 2.0);
        
        System.out.println(1 + (3 - 2));
        System.out.println(1.0 + (3 - 2));
        System.out.println((3 / 2.0) - 0.5); // 1.0
        System.out.println((3 / 2) - 0.5);// 0.5
        
        
    }
}
