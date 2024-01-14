package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double qty = Double.parseDouble(scanner.nextLine());
            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
                    || day.equals("Friday")) {
                if ("banana".equals(fruit)) {
                    double priceBanana = qty * 2.50;
                    System.out.printf("%.2f", priceBanana);
                } else if ("apple".equals(fruit)) {
                    double priceApple = qty * 1.20;
                    System.out.printf("%.2f", priceApple);
                } else if ("orange".equals(fruit)) {
                    double priceOrange = qty * 0.85;
                    System.out.printf("%.2f", priceOrange);
                } else if ("grapefruit".equals(fruit)) {
                    double priceGrapefruit = qty * 1.45;
                    System.out.printf("%.2f", priceGrapefruit);
                } else if ("kiwi".equals(fruit)) {
                    double priceKiwi = qty * 2.70;
                    System.out.printf("%.2f", priceKiwi);
                } else if ("pineapple".equals(fruit)) {
                    double pricePineapple = qty * 5.50;
                    System.out.printf("%.2f", pricePineapple);
                } else if ("grapes".equals(fruit)) {
                    double priceGrapes = qty * 3.85;
                    System.out.printf("%.2f", priceGrapes);
                } else {
                    System.out.println("error");
                }

            } else if (day.equals("Saturday") || day.equals("Sunday")) {
                if ("banana".equals(fruit)) {
                    double priceBanana = qty * 2.70;
                    System.out.printf("%.2f", priceBanana);
                } else if ("apple".equals(fruit)) {
                    double priceApple = qty * 1.25;
                    System.out.printf("%.2f", priceApple);
                } else if ("orange".equals(fruit)) {
                    double priceOrange = qty * 0.90;
                    System.out.printf("%.2f", priceOrange);
                } else if ("grapefruit".equals(fruit)) {
                    double priceGrapefruit = qty * 1.60;
                    System.out.printf("%.2f", priceGrapefruit);
                } else if ("kiwi".equals(fruit)) {
                    double priceKiwi = qty * 3.00;
                    System.out.printf("%.2f", priceKiwi);
                } else if ("pineapple".equals(fruit)) {
                    double pricePineapple = qty * 5.60;
                    System.out.printf("%.2f", pricePineapple);
                } else if ("grapes".equals(fruit)) {
                    double priceGrapes = qty * 4.20;
                    System.out.printf("%.2f", priceGrapes);
                } else {
                    System.out.println("error");
                }
            }
        }
    }

