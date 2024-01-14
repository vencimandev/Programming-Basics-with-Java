package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        //Premiere -> 12 лв
        // Normal -> 7.50 лв
        //Discount -> 5.00 лв

        double income = 0;

        if ("Premiere".equals(projection)) {
            income = rows * columns * 12;
        } else if ("Normal".equals(projection)) {
            income = rows * columns * 7.50;
        } else if ("Discount".equals(projection)) {
            income = rows * columns * 5;
        }
        System.out.printf("%.2f", income);
    }
}
