package Cycles;


import java.util.*;
public class SmartLily {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        int age = Integer.parseInt(scr.nextLine());
        double cost = Double.parseDouble(scr.nextLine());
        int toyPrice = Integer.parseInt(scr.nextLine());

        int moneyCount = 0;
        int toyCount= 0;



        for (int i = 1; i <= age ; i++) {
            if(i % 2 == 0){
                moneyCount++;
            }else{
                toyCount++;
            }

        }
        double savedMoney = toyCount * toyPrice;

        for (int i = 1; i <= moneyCount ; i++) {
            savedMoney += (10 * i);
        }

        savedMoney -= moneyCount;

        if (savedMoney >= cost){
            System.out.printf("Yes! %.2f", savedMoney - cost);
        }else{
            System.out.printf("No! %.2f",cost - savedMoney);
        }
    }
}
