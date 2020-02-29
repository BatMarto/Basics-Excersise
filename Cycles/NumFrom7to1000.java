package Cycles;


import java.util.*;
public class NumFrom7to1000 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = Integer.parseInt(scr.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            int number = Integer.parseInt(scr.nextLine());
            sum += number;

            if(number > max){
                max = number;
            }
        }

        int sumWithoutMax = sum - max;

        if(max == sumWithoutMax){
            System.out.printf("Yes %n" +
                    "Sum = %d", max);
        }else{
            int diff = Math.abs(sumWithoutMax - max);
            System.out.printf("No %n" +
                    "Diff = %d", diff);
        }

    }
}
