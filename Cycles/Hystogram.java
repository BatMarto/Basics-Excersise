package Cycles;


import java.util.*;
public class Hystogram {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = Integer.parseInt(scr.nextLine());

        int p1Counter = 0;
        int p2Counter = 0;
        int p3Counter = 0;

        for (int i = 0; i < n ; i++) {
            int number = Integer.parseInt(scr.nextLine());
            if(number % 2 == 0){
                p1Counter++;
            }if(number % 3 == 0){
                p2Counter++;
            } if(number % 4 == 0){
                p3Counter++;

            }
        }

        double p1Percent = (p1Counter * 1.0 / n) * 100;
        double p2Percent = (p2Counter  * 1.0 / n) * 100;
        double p3Percent = (p3Counter  * 1.0 / n) * 100;


        System.out.printf("%.2f%%%n", p1Percent);
        System.out.printf("%.2f%%%n", p2Percent);
        System.out.printf("%.2f%%%n", p3Percent);



    }


}
