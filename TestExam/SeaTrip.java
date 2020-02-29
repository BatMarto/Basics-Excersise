package TestExam;

import java.util.Scanner;

public class SeaTrip {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        // харчат се пари за храна и сувенири
        // на всеки 100 километра се изразходват 7 литра бензин логика
        //пресмятаме общата сума

        double moneyForFood = Double.parseDouble(scr.nextLine());
        double moneyForSouvenirs = Double.parseDouble(scr.nextLine());
        double hotelMoney = Double.parseDouble(scr.nextLine());

        double dieselNeeded = 420. / 100 * 7;
        double moneyForDieselNeeded = dieselNeeded * 1.85;
        double totalMoneyForThings = 3 * moneyForFood + 3 * moneyForSouvenirs;

        double firstDayDiscount = hotelMoney * 0.9;
        double secondDiscount = hotelMoney * 0.85;
        double thirdDiscount = hotelMoney * 0.8;
        double allPrice = moneyForDieselNeeded + totalMoneyForThings + firstDayDiscount + secondDiscount + thirdDiscount;
        System.out.printf("Money needed: %.2f",allPrice);

    }
}
