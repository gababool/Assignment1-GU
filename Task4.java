public class Task4 {

    public static void highestAndLowestScore(int[] studentScores) {

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
}
