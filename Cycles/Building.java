package Cycles;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int floors = Integer.parseInt(scr.nextLine());
        int rooms = Integer.parseInt(scr.nextLine());

        for (int floor = floors; floor > 0 ; floor--){
            for (int room = 0; room < rooms; room++) {
                if(floor == floors){
                    System.out.printf("L%d%d ", floor,room);
                }else if(floor % 2 == 0){
                    System.out.printf("O%d%d ", floor,room);
                }else {
                    System.out.printf("A%d%d ", floor,room);
                }


            }
            System.out.println();
        }
    }
}
