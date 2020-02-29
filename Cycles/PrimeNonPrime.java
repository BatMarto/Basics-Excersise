package Cycles;

import java.util.Scanner;

public class PrimeNonPrime {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String command = scr.nextLine();
        int primeSum = 0;
        int notPrimeSum = 0;
        while (!"stop".equals(command)) {
            int num = Integer.parseInt(command);

            if (num < 0) {
                System.out.println("Number is negative.");
            }else if(num == 1){
                primeSum += 1;
            } else {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }


                if (isPrime) {
                    primeSum += num;
                } else {
                    notPrimeSum += num;
                }
            }

            command = scr.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d", notPrimeSum);
    }
}
