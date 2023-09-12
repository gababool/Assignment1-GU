import java.util.Scanner;

public class Task6 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void hashtagFinder(){
        System.out.println("Type a sentence using hashtags: ");
        String sentence = scanner.nextLine();
        String[] stringArray = sentence.split(" ");
        
        String foundHashtags = "";
        int hashtagCounter = 0;
        for (String word: stringArray){
            if (word.contains("#")){
                foundHashtags += word + " ";
                hashtagCounter++;
            }
        }
        if (hashtagCounter == 0){
            System.out.println("No hashtags were typed");
        } else {
            System.out.println("Hashtags found: " + foundHashtags);
        }
    }

}
