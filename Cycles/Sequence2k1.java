package Cycles;

import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = Integer.parseInt(scr.nextLine());

        int num = 1;

        while (num <= n){
            System.out.println(num);
            num = num * 2 + 1;
        }

    }
}
