import java.util.Scanner;
import java.util.regex.*;
public class EmailAddress {
    public static void checkEmail(String input){
        Pattern pattern=Pattern.compile("[a-z0-9]+@[a-z]+.[a-z]+");
        Matcher matcher=pattern.matcher(input);
        boolean res=matcher.matches();
        if(res==true){
            System.out.println(input);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String[] words =sentence.split(" ");
        for(String word:words){
            EmailAddress.checkEmail(word);
        }
    }
    
}
