package NestedLoops;

import java.util.Scanner;

public class EqualSumEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int first = firstNumber; first <= secondNumber; first++) {

            int currentSxtNumber = first % 10;
            int currentFifthNumber = first / 10 % 10;
            int currentForthNumber = first / 100 % 10;
            int currentThirdNumber = first / 1000 % 10;
            int currentSecondNumber = first / 10000 % 10;
            int currentFirstNumber = first / 100000 % 10;

            int sumOdd = currentFirstNumber + currentThirdNumber + currentFifthNumber;
            int sumEven = currentSecondNumber + currentForthNumber + currentSxtNumber;

            if (sumOdd == sumEven) {
                System.out.printf("%d ", first);
            }

        }
    }
}

