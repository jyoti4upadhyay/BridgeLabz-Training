import java.util.*;
public class CommonWordLength{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        CommonWordLength len=new CommonWordLength();
        System.out.println(len.calLength(str));
        
    }
    public String calLength(String word){
        String[] arr=word.split(" ");
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key=arr[i].length();
            if(hs.containsKey(arr[i].length())){
                hs.put(key,hs.get(key)+1);
            }
            else {
                hs.put(key,1);
            }
        }
        int freq=0;
        for(int key:hs.keySet()){
            if(freq<hs.get(key)){
                freq=hs.get(key); 
            }
        }
        System.out.println(freq);


    }
}