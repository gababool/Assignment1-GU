public class Task3 {

    public static void meanOfScores(int[] studentScores) {
        int totalScore = 0;

        int scores = 0;
        for (int i = 0; i < studentScores.length; i++) {
            scores += studentScores[i];

            totalScore = totalScore + scores;

        }
    }
}
