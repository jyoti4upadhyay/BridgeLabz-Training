import java.util.*;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int TotalStudent=sc.nextInt();
        int[] height=new int[TotalStudent];
        for(int i=0;i<TotalStudent;i++){
            height[i]=sc.nextInt();

        }
        int sum=0;
        for(int i=0;i<TotalStudent;i++){
            sum=sum+height[i];
        }
        int mean=sum/TotalStudent;
        System.err.println("Mean is "+mean);
    }
    
}
