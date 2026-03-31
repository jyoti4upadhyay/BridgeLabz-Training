import java.util.Scanner;

public class BonusCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary=sc.nextInt();
        System.err.println("Enter your year of service");
        int year=sc.nextInt();
        if(year>=5){
            float bonus=salary*(0.05f);
            System.out.println("The person's bonus is "+ bonus);
        }
    }
    
}
