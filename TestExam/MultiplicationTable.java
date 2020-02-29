package TestExam;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        //create a program which gets a whole number and prints out the multi table but backwards

        int n = Integer.parseInt(scr.nextLine());

        int firstDigit = n % 10;
        int secondDigit = n / 10 % 10;
        int thirdDigit = n / 100 % 10;
        for (int i = 1; i <=firstDigit ; i++) {
            for (int j = 1; j <= secondDigit ; j++) {
                for (int k = 1; k <= thirdDigit ; k++) {
                    int result = i * j * k;
                    System.out.printf("%d * %d * %d = %d;%n",i,j,k,result);
                    
                }
                
            }
            
        }

    }
}
