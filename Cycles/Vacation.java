package Cycles;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scr.nextLine());
        double myBudget = Double.parseDouble(scr.nextLine());

        int spendCounter = 0;
        int saveCounter = 0;

        while(myBudget < moneyNeeded && spendCounter < 5) {
            String action = scr.nextLine();
            double sum = Double.parseDouble(scr.nextLine());

            saveCounter++;
            if(action.equals("spend")){
                myBudget -= sum;
                spendCounter++;
            }else if(action.equals("save")){
                myBudget += sum ;
                spendCounter = 0;

            }
            if(myBudget < 0){
                myBudget = 0;
            }


        }
        if(spendCounter == 5){
            System.out.printf("You can't save the money.%n" +
                    "%d",saveCounter);
        }
        if (myBudget >= moneyNeeded){
            System.out.printf("You saved the money for %d days.",saveCounter);
        }



    }
}
