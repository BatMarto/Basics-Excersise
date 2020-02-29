package Cycles;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        double change = Double.parseDouble(scr.nextLine());
        change *= 100;
        int totalCoins = 0;


        while(change > 0) {
            if(change - 200 >= 0){
                totalCoins++;
                change -= 200;
            }
            else if(change - 100 >= 0){
                totalCoins++;
                change -= 100;
            }
            else if(change - 50 >= 0){
                totalCoins++;
                change -= 50;
            }
            else if(change - 20 >= 0){
                totalCoins++;
                change -= 20;
            }else if(change - 10 >= 0){
                totalCoins++;
                change -= 10;
            } else if (change - 5 >= 0) {
                totalCoins++;
                change -= 5;
            }else if(change - 2 >= 0){
                totalCoins++;
                change -= 2;
            }else if(change - 1 >= 0){
                totalCoins++;
                change -= 1;
            }else{
                break;
            }
        }
        System.out.println(totalCoins);

    }
}
