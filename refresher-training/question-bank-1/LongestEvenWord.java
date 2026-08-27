import java.util.*;
public class LongestEvenWord{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        int maxlen=Integer.MIN_VALUE;
        for(int i=0;i<words.length;i++){
            int len=words[i].length();
            if(maxlen<len && len%2==0){
                maxlen=len;
            }
        }
        System.out.println(maxlen);
    }

}