package Cycles;

import java.util.*;
public class maxMinNumbers {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = Integer.parseInt(scr.nextLine());
        int minNum = 99999;
        int maxNum = -999999;
        for (int i = 0; i < n ; i++) {
            int input = Integer.parseInt(scr.nextLine());
            if(input >= maxNum){
                maxNum = input;

            }
            if (input < minNum){
                minNum = input;


            }
        }
        System.out.println("Max number: "+ maxNum);
        System.out.println("Min number: "+ minNum);
    }
}
