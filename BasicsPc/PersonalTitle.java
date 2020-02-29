package BasicsPc;


import java.util.*;
public class PersonalTitle {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double age = Double.parseDouble(scr.nextLine());
        String type = scr.nextLine();

        if (age < 16 && type.equals("m")){
            System.out.println("Master");
        }
        else if(age >= 16 && type.equals("m")){
            System.out.println("Mr.");
        }
        else if(age < 16 && type.equals("f")){
            System.out.println("Miss");
        }
        else if(age >= 16 && type.equals("f")){
            System.out.println("Ms.");
        }

    }

}
