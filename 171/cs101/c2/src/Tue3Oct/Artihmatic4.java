package Tue3Oct;

// Basit Qureshi Oct 3, 2017 8:11:49 AM
public class Artihmatic4 {

    public static void main(String[] args) {

        System.out.println( 3 * (4 - 2)); //6
        
        //Order of precedence rules
        //always read from left to right
        // Most important is ()
        // then * / %
        // then + -
        
        System.out.println((4 - 3.0) + (3.0 - 2) * 2);
                        //  1.0 + (3.0 - 2) * 2
                        //  1.0 + 1.0 * 2
                        //  1.0 + 2.0
                        //  3.0
        System.out.println(4 * 2 * (4 - 2) / 2.0);
                        //  4 * 2 * 2 / 2.0
                        //  8 * 2 / 2.0
                        //  16 / 2.0
                        //  8.0
        
        
        
        
    }
}
