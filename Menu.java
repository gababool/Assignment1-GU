public class Menu {
    static int[] studentScores;

    public static void main(String[] args) {
        studentScores = Task1.inputStudentScores(7);
        Task1.printStudentScores(studentScores);
        menu();
    }

    public static void menu() {
        boolean keepGoing = true;
        do {
            System.out.println("\nWelcome to the menu. Choose one of the options below: \n");

            System.out.println("1. Register new scores for students.");
            System.out.println("2. Print all registered grades.");
            System.out.println("3. Calculate the mean of the entered scores.");
            System.out.println("4. Find the two highest and two lowest scores.");
            System.out.println("5. Find the highest score and its position.");
            System.out.println("6. Collect hashtags from a post.");
            System.out.println("7. To exit. \n");

            System.out.print("Type your option: ");

            // int userInput = menuScanner.nextInt();
            int userInput = IOScanner.inputInt();
            IOScanner.inputString();
            keepGoing = executeTask(userInput);

        } while (keepGoing);
    }

    public static boolean executeTask(int userInput) {
        switch (userInput) {
            case 1:
                studentScores = Task1.inputStudentScores(7);
                break;

            case 2:
                Task1.printStudentScores(studentScores);
                break;

            case 3:
                Task3.meanOfScores(studentScores);
                break;

            case 4:
                Task4.highestAndLowestScore(studentScores);
                break;

            case 5:
                Task5.findHighestScore(studentScores);
                break;

            case 6:
                Task6.hashtagFinder();
                break;

            case 7:
                System.out.println("Thank you for using our grading system. Have a nice day!");
                IOScanner.close();
                return false;

            default:
                System.out.println("Error - Invalid value. Please type between 1 and 7");
                break;

        }
        return true;
    }

}
