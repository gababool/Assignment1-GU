import java.util.Locale;

// This class contains all logic related to student scores and some additional helper methods to calculate and print them.

public class Students {

    private static int amountOfStudents = 7;
    private static int[] studentScores = new int[amountOfStudents];
    
    // Change to a while loop!

    public static void readStudentScores() {
        for (int i = 0; i <= studentScores.length - 1; i++) {
            System.out.print("Enter the score for the " + addOrdinalIndicator(i + 1) + " student ");
            studentScores[i] = IOScanner.inputInt();
            IOScanner.inputString(); // Works as nextLine();

            if (studentScores[i] < 0 || studentScores[i] > 100) {
                System.out.println("Error - Input out of bound. Score can only be between 0 and 100.");
                i--;
            }
        }
        System.out.println("Thank you for your input.");
    }

    public static void printStudentScores() {
        String scores = "";
        for (int i = 0; i < studentScores.length; i++) {
            scores += studentScores[i];
            if (i < studentScores.length - 1) {
                scores += ", ";
            }
        }
        System.out.println("Your entered scores are:\n" + scores);
    }

    public static void calculateMeanOfScores() {
        int totalScore = 0;

        for (int i = 0; i < studentScores.length; i++) {

            totalScore += studentScores[i];
        }
        double mean = (double) totalScore / studentScores.length;

        System.out.printf(Locale.ENGLISH, "The mean of the numbers is %.2f ", mean);
    }

    public static void findHighestAndLowestScores() {
        int highest = 0;
        int secondHighest = 0;
        int lowest = 100;
        int secondLowest = 100;

        for (int i = 0; i < studentScores.length; i++) {
            int currentScore = studentScores[i];

            if (currentScore > highest) {
                secondHighest = highest;
                highest = currentScore;
            } else if (currentScore > secondHighest) {
                secondHighest = currentScore;
            }
            if (currentScore < lowest) {
                secondLowest = lowest;
                lowest = currentScore;
            } else if (currentScore < secondLowest) {
                secondLowest = currentScore;
            }
        }
        System.out.println("The two lowest scores provided are " + lowest + ", and " + secondLowest);
        System.out.println("The two highest scores provided are " + highest + ", and " + secondHighest);

    }

    public static void findHighestScore() {
        int highestScore = studentScores[0];
        int highestScoreIndex = 0;

        for (int i = 0; i <= studentScores.length - 1; i++) {
            if (studentScores[i] > highestScore) {
                highestScore = studentScores[i];
                highestScoreIndex = i;
            }
        }
        System.out.println("The highest score is " + highestScore + " and belongs to the "
                + addOrdinalIndicator(highestScoreIndex + 1) + " student");

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
