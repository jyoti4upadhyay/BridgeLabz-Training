import java.util.Scanner;
import java.util.regex.*;
public class CapitalWord {
    public static void checkCapitalWord(String input){
        Pattern pattern=Pattern.compile("[A-Z][a-z]*");
        Matcher matcher=pattern.matcher(input);
        if(matcher.matches()){
            System.out.println(input);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String sentence=sc.nextLine();
        String[] words=sentence.split(" ");

        for(String word:words){
            CapitalWord.checkCapitalWord(word);
            
        }
    }

    
}
