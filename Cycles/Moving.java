package Cycles;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int widthFreeSpace = Integer.parseInt(scr.nextLine());
        int lengthFreeSpace = Integer.parseInt(scr.nextLine());
        int heightFreeSpace = Integer.parseInt(scr.nextLine());

        int totalFreespace = widthFreeSpace * lengthFreeSpace * heightFreeSpace;
        int totalcardBoxes = 0;

        String command = scr.nextLine();

        while (!command.equals("Done")) {

            int cardBoxes = Integer.parseInt(command);
            totalcardBoxes += cardBoxes;
            if (totalcardBoxes > totalFreespace) {
                break;

            }
            command = scr.nextLine();
        }
        int Diff = Math.abs(totalcardBoxes - totalFreespace);
        if (command.equals("Done")) {
            System.out.printf("%d Cubic meters left.", Diff);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Diff);
        }
    }
}
