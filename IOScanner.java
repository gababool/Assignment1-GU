import java.util.Scanner;

public class IOScanner {
    private Scanner scanner = new Scanner(System.in);

    public Scanner getScanner() {
        return scanner;
    }

    public int inputInt() {
        return scanner.nextInt();
    }

    public String inputString() {
        return scanner.nextLine();
    }

    public double inputDouble() {
        return scanner.nextDouble();
    }

    public void close() {
        scanner.close();
    }
}
