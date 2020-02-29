package Cycles;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int inputs = Integer.parseInt(scr.nextLine());
        double accountBalance = 0.00;
        int counter = 0;
        while (counter < inputs) {
            double payment = Double.parseDouble(scr.nextLine());
            if (!(payment < 0)) {

                System.out.printf("Increase: %.2f%n", payment);
                accountBalance += payment;
                counter++;

            } else {
                System.out.println("Invalid operation!");
                break;
            }
        }

        System.out.printf("Total: %.2f", accountBalance);


    }
}
