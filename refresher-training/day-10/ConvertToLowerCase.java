import java.util.Scanner;
public class ConvertToLowerCase {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String str=sc.nextLine();
        String  res="";
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
            }
            res=res+ch;

        }
        System.out.println(res);

    }
    
}
