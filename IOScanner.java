import java.util.Scanner;

// This class is a reusable IOScanner which eliminates the need to import one in different places.

public class IOScanner {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String message) {
        System.out.println(message);
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public static String inputString(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public static double inputDouble(String message) {
        System.out.println(message);
        double input = scanner.nextDouble();
        scanner.nextLine();
        return input;
    }

    public static void close() {
        scanner.close();
    }
}
