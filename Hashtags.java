
// This class contains methods related to finding Hashtags, which is unrelated to student scores.

public class Hashtags {

    public static void collectHashtags() {
        String sentence = IOScanner.inputString("Type a sentence using hashtags: ");
        String[] stringArray = sentence.split(" ");

        String foundHashtags = "";
        int hashtagCounter = 0;
        for (int i = 0; i <= stringArray.length - 1; i++) {
            String word = stringArray[i];
            if (word.startsWith("#")) {
                if (hashtagCounter > 0) {
                    foundHashtags += " ";
                }
                foundHashtags += word;
                hashtagCounter++;
            }
        }
        if (hashtagCounter == 0) {
            System.out.println("No hashtags were typed");
        } else {
            System.out.println("Hashtags found: " + foundHashtags);
        }
    }
}
