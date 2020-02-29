package Cycles;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int steps = 0;
        int goal = 10000;
        while (steps < goal){
            String command = scr.nextLine();
            if("Going home".equals(command)){
                int numSteps = Integer.parseInt(scr.nextLine());
                steps += numSteps;
                break;
            }
            int numSteps = Integer.parseInt(command);
            steps += numSteps;

        }
        int diff = Math.abs(steps - goal);
        if(steps >= goal){
            System.out.println("Goal reached! Good job!");
        }else{
            System.out.printf("%d more steps to reach goal.", diff);
        }

    }
}
