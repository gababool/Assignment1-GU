public class Task4 {

    public static void highestAndLowestScore(int[] studentScores) {

        int highest = studentScores[0];
        int secondHighest = studentScores[0];
        int lowest = studentScores[0];
        int secondLowest = studentScores[0];

        for (int i = 0; i < studentScores.length; i++) {

            if (highest < studentScores[i]) {
                highest = studentScores[i];
            }
            if (lowest > studentScores[i]) {
                lowest = studentScores[i];
            }
        }
        System.out.println("The two lowest scores provided are " + lowest + ", and " + secondLowest);
        System.out.println("The two highest scores provided are " + highest + " ,and " + secondHighest);

    }
}
