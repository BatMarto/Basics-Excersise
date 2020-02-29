package Cycles;

import java.util.*;
public class EqualPlaceSums {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

//        input two 6 zero numbers:
        int n1 = Integer.parseInt(scr.nextLine());
        int n2 = Integer.parseInt(scr.nextLine());

//create placeholders for the two sums:

//      for numbers to be printed out they have to have equal sums
//      of the even odd places in them:
        for (int i = n1; i <= n2 ; i++) {
            String currentNum = "" + i;

            int evenSum = 0;
            int oddSum = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int currDigit = Integer.parseInt("" + currentNum.charAt(j));
                if(j % 2 == 0){
                    evenSum += currDigit;
                }else{
                    oddSum += currDigit;
                }

            }
//        print out on the console the numbers between them on 1 line
            if(evenSum == oddSum){
                System.out.print(i + " ");
            }
        }




    }
}
