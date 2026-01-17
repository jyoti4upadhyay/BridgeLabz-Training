import java.util.*;
public class SearchWords {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] sentence_arr={
            "My name is Jyoti",
            "Hello world",
            "Hii there How are you"
        };  
        String fWord=sc.next();
        System.out.println(findWord(sentence_arr, fWord));
    }
    public static String findWord(String[] arr,String word){
        for(int i=0;i<arr.length;i++){
            if(arr[i].contains(word)){
                return arr[i];
            }
        }
        return "Not Found";
    }    
}
