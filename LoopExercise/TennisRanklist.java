package LoopExercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countTournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int sumPoints = initialPoints;
        int countWins = 0;


        for (int i = 1; i <= countTournaments; i++) {
            String tournamentStage = scanner.nextLine();

            if (tournamentStage.equals("W")) {
                sumPoints = sumPoints + 2000;
                countWins++; // countWins = countWins + 1;  countWins += 1
            } else if (tournamentStage.equals("F")) {
                sumPoints += 1200;
            } else if (tournamentStage.equals("SF")) {
                sumPoints += 720;
            }
        }

        int tournamentPoints = sumPoints - initialPoints;
        double percentWinsTournaments = (1.0 * countWins / countTournaments) * 100;

        System.out.printf("Final points: %d%n", sumPoints);
        System.out.printf("Average points: %d%n", tournamentPoints / countTournaments);
        System.out.printf("%.2f%%", percentWinsTournaments);
    }
}

