package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        // May, June, July,August, September or October
        int countNights = Integer.parseInt(scanner.nextLine());
        double priceForApartments = 0;
        double priceForStudio = 0;
        switch (month) {
            case "May":
            case "October":
                priceForApartments = countNights * 65;
                priceForStudio = countNights * 50;
                if (countNights > 7 && countNights <= 14) {
                    priceForStudio = priceForStudio * 0.95;
                } else if (countNights > 14) {
                    priceForStudio = priceForStudio * 0.7;
                    priceForApartments = priceForApartments * 0.9;

                }
                break;
            case "June":
            case "September":
                priceForApartments = countNights * 68.70;
                priceForStudio = countNights * 75.20;
                if (countNights > 14) {
                    priceForApartments = priceForApartments * 0.9;
                    priceForStudio = priceForStudio * 0.8;
                }
                break;
            case "July":
            case "August":
                priceForApartments = countNights * 77;
                priceForStudio = countNights * 76;
                if (countNights > 14) {
                    priceForApartments = priceForApartments * 0.9;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", priceForApartments);
        System.out.printf("Studio: %.2f lv.%n", priceForStudio);
    }
}
