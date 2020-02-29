package BasicsPc;

import java.time.MonthDay;
import java.util.*;

public class FruitShop {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String product = scr.nextLine();
        String dayOfWeek = scr.nextLine();
        double quantity = Double.parseDouble(scr.nextLine());

        boolean isWeekDay =
                dayOfWeek.equals("Monday")
                        || dayOfWeek.equals("Tuesday")
                        || dayOfWeek.equals("Wednesday")
                        || dayOfWeek.equals("Thursday")
                        || dayOfWeek.equals("Friday");
        boolean theWeeknd = dayOfWeek.equals("Saturday") ||
                dayOfWeek.equals("Sunday");

        double price = 0.00;

        if (isWeekDay) {
            if (product.equals("banana")) {
                price = 2.50;
            } else if (product.equals("apple")) {
                price = 1.20;
            } else if (product.equals("orange")) {
                price = 0.85;
            } else if (product.equals("grapefruit")) {
                price = 1.45;
            } else if (product.equals("kiwi")) {
                price = 2.70;
            } else if (product.equals("pineapple")) {
                price = 5.50;
            } else if (product.equals("grapes")) {
                price = 3.85;
            }
        } else if (theWeeknd) {
            if (product.equals("banana")) {
                price = 2.70;
            } else if (product.equals("apple")) {
                price = 1.25;
            } else if (product.equals("orange")) {
                price = 0.90;
            } else if (product.equals("grapefruit")) {
                price = 1.60;
            } else if (product.equals("kiwi")) {
                price = 3.00;
            } else if (product.equals("pineapple")) {
                price = 5.60;
            } else if (product.equals("grapes")) {
                price = 4.20;
            }
        }

        if(price != 0.00){
            double totalCost = price * quantity;
            System.out.printf("%.2f", totalCost);
        }else{
            System.out.println("error");
        }
    }
}





