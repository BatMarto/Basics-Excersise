package BasicsPc;


import java.util.*;
public class HotelRoom {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String month = scr.nextLine();
        int nights = Integer.parseInt(scr.nextLine());

        double apartament = 0.0;
        double studio = 0.0;

        if(month.equals("May") || month.equals("October")){
            studio = 50;
            apartament = 65;

            if(nights > 14 ){
                studio *= 0.70;
            }else if(nights > 7){
                studio *= 0.95;
            }

        }
        else if(month.equals("June") || month.equals("September")){
            studio = 75.20 ;
            apartament = 68.70 ;
            if(nights > 14){
                studio *= 0.80;
            }
        }
        else if(month.equals("July") || month.equals("August")){
            studio = 76 ;
            apartament = 77  ;
        }
        if(nights > 14){
            apartament *= 0.90;
        }

        double apartTotal = apartament * nights;
        double studioTotal = studio * nights;

        System.out.printf("Apartment: %.2f lv.%n", apartTotal);
        System.out.printf("Studio: %.2f lv.", studioTotal);


    }
}
