import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String revStr="";
        int len=str.length();
        char[] arr=new char[len];
        String res=sc.next();
        for(int i=0;i<len;i++){
            char ch=str.charAt(i);
            arr[i]=ch;
        }
        for(int i=0;i<len-1;i++){
            for(int j=1;j<len;j++){
                if(arr[i]==arr[j]){
                    continue;
                }
                res=res+arr[i];
            }
        }
        System.out.println(res);
    }
    
}
