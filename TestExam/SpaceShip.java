package TestExam;

import java.util.Scanner;

public class SpaceShip {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        // at least 3 astrounats but not more than 10
         // every astrounat needs a room with  2 width 2 length and 40 more that the persons height

        //print will it fit for everybody

        double widthShip = Double.parseDouble(scr.nextLine());
        double lengthShip = Double.parseDouble(scr.nextLine());
        double heightShip = Double.parseDouble(scr.nextLine());
        double averagePersonHeight = Double.parseDouble(scr.nextLine());

        double totalShipVolume = widthShip * lengthShip * heightShip;
        double roomVolume = (averagePersonHeight + 0.40) * 2 * 2;

        double roomForEveryBody = totalShipVolume / roomVolume;


        if(roomForEveryBody > 3 && roomForEveryBody <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", Math.floor(roomForEveryBody));
        }else if(roomForEveryBody < 3){
            System.out.println("The spacecraft is too small.");
        }else{
            System.out.println("The spacecraft is too big.");
        }

    }
}
