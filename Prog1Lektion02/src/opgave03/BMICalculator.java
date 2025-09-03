package opgave03;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        double bmi = CalculateBMI();
        BMITester(bmi);
    }

    static double CalculateBMI() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvad er vægten i kg");
        double vaegt = scanner.nextDouble();
        System.out.println("Hvad er din højde i cm");
        double hojdeCm = scanner.nextDouble();

        // BMI logic $BMI = \frac{vægt}{højde*højde}$
        double hojdeMeter = hojdeCm / 100;
        double bmi = (vaegt / (Math.pow(hojdeMeter, 2)));
        System.out.printf("Din BMI er: " + String.format("%.1f", bmi) + "%n");
        return bmi;
    }

    static void BMITester(double bmi) {
        if (bmi > 30) {
            System.out.println("Big boy");
        } else if (bmi > 25) {
            System.out.println("overaverage boy");
        } else if (bmi > 20) {
            System.out.println("Normal homie");
        } else if (bmi > 15) {
            System.out.println("lil boy");
        } else if (bmi > 10) {
            System.out.println("micro boy");
        } else if (bmi > 5) {
            System.out.println("Eat a sandwich please");
        } else if (bmi > 0) {
            System.out.println("Skeleton");
        } else {
            System.out.println("not at positive number");
        }
    }
} // done
