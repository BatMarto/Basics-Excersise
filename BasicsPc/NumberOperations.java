package BasicsPc;



import java.util.*;
public class NumberOperations {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n1 = Integer.parseInt(scr.nextLine());
        int n2 = Integer.parseInt(scr.nextLine());
        String operation = scr.nextLine();

        String evenOrOdd = "";
        if (n2 == 0){
            System.out.printf("Cannot divide %d by zero", n1);
            return;
        }
        if(operation.equals("+") || operation.equals("-") || operation.equals("*")){
            int result = 0;
            if(operation.equals("+")){
                result = n1 + n2;
            }else if (operation.equals("-")){
                result = n1 - n2;
            }else{
                result = n1 * n2;

            }

            if(result % 2 == 0){
                System.out.printf("%d %s %d = %d - even", n1 ,operation , n2 ,result);
            }else{
                System.out.printf("%d %s %d = %d - odd", n1 ,operation , n2 ,result);
            }

        }else if(operation.equals("/")){
            System.out.printf("%d / %d = %.2f",n1 ,n2 , n1*1.0 / n2);
        }else if(operation.equals("%")){
            System.out.printf("%d %% %d = %d", n1, n2 ,n1 % n2);
        }

    }
}
