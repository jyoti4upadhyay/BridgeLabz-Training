import java.util.Scanner;
public class FitnessChallengeTracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] pushups=new int[7];
        int totalPushups=0;
        int activeDays=0;
        System.out.println("Enter your this week pushups");
        for(int i=0;i<7;i++){
            pushups[i]=sc.nextInt();
        }

        for(int count:pushups){
            if(count==0){
                //rest day
                continue;
            }
            totalPushups+=count;
            activeDays++;
        }
        Double Avg=(double)totalPushups/activeDays;
        System.out.println("total pushups are "+totalPushups);
        System.out.println("Avg pushups are "+Avg);



        
    }

    
}
