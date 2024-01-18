package WhileExercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int with = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int contPieces = with * length;

        while (!command.equals("STOP")) {
            int currentPieces = Integer.parseInt(command);
            contPieces -= currentPieces;

            if (contPieces <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(contPieces));
                break;
            }


            command = scanner.nextLine();
        }

        if (contPieces >= 0) {
            System.out.printf("%d pieces are left.", contPieces);
        }
    }
}

