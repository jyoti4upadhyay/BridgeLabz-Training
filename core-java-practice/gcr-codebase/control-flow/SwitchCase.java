import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1= sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String opt = sc.next();

        switch (opt) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result: " + (num1- num2));
                break;
            case "*":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "/":
                if (second != 0)System.out.println("Result: " + (num1 / num2));
                else System.out.println("Division by zero is not allowed");
                break;
            default:
                System.out.println("Invalid Operator");
        }

    }
}
