package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входни данни -> текст -> Ден от седмицата
        //Правим серия от проверки
        //Monday-> Working day
        //Tuesday -> Working day
        //WednesDay -> Working day
        //Thursday -> Working day
        //Friday -> Working day
        //Saturday -> Weekend
        //Sunday -> Weekend
        //Other -> Error

        String dayOfWeek = scanner.nextLine();
switch (dayOfWeek){
    case "Monday":
    case "Tuesday":
    case "Wednesday":
    case "Thursday":
    case "Friday":
        System.out.println("Working day");
        break;
    case "Saturday":
    case "Sunday":
        System.out.println("Weekend");
        break;
    default:
        System.out.println("Error");
        break;



}






    }
}
