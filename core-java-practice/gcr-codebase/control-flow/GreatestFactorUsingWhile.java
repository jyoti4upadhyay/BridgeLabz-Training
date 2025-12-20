import java.util.Scanner;

public class GreatestFactorUsingWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int largestFactor=1;
        int i=1;
        while(i<input){
            if (input%i==0){
                if(i>largestFactor){
                    largestFactor=i;
                }
                
            }
            i++;
        }
        System.out.println(largestFactor);
    }
    
}
