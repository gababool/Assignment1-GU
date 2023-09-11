import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);
    static int userInput;
    static int[] studentScores;

    public static void main(String[] args) {
       Task1.storeStudentScores();
       menu();
    }

    public static void menu(){
        
        System.out.println("\n Welcome to the menu. Choose one of the options below: \n");
        
        System.out.println("1. Register new scores for students.");
        System.out.println("2. Print all registered grades.");
        System.out.println("3. Calculate the mean of the entered scores.");
        System.out.println("4. Find the two highest and two lowest scores.");
        System.out.println("5. Find the highest score and its position.");
        System.out.println("6. Collect hashtags from a post.");
        System.out.println("7. To exit. \n");

        System.out.print("Type your option: ");

        userInput = scanner.nextInt();
        executeTask(userInput);
    }

    public static void executeTask(int userChoice){
        switch (userChoice){
            case 1: 
            studentScores = Task1.storeStudentScores();
            menu();
            break;

            case 2: 
            break;

            case 3:
            break;

            case 4:
            break;

            case 5:
            break;

            case 6:
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

