import java.util.*;
class PalindromicString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<List<String>>ls =new ArrayList<>();
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            int listSize=sc.nextInt();
            List<String>list=new ArrayList<>();
            for(int j=0;j<listSize;j++){
                list.add(sc.next());
            }
            ls.add(list);
        }

    }
}