import java.util.*;
public class ConcatenateString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many words do u want to add ");
        int size=sc.nextInt();
        String[] arr=new String[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.next();
        }
        System.out.print(concatenate(arr));
    }
    public static String concatenate(String[] input){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<input.length;i++){
            sb.append(input[i]);
        }
        return sb.toString();
    }
    
}
