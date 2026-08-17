import java.util.Scanner;

public class CharArray{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your String");
        String str=sc.nextLine();
        int size=str.length();
        char[] strarr=new char[size];
        for(int i=0;i<str.length();i++){
            strarr[i]=str.charAt(i);
        }
        char[] chararr=str.toCharArray();
        
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            if(strarr[i] != chararr[i]){
                flag=false;
                break;
            }
            
        } 
        // strarr == user defined arr;
        for(int i=0;i<size;i++){
            System.out.print(strarr[i]+" ");
        }
        System.out.println("");
        // builtin toCharArray is used; 
        for(int i=0;i<size;i++){
            System.out.print(chararr[i]+" ");
        }
        System.out.println("");
        
        System.out.println(flag);
    }
}
