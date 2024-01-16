package WhileLoopLab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String student = scanner.nextLine();
        // ако годишната му оценка е по-голяма или равна на 4
        int goodGradesCounts = 1;
        int poorGradesCounts = 0;
        double allGradesSum = 0;
        boolean isExluded = false;
        while (goodGradesCounts <= 12) {
            if (poorGradesCounts == 2) {
                isExluded = true;
                break;
            }
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade < 4) {
                poorGradesCounts++;
                continue;
            }
            allGradesSum += currentGrade;
            goodGradesCounts++;
        }
        double averageScore = allGradesSum / 12;
        if (isExluded) {
            System.out.printf("%s has been excluded at %s grade ", student, goodGradesCounts, allGradesSum );
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", student, averageScore);
        }
    }
}
