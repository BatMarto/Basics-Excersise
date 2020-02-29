package Cycles;

import java.util.*;
public class sumNums {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = Integer.parseInt(scr.nextLine());
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            int input = Integer.parseInt(scr.nextLine());
            sum += input;

        }
        System.out.println(sum);
    }
}
