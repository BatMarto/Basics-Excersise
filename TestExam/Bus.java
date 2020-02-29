package TestExam;

import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        //bus travelling from sofia to burgas
        // every uneven stops two controllers get on the bus and get off at the even stops

        int passengersAtStart = Integer.parseInt(scr.nextLine());
        int totalStops = Integer.parseInt(scr.nextLine());

        int controllers = 0;
        for (int i = 1; i <= totalStops ; i++) {
            int exiting = Integer.parseInt(scr.nextLine());
            int entering = Integer.parseInt(scr.nextLine());
            passengersAtStart -= exiting;
            passengersAtStart += entering;
            if(i % 2 == 1){
                passengersAtStart += 2;
            }else{
                passengersAtStart -= 2;
            }
        }
        System.out.printf("The final number of passengers is : %d", passengersAtStart);

    }
}
