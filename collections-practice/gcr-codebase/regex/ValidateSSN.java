
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {
    public static void main(String[] args) {
        String ssnInput="123-45-6789";
        Pattern pattern=Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
        Matcher matcher=pattern.matcher(ssnInput);
        if(matcher.matches()){
            System.out.println("Valid SSN: " + ssnInput);
        } else {
            System.out.println("Invalid SSN: " + ssnInput);
        }
        
    }
    
}
