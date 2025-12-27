import  java.util.Scanner;
public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String res="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&& ch<='z'){
                ch=(char)(ch-32);
            }
            res=res+ch;
        }

        int countV=0;
        int countC=0;
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)=='A' || res.charAt(i)=='E' ||res.charAt(i)=='I' ||res.charAt(i)=='O' ||res.charAt(i)=='U' ){
                countV++;
            }
            else{
                countC++;
            }
        }
        System.out.println("consonants are"+countC+"Vowels are "+countV);
    }
    
}
