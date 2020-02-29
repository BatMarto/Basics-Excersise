package Cycles;


import java.util.*;
public class TwoSums {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        int n = Integer.parseInt(scr.nextLine());

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scr.nextLine());
            leftSum += number;
            
        }

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scr.nextLine());
            rightSum += number;


        }
        int differ = Math.abs(leftSum - rightSum);

        if(leftSum == rightSum){
            System.out.printf("Yes, sum = %d", leftSum);
        }else{
            System.out.printf("No, diff = %d", differ);
        }
    }
}
