import java.util.*;
import java.util.regex.*;

public class UserName{

    public static void Creation(String input){
        String regex="^[a-zA-Z][a-zA-Z)-9_]{5,15}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        if(matcher.matches()){
            System.out.println("Valid Username");
        }
        else{
            System.out.println("Please Input valid userName");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your String ");
        String str=sc.next();
        UserName.Creation(str);
    }
}