package Cycles;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);


        int n = Integer.parseInt(scr.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        boolean special = n % i == 0 && n % j == 0 && n % k == 0 && n % l == 0;
                        if (n >= 1 && n <= 600000 ){
                            if (special) {
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                            }
                    }else{

                        }
                    }
                }

            }

        }
    }
}
