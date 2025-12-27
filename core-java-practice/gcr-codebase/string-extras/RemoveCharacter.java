import java.util.Scanner;

public class RemoveCharacter {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char chr=sc.next().charAt(0);
        String res="";
        int len=str.length();
        for(int i=0;i<len;i++){
            char ch=str.charAt(i);
            if(ch==chr){
                continue;
            }
            res=res+ch;
        }
        System.out.println("reverse String is "+res);
    }
    

}