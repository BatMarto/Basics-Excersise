package BasicsPc;

import java.util.*;
public class NumberInRange {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double num = Double.parseDouble(scr.nextLine());

        if(num != 0 && num >= -100 && num <= 100){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }


}
