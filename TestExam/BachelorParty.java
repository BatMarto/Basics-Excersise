package TestExam;

import java.util.Scanner;

public class BachelorParty {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

// write a program that counts how much can the restaurant hold and what will the income be
// and also can he get a chance to invite a singer

        // if the reservation is for less than 5 people covert for another person is 100
        // if the reservation is for 5 or more the covert is 70

        int guestSingerMoney = Integer.parseInt(scr.nextLine());
        // take the money for the singer too
        int totalGuestsCount = 0;
        int totalMoneyRaised = 0;
        String command = scr.nextLine();
        while(!"The restaurant is full".equals(command)){
            // getting the count for people in a group
            int groupGuests = Integer.parseInt(command);

            if(groupGuests < 5){
                totalGuestsCount += groupGuests;
                totalMoneyRaised += groupGuests * 100;
            }else{
                totalGuestsCount += groupGuests;
                totalMoneyRaised += groupGuests * 70;
            }

            command = scr.nextLine();
        }

        int diff = Math.abs(guestSingerMoney - totalMoneyRaised);

        if(totalMoneyRaised >= guestSingerMoney){
            System.out.printf("You have %d guests and %d leva left.",totalGuestsCount ,diff);
        }else{
            System.out.printf("You have %d guests and %d leva income, but no singer.", totalGuestsCount,totalMoneyRaised);
        }

    }
}
