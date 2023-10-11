public class Menu {

    // This class contains all logic related to the menu where the user can choose what to do.

    public static void main(String[] args) {
        Students.readStudentScores();
        Students.printStudentScores();
        menu();
    }

    public static void menu() {

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
        executeTask(userInput);
    }

    public static void executeTask(int userInput) {
        switch (userInput) {
            case 1:
                Students.readStudentScores();
                break;

            case 2:
                Students.printStudentScores();
                break;

            case 3:
                Students.calculateMeanOfScores();
                break;

            case 4:
                Students.findHighestAndLowestScores();
                break;

            case 5:
                Students.findHighestScore();
                break;

            case 6:
                Hashtags.collectHashtags();
                break;

            case 7:
                System.out.println("Thank you for using our grading system. Have a nice day!");
                IOScanner.close();
                return;

            default:
                System.out.println("Error - Invalid value. Please type between 1 and 7");
                break;

        }
        menu();
    }

}
