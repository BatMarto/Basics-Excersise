package Cycles;

import java.util.Scanner;

public class TwoNumbersSum {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int startInterval = Integer.parseInt(scr.nextLine());
        int endInterval = Integer.parseInt(scr.nextLine());
        int magicNumber = Integer.parseInt(scr.nextLine());

        int counter = 0;
        boolean flag = false;

        for (int i = startInterval; i <= endInterval; i++) {
            for (int j = startInterval; j <= endInterval ; j++) {
                int result = i + j;
                counter++;
                if(result == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i , j ,result);
                    flag = true;
                    break;
                }

            }
            if(flag){
                break;
            }
        }
        if(!flag){
            System.out.printf("%d combinations - neither equals %d", counter,magicNumber);
        }


    }
}
