import java.util.*;

public class LexicalTwist{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String word1=sc.next();
        String word2=sc.next();
        LexicalTwist lt=new LexicalTwist();
        lt.cal(word1,word2);
    }
    public void cal(String fWord ,String sWord){
        StringBuilder first=new StringBuilder(fWord);
        StringBuilder sec=new StringBuilder(sWord);
        if(sec.reverse().toString().equalsIgnoreCase(first.toString())){
            String sb="";
            first.reverse();
            first.toString().toLowerCase();
            for(int i=0;i<first.length();i++){
                char ch=first.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u'){
                    sb=sb+'@';
                }
                else{
                    sb=sb+ch;
                    
                }
            }
            System.out.println(sb);
        }
        else if(!first.toString().equalsIgnoreCase(sec.toString())){
            String str=fWord.toUpperCase()+sWord.toUpperCase();
            List<Character> lsV=new ArrayList<>();
            List<Character> lsC=new ArrayList<>();
            int countV=0;
            int countC=0;
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch=='A'|| ch=='E' || ch=='I' || ch=='O'||ch=='U'){
                    countV++;
                    if(!lsV.contains(ch)){
                        lsV.add(ch);
                    }
                }
                else {
                    countC++;
                    if(!lsC.contains(ch)){
                        lsC.add(ch);
                    }
                }
            }
            
            if(countV>countC){
                System.out.print(lsV.get(0));
                System.out.print(lsV.get(1));
            }
            else if(countV<countC){
                System.out.print(lsC.get(0));
                System.out.print(lsC.get(1));
            }
            else{
                System.out.println("Vowels and consonants are equal");
            }
        }
    }
}