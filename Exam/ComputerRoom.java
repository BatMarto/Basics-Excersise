package Exam;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String month = scr.nextLine();
        int hoursPlayed = Integer.parseInt(scr.nextLine());
        int groupPeopleCount = Integer.parseInt(scr.nextLine());
        String timeOfDay = scr.nextLine();

        double costForOne = 0;
        if(month.equals("march")){
            if(timeOfDay.equals("day")){
                costForOne += 10.50;
            }else if(timeOfDay.equals("night")){
                costForOne += 8.4;
            }
        }else if(month.equals("april")){
            if(timeOfDay.equals("day")){
                costForOne += 10.50;
            }else if(timeOfDay.equals("night")){
                costForOne += 8.4;
            }
        }else if(month.equals("may")){
            if(timeOfDay.equals("day")){
                costForOne += 10.50;
            }else if(timeOfDay.equals("night")){
                costForOne += 8.4;
            }
        }
        else if(month.equals("june")){
            if(timeOfDay.equals("day")){
                costForOne += 12.60;
            }else if(timeOfDay.equals("night")){
                costForOne += 10.20;
            }
        }else if(month.equals("july")){
            if(timeOfDay.equals("day")){
                costForOne += 12.60;
            }else if(timeOfDay.equals("night")){
                costForOne += 10.20;
            }
        }else if(month.equals("august")){
            if(timeOfDay.equals("day")){
                costForOne += 12.60;
            }else if(timeOfDay.equals("night")){
                costForOne += 10.20;
            }
        }

        if(groupPeopleCount == 0){
            costForOne = 0;
        }


        if(groupPeopleCount >= 4){
            costForOne -= costForOne * (10. / 100);
        }
        if(hoursPlayed >= 5){
            costForOne -= costForOne * (50. / 100);
        }

        double totalCost = costForOne * groupPeopleCount * hoursPlayed;


        System.out.printf("Price per person for one hour: %.2f%n" +
                "Total cost of the visit: %.2f", costForOne, totalCost);



    }
}
