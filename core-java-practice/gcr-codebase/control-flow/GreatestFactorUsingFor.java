import java.util.Scanner;

public class GreatestFactorUsingFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int largestFactor=1;
        for(int i=1;i<input;i++){
            if (input%i==0){
                if(i>largestFactor){
                    largestFactor=i;
                }
                
            }
        }
        System.out.println(largestFactor);
    }
    
}
