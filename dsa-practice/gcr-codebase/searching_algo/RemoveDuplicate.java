import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(duplicate(str));
    }
    public static String duplicate(String input){
        Set<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();


    }
}
