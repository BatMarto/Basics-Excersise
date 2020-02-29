package BasicsPc;



import java.util.*;
public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int number = Integer.parseInt(scr.nextLine());

        if(!(number == 0 || number >= 100 && number <= 200)) {
            System.out.println("invalid");
        }


    }
}
