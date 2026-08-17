import java.util.Scanner;
public class VowelAndConsonent {
    public static void main(String[] args) {
        System.out.println("Enter your String ");

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int countV=0;
        int countC=0;

        String res="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                ch=(char)(ch-32);

            }
            res=res+ch;

        }
        for(int i=0;i<res.length();i++){
            char ch=res.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                countV++;
            }
            else {
                countC++;
            }

        }
        System.out.println("vowels are "+countV);
        System.out.println("consonants are "+countC);
    }
}
