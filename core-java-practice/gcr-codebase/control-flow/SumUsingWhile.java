import java.util.Scanner;
public class SumUsingWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum1=(num*(num+1))/2;
        int sum2=0;

        while(num>0){
            sum2=sum2+num;
            num--;
        }
        if(sum1==sum2){
            System.out.println("Both results are equal");
        }
        else {
            System.out.println("Both results are not equal");
        }

        
        
    }
    
}
