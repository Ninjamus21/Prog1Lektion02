package opgave01;

import java.util.Scanner;

public class CalculateVat {
    //Beskriv din algoritme
    // beløb / moms * 100
    // beløb = scanner input / moms = final constant / * ganger med 100 for at få kr beløbet efter momsen :)
    public static void main(String[] args) {
        MomsBeregner();
    }
    static void MomsBeregner(){
        Scanner scanner = new Scanner(System.in);
        final int moms = 25;
        System.out.println("Hvad er dit beløb:");
        int belob = scanner.nextInt();
        System.out.println("Du betaler " + (belob / 100) * moms + "kr moms ud af " + belob + "Kr") ;
    }
} // Done
