import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] word=str.split(" ");
        String longest="";

        for(int i=0;i<word.length;i++){
            if(word.length>longest.length()){
                longest=word[i];
            }
        }
        System.err.println(longest);
    }
    
}
