package examples;

public class PrintfExample {
    public static void main(String[] args) {
        double aNumber = 389.85263;
        // f er en forkortelse for floating point og gælder for typerne float og double
        // .3 angiver at man vil have 3 decimaler efter komma.
        // \n er for at lave et linjeskift.
        System.out.printf("%f med 3 decimaler er %.3f\n", aNumber, aNumber);
    }
}
