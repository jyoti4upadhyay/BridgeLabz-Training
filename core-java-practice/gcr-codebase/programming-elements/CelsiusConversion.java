import java.util.Scanner;

public class CelsiusConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int celsius =sc.nextInt();
        double fahrenheit=(celsius*9/5)+32;
        System.out.println("celsius to fahrenheit is "+fahrenheit );


        
    }

    

}
