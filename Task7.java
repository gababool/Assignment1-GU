import java.util.Scanner;

public class Task7 {

    private static Scanner scanner = new Scanner(System.in);
    private static int userChoice;
    
    public static int menu(){
        System.out.println("Welcome to the menu. Choose one of the options below: \n");
        
        System.out.println("1. Register new scores for students.");
        System.out.println("2. Print all registered grades.");
        System.out.println("3. Calculate the mean of the entered scores.");
        System.out.println("4. Find the two highest and two lowest scores.");
        System.out.println("5. Find the highest score and its position.");
        System.out.println("6. Collect hashtags from a post.");
        System.out.println("7. To exit. \n");

        System.out.print("Type your option: ");

        userChoice = scanner.nextInt();
        return userChoice;
    }


}
