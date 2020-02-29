package Cycles;

import java.util.*;
public class Cake {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int width = Integer.parseInt(scr.nextLine());
        int length = Integer.parseInt(scr.nextLine());

        int totalCake = width * length;

        String command = scr.nextLine();

        int totalPieces = 0;

        while (!command.equals("STOP")){

            int pieces = Integer.parseInt(command);
            totalCake -= pieces;


            if(totalCake < 0){
                totalPieces = pieces;
                break;
            }else {

                command = scr.nextLine();
            }


        }
        int cakeNeeded = Math.abs(totalCake);
        if(command.equals("STOP")){
            System.out.printf("%d pieces are left.", totalCake);
        }else{
            System.out.printf("No more cake left! You need %d pieces more.", cakeNeeded);
        }


    }

}
