import java.util.Scanner;
public class PowerCal {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int exponent=sc.nextInt();
        int pow=(int)Math.pow(base,exponent);
        System.out.println("The power of "+base+" is "+pow);
    }
    
}
