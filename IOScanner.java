import java.util.Scanner;

public class IOScanner {
    private static Scanner scanner = new Scanner(System.in);

    public Scanner getScanner() {
        return scanner;
    }

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
