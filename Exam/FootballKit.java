package Izpit;

import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceTshirt = Double.parseDouble(scanner.nextLine());
        double neededSumForBallPrice = Double.parseDouble(scanner.nextLine());
        double shortsPrice = priceTshirt * 0.75;
        double socksPrice = shortsPrice * 0.20;
        double shoesPrice = (priceTshirt + shortsPrice) * 2;
        double totalWithoutDiscount = priceTshirt + shortsPrice + socksPrice + shoesPrice;
        double discount = totalWithoutDiscount * 0.15;
        double discountedPrice = totalWithoutDiscount - discount;
        double moneyNeeded = (neededSumForBallPrice - discount);
        double difference = Math.abs(discountedPrice - neededSumForBallPrice);

        if (discountedPrice >= neededSumForBallPrice){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", discountedPrice);
        }else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", (difference));
        }

    }
}
