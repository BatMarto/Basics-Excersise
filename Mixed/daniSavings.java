package Mixed;

import java.util.Scanner;

public class daniSavings {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        double monthIncome = Double.parseDouble(scr.nextLine());
        int months = Integer.parseInt(scr.nextLine());
        double personalNeedOffset = Double.parseDouble(scr.nextLine());

        double unpredictetSituations = monthIncome * 0.3;
        double SavingsMonth = monthIncome - (unpredictetSituations + personalNeedOffset);
        double totalSaved = months * SavingsMonth;

        double percentSaved = SavingsMonth / monthIncome * 100;

        System.out.printf("She can save %.2f%% %n" +
                "%.2f", percentSaved, totalSaved);

        // calculate the maximum percent she can save


    }
}
