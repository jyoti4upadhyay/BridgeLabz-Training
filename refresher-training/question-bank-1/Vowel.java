import java.util.*;

public class Vowel{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split("\\s+");
        comparison(arr);
    }
    public  static void comparison(String[] list){
        List<String> res=new ArrayList<>();
        for(int i=0;i<list.length;i++){
            String str=list[i];
            int len=str.length()-1;
            str=str.toLowerCase();
            if((str.charAt(0)=='a' || str.charAt(0)=='e' || str.charAt(0)=='i' || str.charAt(0)=='o' || str.charAt(0)=='u')&& (str.charAt(len)=='a' || str.charAt(len)=='e' || str.charAt(len)=='i' || str.charAt(len)=='o' || str.charAt(len)=='u')){
                res.add(str);
            }
        }
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }

    }
}