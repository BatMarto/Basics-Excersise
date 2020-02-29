package BasicsPc;


import java.util.*;
public class FishingBoat {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int groupBudget = Integer.parseInt(scr.nextLine());
        String season = scr.nextLine();
        int fishersCount = Integer.parseInt(scr.nextLine());

        double totalCost = 0.0;
        if (season.equals("Spring")){
            totalCost = 3000;
            if (fishersCount <= 6){
                totalCost -= totalCost * (10. / 100);
            }
            else if(fishersCount > 7 && fishersCount <= 11){
                totalCost -= totalCost * (15. / 100);
            }
            else if(fishersCount > 11){
                totalCost -= totalCost * (25. / 100);
            }
            if(fishersCount % 2 == 0){
                totalCost -= totalCost * (5. / 100);
            }
        }
        else if(season.equals("Summer")){
            totalCost = 4200;
            if (fishersCount <= 6){
                totalCost -= totalCost * (10. / 100);
            }
            else if(fishersCount > 7 && fishersCount <= 11){
                totalCost -= totalCost * (15. / 100);
            }
            else if(fishersCount > 11){
                totalCost -= totalCost * (25. / 100);
            }
            if(fishersCount % 2 == 0){
                totalCost -= totalCost * (5. / 100);
            }
        }
        else if(season.equals("Autumn")){
            totalCost = 4200;
            if (fishersCount <= 6){
                totalCost -= totalCost * (10. / 100);
            }
            else if(fishersCount > 7 && fishersCount <= 11){
                totalCost -= totalCost * (15. / 100);
            }
            else if(fishersCount > 11){
                totalCost -= totalCost * (25. / 100);
            }
        }
        else if(season.equals("Winter")){
            totalCost = 2600;
            if (fishersCount <= 6){
                totalCost -= totalCost * (10. / 100);
            }
            else if(fishersCount > 7 && fishersCount <= 11){
                totalCost -= totalCost * (15. / 100);
            }
            else if(fishersCount > 11){
                totalCost -= totalCost * (25. / 100);
            }
            if(fishersCount % 2 == 0){
                totalCost -= totalCost * (5. / 100);
            }
        }




        double leftMoney = Math.abs(groupBudget - totalCost);

        if(groupBudget >= totalCost){
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.", leftMoney);
        }



    }
}
