package Exam;

import java.util.Scanner;

public class FootbalResults {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String result1 = scr.nextLine();
        String result2 = scr.nextLine();
        String result3 = scr.nextLine();

        int won = 0;
        int lost = 0;
        int draw = 0;
        if(result1.charAt(0) > result1.charAt(2)){
            won++;
        }else if(result1.charAt(0) < result1.charAt(2)){
            lost++;
        }else{
            draw++;
        }
        if(result2.charAt(0) > result2.charAt(2)){
            won++;
        }else if(result2.charAt(0) < result2.charAt(2)){
            lost++;
        }else{
            draw++;
        }
        if(result3.charAt(0) > result3.charAt(2)){
            won++;
        }else if(result3.charAt(0) < result3.charAt(2)){
            lost++;
        }else{
            draw++;
        }

        System.out.printf("Team won %d games.%n", won);
        System.out.printf("Team lost %d games.%n", lost);
        System.out.printf("Drawn games: %d", draw);


    }
}
