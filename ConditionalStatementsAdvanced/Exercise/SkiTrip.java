package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String rating = scanner.nextLine();

        double room = 18;
        double apartment = 25;
        double presidentApartment = 35;
        int nights = days - 1;
        double price = 0;

        if (typeOfRoom.equals("room for one person")) {
            price = nights * room;
        }
        if (typeOfRoom.equals("apartment")) {
            price = nights * apartment;
        }
        if (typeOfRoom.equals("president apartment")) {
            price = nights * presidentApartment;
        }
        double discount = 0;
        if (typeOfRoom.equals("room for one person")) {
            discount = 0;
        } else if (typeOfRoom.equals("apartment") && days < 10) {
            discount = price * 0.3;
        } else if (typeOfRoom.equals("apartment") && days >= 10 && days <= 15) {
            discount = price * 0.35;
        } else if (typeOfRoom.equals("apartment") && days > 15) {
            discount = price * 0.50;
        } else if (typeOfRoom.equals("president apartment") && days < 10) {
            discount = price * 0.1;
        } else if (typeOfRoom.equals("president apartment") && days >= 10 && days <= 15) {
            discount = price * 0.15;
        } else if (typeOfRoom.equals("president apartment") && days > 15) {
            discount = price * 0.2;
        }
        double finalPrice = price - discount;
        double positive = finalPrice * 1.25;
        double negative = finalPrice * 0.9;
        if (rating.equals("positive")) {
            System.out.printf("%.2f", positive);

        } else if (rating.equals("negative")) {
            System.out.printf("%.2f", negative);
        }
    }
}

