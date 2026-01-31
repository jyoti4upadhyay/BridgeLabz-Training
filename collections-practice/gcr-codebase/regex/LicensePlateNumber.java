import java.util.*;
import java.util.regex.*;
public class LicensePlateNumber {
    public static void creation(String input){
        Pattern pattern=Pattern.compile("AB[1-9]{4}");
        Matcher matcher=pattern.matcher(input);

        if(matcher.matches()){
            System.out.println("Valid Plate Number");
        }
        else{
            System.out.println("Not valid");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter your Plate Number");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        LicensePlateNumber.creation(str);
    }
    
}
