package TestExam;

import java.util.Scanner;

public class Sushi {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String sushiType = scr.nextLine();
        String restaurant = scr.nextLine();
        int portions = Integer.parseInt(scr.nextLine());
        String symbol = scr.nextLine();

        double orderPrice = 0;
        boolean invalidRestaurant = false;
        switch (sushiType) {
            case "sashimi":
                if ("Sushi Zone".equals(restaurant)) {
                    orderPrice += portions * 4.99;
                } else if ("Sushi Time".equals(restaurant)) {
                    orderPrice += portions * 5.49;
                } else if ("Sushi Bar".equals(restaurant)) {
                    orderPrice += portions * 5.25;
                } else if ("Asian Pub".equals(restaurant)) {
                    orderPrice += portions * 4.50;
                } else {
                    invalidRestaurant = true;
                }
                break;
            case "maki":
                if ("Sushi Zone".equals(restaurant)) {
                    orderPrice += portions * 5.29;
                } else if ("Sushi Time".equals(restaurant)) {
                    orderPrice += portions * 4.69;
                } else if ("Sushi Bar".equals(restaurant)) {
                    orderPrice += portions * 5.55;
                } else if ("Asian Pub".equals(restaurant)) {
                    orderPrice += portions * 4.80;
                } else {
                    invalidRestaurant = true;
                }
                break;
            case "uramaki":
                if ("Sushi Zone".equals(restaurant)) {
                    orderPrice += portions * 5.99;
                } else if ("Sushi Time".equals(restaurant)) {
                    orderPrice += portions * 4.49;
                } else if ("Sushi Bar".equals(restaurant)) {
                    orderPrice += portions * 6.25;
                } else if ("Asian Pub".equals(restaurant)) {
                    orderPrice += portions * 5.50;
                } else {
                    invalidRestaurant = true;
                }
                break;
            case "temaki":
                if ("Sushi Zone".equals(restaurant)) {
                    orderPrice += portions * 4.29;
                } else if ("Sushi Time".equals(restaurant)) {
                    orderPrice += portions * 5.19;
                } else if ("Sushi Bar".equals(restaurant)) {
                    orderPrice += portions * 4.75;
                } else if ("Asian Pub".equals(restaurant)) {
                    orderPrice += portions * 5.50;
                } else {
                    invalidRestaurant = true;
                }
                break;
        }
        if(symbol.equals("Y")){
            orderPrice += orderPrice * 0.2;
        }
        if(invalidRestaurant){
            System.out.printf("%s is invalid restaurant!", restaurant);
        }else
        System.out.printf("Total price: %.0f lv.", Math.ceil(orderPrice));


    }
}
