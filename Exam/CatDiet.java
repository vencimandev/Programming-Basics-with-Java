package Izpit;

import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fats = Double.parseDouble(scanner.nextLine());
        double proteins = Double.parseDouble(scanner.nextLine());
        double carbs = Double.parseDouble(scanner.nextLine());
        double calories = Double.parseDouble(scanner.nextLine());
        double water = Double.parseDouble(scanner.nextLine());

        double fatsPerGram = ((fats/100)*2500)/ 9;
        double proteinsPerGram = ((proteins/100)*2500)/ 4;
        double carbsPerGram = ((carbs/100)*2500)/ 4;

        double weight = fatsPerGram + proteinsPerGram + carbsPerGram;
        double weightPerGram = 2500/ weight;
        double oneGram = weightPerGram * (1 - water/ 100);
        System.out.printf("%.4f", oneGram);
    }
}
