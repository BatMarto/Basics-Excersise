package BasicsPc;


import java.util.*;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String text = scr.nextLine();
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            switch (letter) {
                case 'a':
                    sum =sum + 1;
                    break;
                case 'e':
                    sum =sum + 2;
                    break;
                case 'u':
                    sum =sum + 5;
                    break;
                case 'i':
                    sum =sum + 3;
                    break;
                case 'o':
                    sum =sum + 4;
                    break;
            }


        }
            System.out.println(sum);
    }
}
