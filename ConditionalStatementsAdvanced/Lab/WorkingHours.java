package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитане на входни данни
        //Час от денонощието -> цяло число
        // Ден от седмицата -> текст

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        //работното време на офисът е от 10-18 часа, от понеделник до събота включително

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (hour >= 10 && hour <= 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
                break;
            case "Sunday":
                System.out.println("closed");
                break;
        }
    }
}