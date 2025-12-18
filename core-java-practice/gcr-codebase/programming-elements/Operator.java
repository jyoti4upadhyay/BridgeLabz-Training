import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int remainder=num2%num1;
        int quotient=num2/num1;
        System.out.println("The Quotient is "+quotient+" and Reminder is "+" of two number"+" and " +remainder);

    }
    
}
