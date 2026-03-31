import java.util.Scanner;

public class Equals{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your String ");
        String str1=sc.nextLine();
        System.out.println("Enter Your String ");
        String str2=sc.nextLine();
        boolean flag=true;
        if(str1.length() != str2.length()){
            System.out.println("Both strings length are not equals");
        }
        else{
            int size=str1.length();
            for(int i=0;i<size;i++){
                if(str1.charAt(i)!=str2.charAt(i)){
                    flag=false;
                }
                
            }
            System.out.println(flag);
        }
        // Using built-in method
        System.out.println(str1.equals(str2));
    }
}