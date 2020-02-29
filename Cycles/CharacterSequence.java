package Cycles;


import java.util.*;
public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String n = scr.nextLine();

        for (int i = 0; i < n.length() ; i++) {
            char toLetter = n.charAt(i);
            System.out.println(toLetter);
        }



    }
}
