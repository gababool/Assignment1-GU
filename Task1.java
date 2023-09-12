import java.util.Scanner;

public class Task1 {

    private static Scanner input = new Scanner(System.in);
    static int[] studentScores = new int[7];

    public static int[] storeStudentScores() {

        for (int i = 0; i <= studentScores.length - 1; i++) {
            System.out.print("Enter the score of the " + addOrdinalIndicator(i + 1) + " student: ");
            studentScores[i] = input.nextInt();
            input.nextLine();

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

    public static String addOrdinalIndicator(int number) {
        int lastDigit = number % 10;
        switch (lastDigit) {
            case 1:
                return number + "st";
            case 2:
                return number + "nd";
            case 3:
                return number + "rd";
            default:
                return number + "th";
        }

    }
}
