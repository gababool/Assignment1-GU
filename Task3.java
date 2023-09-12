import java.util.Locale;

public class Task3 {

    public static void meanOfScores(int[] studentScores) {
        int totalScore = 0;

        for (int i = 0; i < studentScores.length; i++) {

            totalScore += studentScores[i];
        }
        double mean = (double) totalScore / studentScores.length;

        System.out.printf(Locale.ENGLISH, "The mean of the numbers is %.2f ", mean);
    }
}
