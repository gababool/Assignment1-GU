import java.util.Scanner;

public class Task6 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void hashtagFinder(){
        System.out.println("Type a sentence using hashtags: ");
        String sentence = scanner.nextLine();
        String[] stringArray = sentence.split(" ");
        String foundHashtags = "";

        for (String word: stringArray){
            if (word.contains("#")){
                foundHashtags += word + " ";
            }
        }
        System.out.println("Hashtags found: " + foundHashtags);
    }

}
