package Cycles;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = Integer.parseInt(scr.nextLine());
        int current = 1;
        boolean isBigger = false;
        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                if(current > n){
                    isBigger = true;
                    break;
                }
                System.out.print(current + " ");
                current++;
            }
            System.out.println();
        }
    }
}
