import java.util.*;
class WatchList{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int movies=sc.nextInt();
        int[] duration=new int[movies];
        int[] rating=new int[movies];
        int limit=sc.nextInt();
        System.out.println(WatchScore(limit,duration,rating));
    }
    public static int WatchScore(int limit,int[] duration,int[] rating){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<duration.length;i++){
            int sum=0;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<i+limit;j++){
                if(min>rating[j]){
                    min=rating[j];
                }
                sum=sum+duration[j];
            }
            int score=sum+min;
            if(score>max){
                max=score;
            }
        }
        return max;

    }
}