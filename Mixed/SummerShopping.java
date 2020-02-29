package Mixed;

import java.util.Scanner;

public class SummerShopping {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int budget = Integer.parseInt(scr.nextLine());
        double towel = Double.parseDouble(scr.nextLine());
        int discount = Integer.parseInt(scr.nextLine());

        double umbrella = towel * 2/3;
        double mocasinis = umbrella * 0.75;
        double bag = (towel + mocasinis) / 3;

        double totalPrice = towel+ umbrella + mocasinis + bag;
        double discountt = discount * 1.0 / 100;
        double finalPrice = totalPrice - totalPrice * discountt;
        double diff = Math.abs(finalPrice - budget);
        if (budget > finalPrice) {
            System.out.printf("Annie's sum is %.2f lv. She has %.2f lv. left.",finalPrice, diff);

        }else{
            System.out.printf("Annie's sum is %.2f lv. She needs %.2f lv. more.", finalPrice,diff);
        }

    }
}
