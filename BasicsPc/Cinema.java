package BasicsPc;

import java.util.*;
public class Cinema {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String projectionType = scr.nextLine();
        int rows = Integer.parseInt(scr.nextLine());
        int columns = Integer.parseInt(scr.nextLine());

        double income = 0.0;

        if("Premiere".equals(projectionType)){
            income = rows * columns * 12;
        }else if("Normal".equals(projectionType)){
            income = rows * columns * 7.50;

        }else if ("Discount".equals(projectionType)){
            income = rows * columns * 5;
        }
        System.out.printf("%.2f", income);

    }
}
