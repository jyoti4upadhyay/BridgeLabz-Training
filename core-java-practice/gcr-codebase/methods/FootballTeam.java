import java.util.*;
public class FootballTeam {
    int sum=0;
    public int [] checkheight(int[] heights,int meanHeight,int totalPlayers,int shorts ,int tall){
        for(int i=0;i<heights.length;i++){
            sum=sum+heights[i];
        }
        for(int i=0;i<totalPlayers;i++){
            if(heights[i]>tall){
                tall=heights[i];
            }
            else if(heights[i]<shorts) {
                shorts=heights[i];  
            }
        }
        meanHeight=sum/totalPlayers;
        return new int[]{meanHeight,shorts,tall};

    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int totalPlayers=11;
        int[] arr=new int[totalPlayers];
        System.out.println("Enter the heights of each player in range 150 cms to 250 cms");
        for(int i=0;i<totalPlayers;i++){
            arr[i]=sc.nextInt();
        }
        int shortheight=Integer.MAX_VALUE;
        int tallheight=Integer.MIN_VALUE;
        int meanHeight=0;
        FootballTeam ft=new FootballTeam();
        int result[]= ft.checkheight(arr,meanHeight,totalPlayers,shortheight,tallheight);
        System.out.println("MeanHeight is "+result[0]+"ShortHeight is "+result[1]+" TallHeight is "+result[2]);



    }
    
}
