package Exam;

import java.util.Scanner;

public class ChristmasGift {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String command = scr.nextLine();

        int kids = 0;
        int moneyForToys = 0;
        int adults = 0;
        int moneyForSweaters = 0;

        while(!command.equals("Christmas")){
            int age = Integer.parseInt(command);

            if(age <= 16){
                kids++;
            }else{
                adults++;
            }

            command= scr.nextLine();
        }

        moneyForSweaters = adults * 15;
        moneyForToys = kids * 5;

        System.out.printf("Number of adults: %d%n" +
                "Number of kids: %d%n" +
                "Money for toys: %d%n" +
                "Money for sweaters: %d", adults,kids,moneyForToys,moneyForSweaters);


    }
}
