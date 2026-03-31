import java.util.Scanner;
public class SumUsingFor {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=(num*(num+1))/2;
        int for_sum=0;
        for(int i=1;i<=num;i++){
            for_sum=for_sum+i;
        }
        if(sum==for_sum){
            System.out.println(" both result of sum are equal");
        }
        else {
            System.out.println("both Sum are not equal");
        }
       
        
    }
}
