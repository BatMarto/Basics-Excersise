    package Cycles;

    import java.util.*;
    public class multiplyTable {
        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);

            for (int h = 1; h <= 10 ; h++) {
                for (int m = 1; m <= 10; m++) {
                    int prod = h * m;
                    System.out.printf("%d * %d = %d%n", h , m, prod);
                }
            }



        }


    }
