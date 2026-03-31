import java.util.Scanner;

public class SubString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String str=sc.nextLine();
        int startIndex=sc.nextInt();
        int endIndex=sc.nextInt();
        //built in;
        String sub=str.substring(startIndex,endIndex);
        String charSubString="";
        for(int i=startIndex;i<endIndex;i++){
            charSubString=charSubString+str.charAt(i);
        }
        if(sub.length()!=charSubString.length()){
            System.out.println("false");
        }
        else {
            boolean flag=true;
            for(int i=0;i<sub.length();i++){
                if(sub.charAt(i)!=charSubString.charAt(i)){
                    flag=false;
                    break;
                    
                }
            }
            System.out.println (flag);
        }
    }
}