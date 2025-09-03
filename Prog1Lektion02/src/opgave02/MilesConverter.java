package opgave02;

import java.util.Formatter;
import java.util.Scanner;

public class MilesConverter {
    public static void main(String[] args) {
        MileTilKilometerOmregner();
    }

    static void MileTilKilometerOmregner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvor mange mile:");
        double mile = scanner.nextDouble();

        double kilometer = mile * 1.6;

        System.out.printf("Der er %.2f kilometer på %.2f mile%n", kilometer, mile);

    }
} // done
