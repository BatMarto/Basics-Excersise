package BasicsPc;


import java.util.*;
public class FlowerShop {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String flowerType = scr.nextLine();
        int quantFlowers = Integer.parseInt(scr.nextLine());
        int budget = Integer.parseInt(scr.nextLine());

        double rosesPrice = quantFlowers * 5;
        double daliashPrice = quantFlowers * 3.80;
        double lalePrice = quantFlowers * 2.80;
        double narcicussPrice = quantFlowers * 3;
        double gladiolaPrice = quantFlowers * 2.50;

        double totalCost = 0.00;

//        discount bill calculations here
        if (flowerType.equals("Roses")){
            totalCost = rosesPrice;
            if(quantFlowers > 80){
                totalCost -= totalCost * (10. / 100);
            }

        }
        else if(flowerType.equals("Dahlias")){
            totalCost = daliashPrice;
            if(quantFlowers > 90){
                totalCost -= totalCost * (15. / 100);
            }
        }
        else if (flowerType.equals("Tulips")){
            totalCost = lalePrice;
            if(quantFlowers > 80){
                totalCost -= totalCost * (15. / 100);
            }
        }
        else if (flowerType.equals("Narcissus")){
            totalCost = narcicussPrice;
            if(quantFlowers < 120){
                totalCost += totalCost * (15. / 100);
            }
        }
        else if (flowerType.equals("Gladiolus")){
            totalCost = gladiolaPrice;
            if(quantFlowers < 80){
                totalCost += totalCost * (20. / 100);
            }
        }

        double leftMoney = Math.abs(budget - totalCost);

        if(budget >= totalCost){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantFlowers, flowerType, leftMoney);
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.", leftMoney);
        }

    }
}

