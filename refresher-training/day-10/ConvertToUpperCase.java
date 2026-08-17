import java.util.Scanner;
public class ConvertToUpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                ch=(char)(ch-32);
            }
            res=res+ch;
        }
        System.err.println(res);

    }
    
}
