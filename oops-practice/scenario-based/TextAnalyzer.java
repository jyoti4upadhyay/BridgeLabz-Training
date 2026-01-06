public class TextAnalyzer {
    public static void analyzeText(String para,String wordToReplace,String replacementWord){
         if (para== null || para.trim().isEmpty()) {
            System.out.println("Paragraph is empty or contains only spaces.");
            return;
        }

        String cleanText= para.trim().replace("\\s+", " ");

        String []words= cleanText.split("[^a-zA-Z]+");

         int wordCount = words.length;

         // Find longest word
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        //  Replace word (case-insensitive)
        String replacedText = cleanText.replaceAll(
                "(?i)\\b" + wordToReplace + "\\b",
                replacementWord
        );

        
        System.out.println("Word Count: " + wordCount);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Updated Paragraph: " + replacedText);

    }
    public static void main(String[] args) {
          String paragraph = "Hey My name is Jyoti";
        analyzeText(paragraph, "Jyoti", "Vipul");
    }
}