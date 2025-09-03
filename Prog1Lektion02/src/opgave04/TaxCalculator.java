package opgave04;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Formations logic
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setGroupingSeparator('.');
        DecimalFormat df = new DecimalFormat("#,###", symbols);
        // System info and output
        System.out.print("Indtast månedlig indkomst ");
        int income = scanner.nextInt();
        int yearlyTax = calculateTax(income);
        System.out.println("Årlig skat er " + df.format(yearlyTax) + "kr");
        System.out.println("Månedligt betales " + df.format(yearlyTax / 12) + "kr");

    }

    public static int calculateTax(int monthlyIncome) {
        final int TOPSKATLIMIT = 568_900;
        final int TOPSKATTAXATIONRATE = 15; // 15%
        final int BASEDEDUCTION = 48_000;
        final int BASETAXATION = 37; // 37%

        int yearlyIncome = monthlyIncome * 12;

        if (yearlyIncome <= 0) {
            return 0;
        }
        if (yearlyIncome > TOPSKATLIMIT){
            int TopSkatTax = (yearlyIncome - TOPSKATLIMIT) * TOPSKATTAXATIONRATE / 100;
            System.out.println("Concrats you have payed TOPSKAT 🔥🔥🔥🔥" + (TopSkatTax) + "kr");
            yearlyIncome -= TopSkatTax; // fjerner den betalte topskat fra årligt fortjening for ikke at betale skat af topskatten
        }
            if (yearlyIncome > BASEDEDUCTION) {
                int taxableIncome = (yearlyIncome - BASEDEDUCTION);
                int yearlyTax = taxableIncome * BASETAXATION / 100;
                return yearlyTax;
            } else {
                System.out.println("No tax needs to be payed, you earn too little " + yearlyIncome + "kr");
                return 0;
            }
        }
    } //done