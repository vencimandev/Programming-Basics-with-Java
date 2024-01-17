package Izpit;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1; // 1-9
        int b = 9; // 9 - a
        int c = 0; // 0 - 9
        int d = 9; // 9 - c
        System.out.println(" ");
        int n = sc.nextInt();
        boolean exit = false;
        for (int x = 1; x < 9; x++) {
            a = x;
            for (int y = 9; y > a; y--) {
                b = y;
                for (int z = 0; z < 9; z++) {
                    c = z;
                    for (int k = 9; k > c; k--) {
                        d = k;
                        int sum = a + b + c + d;
                        int multiply = a * b * c * d;
                        if (sum == multiply && n % 10 == 5) {
                            int result = a * 1000 + b * 100 + c * 10 + d;
                            System.out.println(result);
                            exit = true;
                            break;
                        } else if (multiply / sum == 3 && n % 3 == 0) {
                            int result = d * 1000 + c * 100 + b * 10 + a;
                            System.out.println(result);
                            exit = true;
                            break;
                        }
                    }
                    if (exit) {
                        break;
                    }

                }
                if (exit) {
                    break;
                }
            }
        }

    }
}