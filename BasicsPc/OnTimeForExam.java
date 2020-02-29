package BasicsPc;


import java.util.*;
public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int examHour = Integer.parseInt(scr.nextLine());
        int examMinute = Integer.parseInt(scr.nextLine());
        int arriveHour = Integer.parseInt(scr.nextLine());
        int arriveMinute = Integer.parseInt(scr.nextLine());



        int examTimeInMins = examHour * 60 + examMinute;
        int arrivalTimeInMinutes = arriveHour * 60 + arriveMinute;

        int result = arrivalTimeInMinutes - examTimeInMins;

        if(result > 0){
            System.out.println("Late");
            if(result < 60){
                System.out.printf("%d minutes after the start", result);
            }else{
                int hours = result / 60;
                int minutes = result % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        }else if(result >= -30){
            System.out.println("On time");
            if(result < 0){
                System.out.printf("%d minutes before the start", Math.abs(result));
            }
        }else{
            System.out.println("Early");
            if(result > -60){
                System.out.printf("%d minutes before the start", Math.abs(result));
            }else{
                int hours = Math.abs(result / 60);
                int minutes= Math.abs(result % 60);
                System.out.printf("%d:%02d hours before the start", hours,minutes);
            }
        }

    }
}
