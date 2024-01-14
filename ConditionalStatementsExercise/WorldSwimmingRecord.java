package ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());
        double delay = Math.floor((distance/15))*12.5;
        double result = (distance*timeForOneMeter) + delay;

        if (worldRecord>result){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", result);
        }else{
            double diff = result - worldRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }
    }
}
