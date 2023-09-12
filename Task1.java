import java.util.Scanner;

public class Task1 {

    private static Scanner input = new Scanner(System.in);
    static int[] studentScores = new int[7];
    private static String[] ordinalIndicators = { "st", "nd", "rd", "th" };

    // For other people to be able to use ordinal indicators.
    public static String[] getOrdinalIndicators() {
        return ordinalIndicators;
    }

    public static int[] storeStudentScores() {

        for (int i = 0; i <= studentScores.length - 1; i++) {
            if (i <= ordinalIndicators.length - 2) {
                System.out.print("Enter the score of the " + (i + 1) + ordinalIndicators[i] + " student: ");
                studentScores[i] = input.nextInt();
                input.nextLine();
            } else {
                System.out.print("Enter the score of the " + (i + 1) + ordinalIndicators[3] + " student: ");
                studentScores[i] = input.nextInt();
                input.nextLine();
            }
            if (studentScores[i] < 0 || studentScores[i] > 100) {
                System.out.println("Error - Input out of bounds. Enter a score between 0 and 100.");
                i--;
            }
        }
        System.out.println("Thank you for your input.");
        return studentScores;

    }

    public static void printStudentScores(int[] studentScores) {
        String scores = "";
        for (int i = 0; i < studentScores.length; i++) {
            scores += studentScores[i];
            if (i < studentScores.length - 1) {
                scores += ", ";
            }
        }
        System.out.println("Your entered scores are: \n" + scores);
    }

}
