package BasicsPc;


import java.util.*;
public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String product = scr.nextLine();

        switch (product){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
        }



    }
}
