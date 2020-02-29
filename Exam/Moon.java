package Exam;

import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        double realTimeSpeed = Double.parseDouble(scr.nextLine());
        double letersFor100Kils = Double.parseDouble(scr.nextLine());

        double totalDistance = 384400 * 2;
        double timeOfTravel = Math.ceil(totalDistance / realTimeSpeed);

        double totalTime = timeOfTravel + 3;

        double gas = (letersFor100Kils * totalDistance) / 100;

        System.out.println(Math.round(totalTime));
        System.out.printf("%.0f", gas);


    }
}
