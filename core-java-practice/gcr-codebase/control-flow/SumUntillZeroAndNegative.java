import java.util.Scanner;

public class SumUntillZeroAndNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num=sc.nextInt();
        double totalsum=0.0;
        while(num>0){
            totalsum=totalsum+num;
            System.out.println("Enter number");
            num=sc.nextDouble();
        }
        
        System.out.println("Total Sum is "+totalsum);

        
    }
    
}
