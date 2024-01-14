package ConditionalStatementsExercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoC = Integer.parseInt(scanner.nextLine());
        int proc = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = videoC * 250;
        double priceProc = videoCardPrice * 0.35;
        double proc1 = priceProc * proc;

        double ramPrice = videoCardPrice * 0.1;
        double ram1 = ramPrice * ram;

        double all = videoCardPrice + proc1 + ram1;

        if (videoC > proc) {
            all = all - all * 0.15;
        }

        if (budget >= all) {
            double a;
            a = budget - all;
            System.out.printf("You have %.2f leva left!", a);
        } else {
            double b;
            b = all - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", b);
        }
    }
}