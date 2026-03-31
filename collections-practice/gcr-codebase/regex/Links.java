import java.util.regex.*;
public class Links {
    public static void main(String[] args) {
        String text="Visit https://www.google.com and http://example.org for more info.";
        Matcher matcher=Pattern.compile("https?://[A-Z][a-z][0-9]+\\.[A-Z][a-z]{2,}").matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }


    }

    
}
