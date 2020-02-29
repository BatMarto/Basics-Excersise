package BasicsPc;

import java.util.*;
public class SkiVacation {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int days = Integer.parseInt(scr.nextLine()) - 1;
        String roomType = scr.nextLine();
        String score = scr.nextLine();


        double roomCost = 0;
        double oneRoom = 18 * days;
        double apartCost = 25 * days;
        double vipApartCost = 35 * days;

        if (roomType.equals("room for one person")){
            roomCost = oneRoom;
        }
        else if (roomType.equals("apartment")){
            if(days < 10){
                roomCost = apartCost - (apartCost * (30. / 100));
            }
            else if (days >= 10 && days <= 15){
                roomCost = apartCost - (apartCost * (35. / 100));
            }
            else if (days > 15){
                roomCost = apartCost - (apartCost * (50. / 100));
            }

        }else{
            if (days < 10){
                roomCost = vipApartCost - (vipApartCost * (10. / 100));
            }
            else if (days >= 10 && days <= 15){
                roomCost = vipApartCost - (vipApartCost * (15. / 100));
            }
            else if (days > 15){
                roomCost = vipApartCost - (vipApartCost * (20. / 100));
            }
        }

        if(score.equals("positive")){
            roomCost = roomCost + (roomCost * (25. /100));
        }else{
            roomCost = roomCost - (roomCost * (10. / 100));
        }

        System.out.printf("%.2f", roomCost);


    }
}

