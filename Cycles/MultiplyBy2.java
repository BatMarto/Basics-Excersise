package Cycles;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = Integer.parseInt(scr.nextLine());

        for (int i = 0; i <= n ; i+=2) {
            System.out.println((int)Math.pow(2, i));
            
        }
    }
}
