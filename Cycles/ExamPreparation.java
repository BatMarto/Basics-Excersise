package Cycles;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int maxFails = Integer.parseInt(scr.nextLine());
        int failedTimes= 0;
        int solvedProblems = 0;
        double gradesSum= 0;
        String lastProblem = "";
        boolean isFailed = true;
        while(failedTimes < maxFails){
            String problem = scr.nextLine();


            if("Enough".equals(problem)){
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scr.nextLine());
            if(grade <= 4){
                failedTimes++;
            }
            gradesSum +=grade;
            solvedProblems++;
            lastProblem = problem;
        }

        if(isFailed){
            System.out.printf("You need a break, %d poor grades.", maxFails);
        }else{
            System.out.printf("Average score: %.2f%n", gradesSum/solvedProblems);
            System.out.printf("Number of problems: %d%n", solvedProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }



    }
}
