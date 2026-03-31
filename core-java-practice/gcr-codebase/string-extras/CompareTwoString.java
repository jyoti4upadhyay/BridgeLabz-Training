import java.util.Scanner;

public class CompareTwoString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str2=sc.next();
        boolean flag=true;
        if(str.length()!=str2.length()){
            System.out.println("Both String are not equal");
        }
        else{
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)!=str2.charAt(i)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("Equal");
            }
            else{
                System.out.println("Not Equal");
            }

        }
    }






































    
}
