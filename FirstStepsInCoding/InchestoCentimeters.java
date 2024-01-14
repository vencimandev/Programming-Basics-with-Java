package Lab.FirstStepsInCoding;

import java.util.Scanner;

public class InchestoCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double inches = Double.parseDouble(scanner.nextLine());
       Double centimeters = inches*2.54;
       System.out.println(centimeters);
    }
}
