package Izpit;

import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayGoal = Integer.parseInt(sc.nextLine());
        int earnedMoney = 0;
        while (dayGoal > 0) {
            String firstLine = sc.nextLine();

            if (firstLine.equals("closed")) {
                break;
            }
            String secondLine = sc.nextLine();

            if (secondLine.equals("mens")) {
                dayGoal -= 15;
                earnedMoney += 15;
            }
            if (secondLine.equals("ladies")) {
                dayGoal -= 20;
                earnedMoney += 20;
            }
            if (secondLine.equals("kids")) {
                dayGoal -= 10;
                earnedMoney += 10;
            }
            if (secondLine.equals("touch up")) {
                dayGoal -= 20;
                earnedMoney += 20;
            }
            if (secondLine.equals("full color")) {
                dayGoal -= 30;
                earnedMoney += 30;
            }

        }

        if (dayGoal > 0) {
            System.out.println("Target not reached! You need " + dayGoal + "lv. more.");
            System.out.println("Earned money: " + earnedMoney + "lv.");
        }
        if (dayGoal <= 0) {
            System.out.println("You have reached your target for the day!");
            System.out.println("Earned money: " + earnedMoney + "lv.");
        }
    }
}