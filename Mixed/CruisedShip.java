package Mixed;

import java.util.Scanner;

public class CruisedShip {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String typeOfCruise = scr.nextLine();
        String boatType = scr.nextLine();
        int nights = Integer.parseInt(scr.nextLine());


        double cost = 0.00;
        if("standard cabin".equals(boatType)){
            if("Mediterranean".equals(typeOfCruise)){
                cost = 27.50;
            }else if("Adriatic".equals(typeOfCruise)){
                cost = 22.99;
            }else if("Aegean".equals(typeOfCruise)){
                cost = 23.00 ;
            }
        }else if("cabin with balcony".equals(boatType)){
            if("Mediterranean".equals(typeOfCruise)){
                cost = 30.20;
            }else if("Adriatic".equals(typeOfCruise)){
                cost = 25.00;
            }else if("Aegean".equals(typeOfCruise)){
                cost = 26.60;
            }
        } else if("apartment".equals(boatType)){
            if("Mediterranean".equals(typeOfCruise)){
                cost = 40.50;
            }else if("Adriatic".equals(typeOfCruise)){
                cost = 34.99;
            }else if("Aegean".equals(typeOfCruise)){
                cost = 39.80;
            }
        }
        double totalCost = cost * 4 * nights;
        if(nights > 7){
            totalCost -= totalCost * 0.25;
        }

        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.",typeOfCruise, totalCost);
    }
}
