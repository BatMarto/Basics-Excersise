package Cycles;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String movieTitle = scr.nextLine();


        int studentCounter = 0;
        int standCounter = 0;
        int kidCounter = 0;
        while(!"Finish".equals(movieTitle)){
            int capacity = Integer.parseInt(scr.nextLine());
            int counter = 0;
            for (int i = 0; i <  capacity; i++) {

                String ticketType = scr.nextLine();

                if("End".equals(ticketType)){
                    break;
                }

                counter++;
                switch (ticketType){
                    case "student":
                        studentCounter++;
                        break;
                    case "standard":
                        standCounter++;
                        break;
                    case "kid":
                        kidCounter++;
                        break;
                }
                
            }
            double percent = counter * 1.0 / capacity * 100;
            System.out.printf("%s - %.2f%% full.%n", movieTitle, percent);
            movieTitle = scr.nextLine();
        }

        int total = kidCounter + standCounter + studentCounter;

        System.out.printf("Total tickets: %d%n", total);
        double studentPercent = studentCounter * 1.0 / total * 100;
        System.out.printf("%.2f%% student tickets.%n", studentPercent);
        double standPercent = standCounter * 1.0 / total * 100;
        System.out.printf("%.2f%% standard tickets.%n", standPercent);
        double kidPercent = kidCounter * 1.0 / total * 100;
        System.out.printf("%.2f%% kids tickets.%n", kidPercent);


    }
}
