package Lab.FirstStepsInCoding;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double priceNoDiscount = 7.61*area;
        double discount = priceNoDiscount*0.18;
                System.out.println(priceNoDiscount - discount);
                System.out.println(discount);

    }
}
