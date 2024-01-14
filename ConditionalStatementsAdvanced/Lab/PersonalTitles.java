package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Входни данни -> age (double) -> gender (String)
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        // Проверка за пола -> "m" или "f" -> switch
        switch (gender){
            case "m":
                if (age<16){
                    System.out.println("Master");
                }else{
                    System.out.println("Mr.");
                }
                break;
            case "f":
                if (age<16){
                    System.out.println("Miss");
                }else{
                    System.out.println("Ms.");
                }
                break;

        }




    }
}
