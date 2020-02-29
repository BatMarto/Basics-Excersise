package Cycles;

import java.util.*;
public class Tripping {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String destination = scr.nextLine();

        while(!"End".equals(destination)){
            double target = Double.parseDouble(scr.nextLine());


            int currentSum = 0;
            while(currentSum < target){
                double moneySaved = Double.parseDouble(scr.nextLine());
                currentSum += moneySaved;

            }
            System.out.printf("Going to %s!%n", destination);
            destination = scr.nextLine();
        }

    }
}
