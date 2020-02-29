package Mixed;

import java.util.Scanner;

public class CruiseGames {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String name = scr.nextLine();
        int gamesToPlay = Integer.parseInt(scr.nextLine());

        int voleyballcnt = 0;
        int tenniscnt = 0;
        int badmintoncnt = 0;

        double volleyPoints = 0.00;
        double teniPoints = 0.00;
        double badPoints = 0.00;
        int count = 0;
        while(count++ < gamesToPlay) {
            String gameName = scr.nextLine();
            int gamePoints = Integer.parseInt(scr.nextLine());

            if("volleyball".equals(gameName)){
                volleyPoints += gamePoints + (gamePoints* (7./100));
                voleyballcnt++;
            }else if("tennis".equals(gameName)){
                teniPoints += gamePoints + (gamePoints * (5./100));
                tenniscnt++;
            }else if("badminton".equals(gameName)){
                badPoints += gamePoints + (gamePoints *(2./100));
                badmintoncnt++;
            }



        }

        double averageVoleyball = Math.floor(volleyPoints / voleyballcnt);
        double tennisAverage = Math.floor(teniPoints / tenniscnt);
        double badAverage = Math.floor(badPoints / badmintoncnt);

        boolean allAverage = averageVoleyball >= 75 && tennisAverage >= 75 && badAverage >= 75;
        double total = Math.floor(volleyPoints + teniPoints + badPoints);

        if(allAverage) {
            System.out.printf("Congratulations, %s! You won the cruise games with %.0f points.",name, total  );
        }else{
            System.out.printf("Sorry, %s, you lost. Your points are only %.0f.",name,total);
        }





    }
}
