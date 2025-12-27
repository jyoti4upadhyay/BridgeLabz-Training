import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String revStr="";
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            char ch=str.charAt(i);
            revStr=revStr+ch;
        }
        if(str.equals(revStr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
    }
    
    
}
