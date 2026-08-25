import java .util.*;

class FlipKey{
    public String cleanseAndInvert(String input){
        if(input.length()<=6){
            return null;
        }
        else if(input.matches("^[A-Za-z]")){
            return null;
        }
        input.toLowerCase();
        StringBuilder str=new StringBuilder("");
        for(int i=0;i<input.length();i++){
            int cht=(int)input.charAt(i);
            if(cht%2!=0){
                str.append(input.charAt(i));  
            }
        }
        str.reverse();
        String sb=str.toString();
        String result="";
        for(int i=0;i<sb.length();i++){
            if(i%2==0){
               result=result+Character.toUpperCase(sb.charAt(i));
            }
            else {
                result=result+sb.charAt(i);
            }
        }
        return result;
        
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        FlipKey key=new FlipKey();
        String res=key.cleanseAndInvert(s);
        System.out.println(res);


    }
}