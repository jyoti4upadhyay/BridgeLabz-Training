import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int val1=sc.nextInt();
        int val2=sc.nextInt();
        int val3=sc.nextInt();
        int avg=(val1+val2+val3)/3;
        System.out.println("The Avg of three number is "+avg);
        
    }
    
}
