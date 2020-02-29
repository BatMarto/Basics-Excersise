package Mixed;

import java.util.Scanner;

public class Cooking {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int participants = Integer.parseInt(scr.nextLine());
        double moneyGained = 0.0;
        int totalCount = 0;

        for (int i = 0; i < participants; i++) {
            int cookiesCount = 0;
            int cakesCount = 0;
            int wafflesCount = 0;
            String name = scr.nextLine();
            String sweetType = scr.nextLine();
            while (!"Stop baking!".equals(sweetType)) {
                int quant = Integer.parseInt(scr.nextLine());
                totalCount += quant;
                switch (sweetType) {
                    case "cookies":
                        cookiesCount += quant;
                        moneyGained += quant * 1.50;
                        break;
                    case "cakes":
                        cakesCount += quant;
                        moneyGained += quant * 7.80;
                        break;
                    case "waffles":
                        wafflesCount += quant;
                        moneyGained += quant * 2.30;
                        break;
                }


                sweetType = scr.nextLine();

            }
            System.out.printf("%s baked %d cookies, %d cakes and %d waffles.%n", name, cookiesCount,cakesCount,wafflesCount);
        }

        System.out.printf("All bakery sold: %d%n" +
                "Total sum for charity: %.2f lv.", totalCount,moneyGained);

    }
}
