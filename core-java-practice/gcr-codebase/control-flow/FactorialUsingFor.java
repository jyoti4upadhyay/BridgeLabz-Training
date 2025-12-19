import java.util.Scanner;

public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;num--){
            fact=fact*num;
        }
        System.out.println(fact);
    }
    
}
