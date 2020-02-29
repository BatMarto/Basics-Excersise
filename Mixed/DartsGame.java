package Mixed;

import java.util.Scanner;

public class DartsGame {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);


        int startingPoints = Integer.parseInt(scr.nextLine());

        int counter = 0;

        while(startingPoints > 0) {
            String sector = scr.nextLine();
            if ("bullseye".equals(sector)){
                counter++;
            break;
        }
            int points = Integer.parseInt(scr.nextLine());

            if("number section".equals(sector)){
                startingPoints -= points;

            }else if("double ring".equals(sector))
                startingPoints -= points * 2;
            else if("triple ring".equals(sector))
                startingPoints -= points * 3;


            counter++;
        }
        int diff = Math.abs(startingPoints);
        if(startingPoints < 0){
            System.out.printf("Sorry, you lost. Score difference: %d." ,diff);
        }else if(startingPoints > 0){
            System.out.printf("Congratulations! You won the game with a bullseye in %d moves!", counter);
        }else if (startingPoints == 0){
            System.out.printf("Congratulations! You won the game in %d moves!", counter);
        }

    }
}
