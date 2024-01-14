package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //Четем данните от входа
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceCloth = Double.parseDouble(scanner.nextLine());

        //Пресмятаме
        double decor = budget*0.10;
        double discount = 0;
        double totalPriceCloth = statists*priceCloth;
        double priceAfterDisc = totalPriceCloth-discount;
        double priceMovie = decor+totalPriceCloth;

        if (statists>150){
            discount = totalPriceCloth*0.10;
            priceAfterDisc=totalPriceCloth-discount;
            priceMovie= priceAfterDisc+decor;
        } if (priceMovie>budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",Math.abs(budget-priceMovie));
        } if (priceMovie<=budget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget-priceMovie);
        }
    }
}