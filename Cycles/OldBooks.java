package Cycles;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String wantedBook = scr.nextLine();

        int libraryCapacity = Integer.parseInt(scr.nextLine());

        int counter = 0;

        boolean isFound = false;
        while ( !isFound &&counter < libraryCapacity){
            String book = scr.nextLine();
            if(book.equals(wantedBook)){

                isFound = true;


            }else {
                counter++;

            }
        }
        if(isFound){
            System.out.printf("You checked %d books and found it.", counter);
        }else{
            System.out.printf("The book you searched is not here! %n" +
                    "You checked %d books.", counter);

        }

    }
}
