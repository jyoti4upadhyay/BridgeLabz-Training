import java.util.Scanner;

public class SumUntillZero {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter number");
        double num=sc.nextDouble();
        double totalsum=0.0;
        while(num!=0.0){
            totalsum=totalsum+num;
            System.out.println("Enter number");
            num=sc.nextDouble();
        }
        
        System.out.println("Total Sum is "+totalsum);

    }
    
}
