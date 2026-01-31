import java.util.Scanner;
import java.util.regex.*;
public class HexColor {

    public static void checkHexColor(String input){
        Pattern pattern =Pattern.compile("#[0-9A-fa-f]{6}");
        Matcher matcher=pattern.matcher(input);
        boolean res=matcher.matches();
        if(res==true){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your ColorCode");
        String str=sc.next();

        HexColor.checkHexColor(str);

    }
    
}
