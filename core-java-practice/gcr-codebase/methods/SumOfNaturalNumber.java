import java.util.Scanner;
public class SumOfNaturalNumber {
    public int sumval(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        SumOfNaturalNumber sumnum=new SumOfNaturalNumber();
        int sum_result=sumnum.sumval(num);

        
    }
    
}
