import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Reverse of "+str+" is "+reverse(str));
    }
    public static String reverse(String input){
        StringBuilder sb=new StringBuilder(input);
        return sb.reverse().toString();
    }

    
}
