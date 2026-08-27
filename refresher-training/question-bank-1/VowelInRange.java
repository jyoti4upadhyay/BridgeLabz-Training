import java.util.*;

class VowelInRange{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=5;
        List<String> word=new ArrayList<>();
        for(int i=0;i<num;i++){
            word.add(sc.next());
        }
        int q=3;
        List<String>queries=new ArrayList<>();
        for(int i=0;i<q;i++){
            queries.add(sc.next()); //l-r
        }

        List<String>result=new ArrayList<>();
        for(int i=0;i<word.size();i++){
            String str=word.get(i);
            str=str.toLowerCase();
            int len=str.length()-1;
            if((str.charAt(0)=='a' || str.charAt(0)=='e' || str.charAt(0)=='i' || str.charAt(0)=='o' || str.charAt(0)=='u') &&
            (str.charAt(len)=='a' || str.charAt(len)=='e' || str.charAt(len)=='i' || str.charAt(len)=='o' || str.charAt(len)=='u')){
                result.add(str);
            }
        }
        for(int i=0;i<queries.size();i++){
            String[] arr=queries.get(i).split("-");
            int l=Integer.parseInt(arr[0]);
            int r=Integer.parseInt(arr[1]);

            for(int j=l-1;j<r;j++){
                if(result.contains(word.get(j))){
                    System.out.print(word.get(j)+" ");
                }
            }
            System.out.println();
        }



    }
}