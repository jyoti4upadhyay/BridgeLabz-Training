import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int cp_num=num;
        int fact=1;
        while(num>=1){
            fact=fact*num;
            num--;
        }
        System.out.println("The Factorial of "+cp_num+" is "+fact);

    }
    
}
