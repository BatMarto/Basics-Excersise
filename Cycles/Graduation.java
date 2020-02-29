package Cycles;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String name = scr.nextLine();
        int counter = 0;
        int fails = 0;
        double averageGrades = 0;
        while (counter < 12){
            double grades =Double.parseDouble(scr.nextLine());
            if(grades >= 4.00){
                averageGrades += grades;
                counter++;
            }else{
                fails++;

            }
            if(fails >= 2){
               break;
            }



        }
        double calculateAverage = averageGrades / 12;
        if(fails != 2) {
            System.out.printf("%s graduated. " +
                    "Average grade: %.2f", name, calculateAverage);
        }else{
            System.out.printf("%s has been excluded at %d grade", name,counter + 1);
        }
    }
}
