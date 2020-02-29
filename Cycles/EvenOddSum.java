package Cycles;

import java.util.*;
public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = Integer.parseInt(scr.nextLine());

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scr.nextLine());

            if (i % 2 == 0){
                evenSum += number;
            }else{
                oddSum += number;
            }

        }
        int diff = Math.abs(evenSum - oddSum);
        if(evenSum == oddSum){
            System.out.printf("Yes%n" +
                    "Sum = %d ", evenSum);
        }else{
            System.out.printf("No%n" +
                    "Diff = %d", diff );
        }
    }
}
