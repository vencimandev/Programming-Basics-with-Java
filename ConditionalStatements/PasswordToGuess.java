package ConditionalStatements;

import java.util.Scanner;

public class PasswordToGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String correctPassword = "s3cr3t!P@ssw0rd";
        if (password.equals(correctPassword)){
    System.out.println("Welcome");
    }  else {
    System.out.println("Wrong password!");
        }
    }
}
