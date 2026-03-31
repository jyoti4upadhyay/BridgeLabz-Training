import java.util.Scanner;
public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float number1=sc.nextFloat();
        float number2=sc.nextFloat();
        float addition =number1+number2;
        float subtraction=number2-number1;
        float multiplication=number1*number2;
        float division=number2/number1;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+ addition +" , "+subtraction+" , "+multiplication+" , "+division);
        
    }
    
}
