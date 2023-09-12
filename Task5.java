public class Task5 {

    public static void findHighestScore(int[] studentScores) {
        int highestScore = studentScores[0];
        int highestScoreIndex = 0;
        String[] ordinalIndicators = Task1and2.getOrdinalIndicators();

        for (int i = 0; i <= studentScores.length - 1; i++) {
            if (studentScores[i] > highestScore){
                highestScore = studentScores[i];
                highestScoreIndex = i;
            }
        }
        System.out.println("The highest score is " + highestScore + " and belong to the " + highestScoreIndex
                + ordinalIndicators[highestScoreIndex + 1]);
    }
}
