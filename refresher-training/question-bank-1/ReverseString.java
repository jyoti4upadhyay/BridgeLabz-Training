import java.util.*;
import java.util.regex.*;

class ReverseString{
    public static String reverse(String word)throws IllegalArgumentException{
        Pattern p=Pattern.compile("[A-Za-z]+");
        Matcher matcher=p.matcher(word);
        if(!matcher.matches()){
            throw new IllegalArgumentException("Invalid String");
        }
        String rev="";
        for(int i=word.length()-1;i>=0;i--){
            rev=rev+word.charAt(i);
        }
        return rev;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        try{
        String str=sc.next();
        System.out.println(reverse(str));
    
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}