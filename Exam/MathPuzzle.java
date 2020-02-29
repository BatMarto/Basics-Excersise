package Exam;

import java.util.Scanner;

public class MathPuzzle {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int key = Integer.parseInt(scr.nextLine());
        int counter = 0;

        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= 30; j++) {
                for (int k = 1; k <= 30; k++) {
                    if((i < j)&&(j < k)&& (i + j + k == key)){
                        System.out.printf("%d + %d + %d = %d%n",i,j,k,key);
                        counter++;
                    }
                    if((i > j) && (j > k) && (i * j * k == key)){
                        System.out.printf("%d * %d * %d = %d%n",i,j,k,key);
                        counter++;
                    }

                }

            }
            
        }
        if(counter == 0 )
            System.out.println("No!");
    }
}
