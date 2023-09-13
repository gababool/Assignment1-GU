import java.util.Scanner;

// This class is a reusable Scanner which eliminates the need to import one in different places.

public class IOScanner {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt() {
        return scanner.nextInt();
    }

    public static String inputString() {
        return scanner.nextLine();
    }

    public static double inputDouble() {
        return scanner.nextDouble();
    }

    public static void close() {
        scanner.close();
    }
}
