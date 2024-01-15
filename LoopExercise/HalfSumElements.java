package LoopExercise;

import java.util.Scanner;

public class HalfSumElements {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int arraySize = sc.nextInt();

            int elementi[] = new int[arraySize];

            // populvame masiva
            for (int i = 0; i < arraySize; i++) {
                elementi[i] = Math.abs(sc.nextInt());
            }

            int total = 0;
            for (int i = 0; i < arraySize; i++) {
                total += elementi[i];
            }

            Boolean flagMatch = false;
            int flagMatchInt = 0;
            int biggestSoFar = 0;

            for (int i = 0; i < arraySize; i++) {
                if (total - elementi[i] == elementi[i]) {
                    flagMatch = true;
                    flagMatchInt = elementi[i];
                }
                if (elementi[i] > biggestSoFar) {
                    biggestSoFar = elementi[i];
                }
            }

            if (flagMatch) {
                System.out.println("Yes");
                System.out.println("Sum = " + total);
            } else {
                System.out.println("No");
                System.out.println("Diff = " + Math.abs(biggestSoFar - (total - biggestSoFar)));
            }
        }
    }

