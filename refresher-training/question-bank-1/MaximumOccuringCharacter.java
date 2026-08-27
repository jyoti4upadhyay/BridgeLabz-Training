import java.util.*;

class MaximumOccuringCharacter{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String str=sc.next();
        MaximumOccuringCharacter mo=new MaximumOccuringCharacter();
        mo.maxFrequency(str);
    }
    public void maxFrequency(String word){
        HashMap<Character,Integer>hs=new HashMap<>();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(hs.containsKey(ch)){
                hs.put(ch,hs.get(ch)+1);
            }
            else{
                hs.put(ch,1);
            }

        }
        int max=Integer.MIN_VALUE;
        char s='\0';
        for(char key:hs.keySet()){
            if(max<hs.get(key)){
                max=hs.get(key);
                s=key;
            }
        }
        int count=0;
        for(char key:hs.keySet()){
            if(max==hs.get(key)){
                count++;
            }
        }
        if(count>1){
            System.out.println("tie");
        }
        else{
        System.out.println(max);
        System.out.println(s);
        }

    }

}
