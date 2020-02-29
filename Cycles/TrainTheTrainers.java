package Cycles;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int jury = Integer.parseInt(scr.nextLine());
        double average = 0;
        String input = scr.nextLine();
        int counter = 0;
        while (!"Finish".equals(input)) {
            String presentation = input;
            double totalGrades = 0.00;
            for (int i = 0; i < jury; i++) {
                double grades = Double.parseDouble(scr.nextLine());
                totalGrades += grades;
                counter++;
            }
            average += totalGrades;
            System.out.printf("%s - %.2f.%n", presentation,totalGrades/ jury);
            input = scr.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", average / counter);

    }
}
