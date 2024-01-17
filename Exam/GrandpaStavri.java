package Izpit;

import java.util.Scanner;

public class GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int days = Integer.parseInt(scanner.nextLine());

    double litersTotal = 0;
    double averageDegrees = 0;
    String result = "";

        for (int i = 0; i < days; i++) {
        double liters = Double.parseDouble(scanner.nextLine());
        double degrees = Double.parseDouble(scanner.nextLine());

        litersTotal += liters;
        averageDegrees += liters * degrees;
        if (i == days - 1) {
            averageDegrees = averageDegrees / litersTotal;
        }
    }
        if (averageDegrees < 38) {
        result = "Not good, you should baking!";
    } else if (averageDegrees <= 42) {
        result = "Super!";
    } else {
        result = "Dilution with distilled water!";
    }
        System.out.printf("Liter: %.2f%n", litersTotal);
        System.out.printf("Degrees: %.2f%n", averageDegrees);
        System.out.println(result);
    }
}

