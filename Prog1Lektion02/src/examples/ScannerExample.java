package examples;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Lav et nyt Scanner objekt.
        System.out.print("Indtast dit navn: "); //Udskriver en besked til brugeren.
        String name = scanner.next(); // Venter på brugerindput og gemmer resultatet i en variabel.
        System.out.println("Hej " + name); // Udskriver Hej efterfulgt af hvad der er gemt i variablen name.
    }
}
