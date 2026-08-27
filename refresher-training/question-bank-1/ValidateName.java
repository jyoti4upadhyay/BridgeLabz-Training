import java.util.*;
import java.util.regex.*;

class ValidateName{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        Pattern p=Pattern.compile("[A-Za-z]+");
        Matcher m=p.matcher(str);
        if(m.matches()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}