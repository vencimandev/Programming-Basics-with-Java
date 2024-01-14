package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.nextLine();

        //Да се напише програма, която чете ден от седмицата(текст) и принтира цената за конкретния ден.

        switch (dayOfWeek){
            case "Monday":
            case "Tuesday":
            case "Friday":
                int ticketPrice = 12;
                System.out.println(ticketPrice);
                break;
            case "Wednesday":
            case "Thursday":
                int ticketPrice2 = 14;
                System.out.println(ticketPrice2);
                break;
            case "Saturday":
            case "Sunday":
                int ticketPrice3 = 16;
                System.out.println(ticketPrice3);
                break;
        }
    }
}
