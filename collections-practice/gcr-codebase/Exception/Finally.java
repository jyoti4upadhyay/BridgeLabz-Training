import java.util.*;


public class Finally{
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        try {
            int num=sc.nextInt();
            int demo=sc.nextInt();
            int division=num/demo;
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero");
        }
        finally{
            System.out.println("Operation done ");
        }
    }
}