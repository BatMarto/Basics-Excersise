package BasicsPc;


import java.util.*;
public class TradeComissions {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String city = scr.nextLine();
        double sales = Double.parseDouble(scr.nextLine());

        double comission = 0.00;

        if (city.equals("Sofia")) {
            if (sales >= 0 && sales <= 500) {
                comission = ((double)sales) * (5. / 100);
            } else if (sales > 500 && sales <= 1000) {
                comission = ((double) sales) * (7. / 100);
            } else if (sales > 1000 && sales <= 10000) {
                comission = ((double) sales) * (8. / 100);
            }else if (sales > 10000){
                comission = ((double) sales) * (12. / 100);
            }
        }
        else if(city.equals("Varna")){
            if (sales >= 0 && sales <= 500) {
                comission = ((double)sales) * (4.5 / 100);
            } else if (sales > 500 && sales <= 1000) {
                comission = ((double) sales) * (7.5 / 100);
            } else if (sales > 1000 && sales <= 10000) {
                comission = ((double) sales) * (10. / 100);
            }else if (sales > 10000){
                comission = ((double) sales) * (13. / 100);
            }
        }else if (city.equals("Plovdiv")){
            if (sales >= 0 && sales <= 500) {
                comission = (double) (sales * (5.5 / 100));
            } else if (sales > 500 && sales <= 1000) {
                comission = (double) (sales * (8. / 100));
            } else if (sales > 1000 && sales <= 10000) {
                comission = (double) (sales * (12. / 100));
            }else if (sales > 10000){
                comission =  sales * (14.5 / 100);
            }
        }

        if(comission != 0.00){
            System.out.printf("%.2f", comission);
        }else{
            System.out.println("error");
        }

    }
}
