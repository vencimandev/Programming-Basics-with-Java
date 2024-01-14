package Lab.FirstStepsInCoding;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитане на вход
        int dogfood = Integer.parseInt(scanner.nextLine());
        int catfood = Integer.parseInt(scanner.nextLine());
        //Изчисления
        double PriceDogFood = dogfood*2.50;
        double PriceCatFood = catfood*4;
        double totalSum = PriceDogFood+PriceCatFood;
        System.out.println(totalSum);








    }
}
