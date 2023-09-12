public class Task6 {

    public static void hashtagFinder(){
        System.out.println("Type a sentence using hashtags: ");
        String sentence = IOScanner.inputString();
        String[] stringArray = sentence.split(" ");
        
        String foundHashtags = "";
        int hashtagCounter = 0;
        for (int i = 0; i <= stringArray.length-1; i++){
            String word = stringArray[i];
            if (word.contains("#")){
                if (hashtagCounter > 0){
                    foundHashtags += " ";
                }
                foundHashtags += word;
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
