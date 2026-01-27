import java.util.InputMismatchException;
import java.util.Scanner;
public class Division {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try {
            int num=sc.nextInt();
            int deno=sc.nextInt();
            int division=num/deno;
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divided By zero");
        }catch(InputMismatchException e){
            System.out.println("Invalid Input");
        }

    }
    
}
