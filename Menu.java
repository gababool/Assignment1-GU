import java.util.Scanner;

public class Menu {

    public static Scanner menuScanner = new Scanner(System.in);
    static int[] studentScores;

    public static void main(String[] args) {
        studentScores = Task1.storeStudentScores();
        Task1.printStudentScores(studentScores);
        menu();
    }

    public static void menu() {

        IOScanner scanner = new IOScanner();

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
        int userInput = scanner.inputInt();
        executeTask(userInput);
    }

    public static void executeTask(int userInput) {
        switch (userInput) {
            case 1:
                studentScores = Task1.storeStudentScores();
                menu();
                break;

            case 2:
                Task1.printStudentScores(studentScores);
                menu();
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                Task5.findHighestScore(studentScores);
                menu();
                break;

            case 6:
                Task6.hashtagFinder();
                menu();
                break;

            case 7:
                System.out.println("Thank you for using our grading system. Have a nice day!");
                break;

            default:
                System.out.println("Please enter a valid option!");
                menu();
                break;

        }
    }

}
